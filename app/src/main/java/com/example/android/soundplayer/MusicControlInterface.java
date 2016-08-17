package com.example.android.soundplayer;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by jennifernghinguyen on 8/13/16.
 * this interface contains essential methods to control music
 */
public interface MusicControlInterface {
    void play();
    void pause();
    void fastForward();
    void rewind();
    void next();
    void previous();
    void shuffle();
    void autoRepeat();
    void getSong();
    void getPlaylist();
}
