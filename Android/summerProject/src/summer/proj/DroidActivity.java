package summer.proj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class DroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // add a log tag to know when the activity is created
        Log.i("infoLogs","Activity created. Custom Log");
        
    }
    
    // Hour 3: Exercise 2, adding the required stubs for , start, pause, destroy, resume
    public void onStart( Bundle savedInstanceState){
    	super.onStart();  	
    	Log.i("infoLogs","Activity Destroyed. Custom Log");
    }

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("infoLogs","Activity Destroyed. Custom Log");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("infoLogs","Activity Paused. Custom Log");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("infoLogs","Activity Restarted. Custom Log");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("infoLogs","Activity Resumed. Custom Log");
	}

/*	@Override
	public boolean onTouchEvent(MotionEvent event) {
		
		// to do this you had to import the INTENT class.
		startActivity(new Intent (getApplicationContext(), DroidActivity3.class) );
		
		Log.i("infoLogs","Detected Touch. Switching to Activity3");

		// according to the API, return true if the event has been consumed
		return true;

		
	}*/
    

}