package com.androidbook.btdt.hour6;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class QuizSettingsActivity extends Activity {
    public static final String GAME_PREFERENCES = "GamePrefs";
    
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }       
}