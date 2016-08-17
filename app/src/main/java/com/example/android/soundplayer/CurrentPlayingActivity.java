package com.example.android.soundplayer;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class CurrentPlayingActivity extends MusicControlBasic{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_playing);
        setTitle(getString(R.string.current_playing));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFormat(PixelFormat.RGBA_8888);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void play(){
        // play music when user hit play button or a song
    }

    @Override
    public void pause() {
        //pause music when user hit pause button
    }

    @Override
    public void getSong() {
        //code to get a song
    }

    @Override
    public void shuffle() {
        //code to shuffle the list
    }

    @Override
    public void autoRepeat() {
        //code to autorepeat the song
    }

    @Override
    public void next() {
        //code to skip to the next song
    }

    @Override
    public void previous() {
        //code to skip to the previous song
    }

    @Override
    public void rewind() {
        //code to rewind the song
    }

    @Override
    public void fastForward() {
        //code to fast forward a sonf
    }
}
