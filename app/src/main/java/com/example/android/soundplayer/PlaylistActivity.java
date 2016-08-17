package com.example.android.soundplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class PlaylistActivity extends MusicControlBasic {

    private LinearLayout currentPlayingLinearLayout;
    private FloatingActionButton floatingActionButton;
    private LinearLayout customList1;
    private LinearLayout customList2;
    private LinearLayout hiphopList;
    private LinearLayout popList;
    private LinearLayout rockList;
    private LinearLayout movieList;
    private LinearLayout danceList;
    public LinearLayout getCurrentPlayingLinearLayout(){
        return currentPlayingLinearLayout = (LinearLayout) findViewById(R.id.current_playing_layout);
    }
    public FloatingActionButton getFloatingActionButton(){
        return floatingActionButton= (FloatingActionButton) findViewById(R.id.fab);
    }
    public LinearLayout getCustomList1(){
        return customList1 = (LinearLayout)findViewById(R.id.custom_list_1);
    }
    public LinearLayout getCustomList2(){
        return customList2 = (LinearLayout)findViewById(R.id.custom_list_2);
    }
    public LinearLayout getHiphopList(){
        return hiphopList = (LinearLayout)findViewById(R.id.hiphop_list);
    }
    public LinearLayout getPopList(){
        return popList = (LinearLayout)findViewById(R.id.pop_list);
    }
    public LinearLayout getRockList(){
        return rockList = (LinearLayout)findViewById(R.id.rock_list);
    }
    public LinearLayout getMovieList(){
        return movieList = (LinearLayout)findViewById(R.id.movie_list);
    }
    public LinearLayout getDanceList(){
        return danceList = (LinearLayout)findViewById(R.id.dance_list);
    }
    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setActionBarTitle(getString(R.string.playlists));
        getFloatingActionButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlaylistActivity.this, getString(R.string.unavailable_message), Toast.LENGTH_SHORT).show();
            }
        });
        setOnClickListener(getCustomList1(), Custom1TrackActivity.class);
        setOnClickListener(getCustomList2(), Custom2TrackActivity.class);
        setOnClickListener(getHiphopList(), HiphopTracksActivity.class);
        setOnClickListener(getPopList(), PopTracksActivity.class);
        setOnClickListener(getRockList(), RockTracksActivity.class);
        setOnClickListener(getMovieList(), MovieTracksActivity.class);
        setOnClickListener(getDanceList(), DanceTracksActivity.class);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                Intent intent = new Intent(this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    protected void sendIntent(Class<?> cls){
        Intent intent = new Intent(this, cls);
        startActivity(intent);

    }
    protected void setOnClickListener(LinearLayout linearLayout, final Class<?> cls){
        linearLayout.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendIntent(cls);

            }
        });
    }
}
