package com.androidbook.btdt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class QuizMenuActivity extends Activity {
    public static final String GAME_PREFERENCES = "GamePrefs";

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    	ListView menuList = (ListView) findViewById(R.id.ListView_Menu);
    	String[] items={ getResources().getString(R.string.menu_item_play),
			getResources().getString(R.string.menu_item_scores),
			getResources().getString(R.string.menu_item_settings),
			getResources().getString(R.string.menu_item_help)};
    
    	ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.menu_item, items);
    	
    	menuList.setAdapter(adapt);
    	
    	
    
    
    }
    
    
}