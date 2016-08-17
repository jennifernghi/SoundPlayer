package com.example.android.soundplayer;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jennifernghinguyen on 8/13/16.
 * this class partially implements MusicControlInterface
 * this class override some basic methods to control a song
 */
public abstract class MusicControlBasic extends AppCompatActivity implements MusicControlInterface {
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

    @Override
    public void getPlaylist() {
        //get playlist
    }
}
