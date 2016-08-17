package com.example.android.soundplayer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    private LinearLayout workoutLayout;
    private LinearLayout moodyLayout;
    private LinearLayout studyLayout;
    private LinearLayout summerLayout;
    private LinearLayout lullabyLayout;
    private LinearLayout hiphopLayout;
    private LinearLayout popLayout;
    private LinearLayout rockLayout;
    private LinearLayout movieLayout;
    private LinearLayout danceLayout;

    public Home() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        workoutLayout = (LinearLayout) view.findViewById(R.id.work_out_layout);
        moodyLayout = (LinearLayout) view.findViewById(R.id.moody_layout);
        studyLayout = (LinearLayout) view.findViewById(R.id.study_layout);
        summerLayout = (LinearLayout) view.findViewById(R.id.summer_layout);
        lullabyLayout = (LinearLayout) view.findViewById(R.id.lullaby_layout);
        hiphopLayout = (LinearLayout) view.findViewById(R.id.hiphop_layout);
        popLayout = (LinearLayout) view.findViewById(R.id.pop_layout);
        rockLayout = (LinearLayout) view.findViewById(R.id.rock_layout);
        movieLayout = (LinearLayout) view.findViewById(R.id.movie_layout);
        danceLayout = (LinearLayout) view.findViewById(R.id.dance_layout);
        setOnClickListener(workoutLayout, WorkoutTracksActivity.class);
        setOnClickListener(moodyLayout, MoodyTracksActivity.class);
        setOnClickListener(studyLayout, StudyTracksActivity.class);
        setOnClickListener(summerLayout, SummerTracksActivity.class);
        setOnClickListener(lullabyLayout, LullabyTracksActivity.class);
        setOnClickListener(hiphopLayout, HiphopTracksActivity.class);
        setOnClickListener(popLayout, PopTracksActivity.class);
        setOnClickListener(rockLayout, RockTracksActivity.class);
        setOnClickListener(movieLayout, MovieTracksActivity.class);
        setOnClickListener(danceLayout, DanceTracksActivity.class);

        return view;
    }

    protected void sendIntent(Class<?> cls) {
        Intent intent = new Intent(getContext(), cls);
        startActivity(intent);

    }

    protected void setOnClickListener(LinearLayout linearLayout, final Class<?> cls) {
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendIntent(cls);

            }
        });
    }

    public void getPlaylist(){
        //code to get playlists
    }
}
