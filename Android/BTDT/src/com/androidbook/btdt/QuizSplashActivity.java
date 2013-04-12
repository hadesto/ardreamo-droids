package com.androidbook.btdt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class QuizSplashActivity extends Activity {
    public static final String GAME_PREFERENCES = "GamePrefs";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        // Animate Title View Object
        TextView logo1 		= (TextView) findViewById(R.id.TextViewTopTitle);
        Animation fade1 	= AnimationUtils.loadAnimation(this, R.anim.fade_in);
        logo1.startAnimation(fade1);
        
        
        // animations can also be done for multiple View objects at a time. This is done by assigning the desired View objects to a 
        // animation controller
        Animation spinin = AnimationUtils.loadAnimation(this, R.anim.custom_anim);
        // this is the controller
        LayoutAnimationController controller = new LayoutAnimationController(spinin);
        // declaring the parent view
        TableLayout table = (TableLayout) findViewById(R.id.TableLayout01);
        // animate each element in the table group
        for (int i = 0; i < table.getChildCount(); i++)	{
        	TableRow row = (TableRow) table.getChildAt(i);
        	row.setLayoutAnimation(controller);
        }
        
        
        // animation for fading into the menu activity 
        TextView logo2	= (TextView) findViewById(R.id.TextViewBottomTitle);
        Animation fade2 = AnimationUtils.loadAnimation(this, R.anim.fade_in2);
        fade2.setAnimationListener(new AnimationListener() {
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				startActivity(new Intent(QuizSplashActivity.this, QuizMenuActivity.class));
				QuizSplashActivity.this.finish();
				
			}

			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}
		});
        
        logo2.startAnimation(fade2);
    }
    
    protected void onPause() {
    	super.onPause();
    	
    	//Stop the animation
    	TextView logo1 = (TextView) findViewById(R.id.TextViewTopTitle);
    	logo1.clearAnimation();
    	
    	TextView logo2 = (TextView) findViewById(R.id.TextViewBottomTitle);
    	logo2.clearAnimation();
    	
    	// ... stop other animations
    	TableLayout table = (TableLayout) findViewById(R.id.TableLayout01);
    	for (int i = 0; i < table.getChildCount(); i++) {
    		TableRow row = (TableRow) table.getChildAt(i);
    		row.clearAnimation();
    	}
    }
}