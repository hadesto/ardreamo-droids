package summer.proj;
// Using this activity to practice using resources using JAVA

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.view.ViewGroup.LayoutParams;
import android.widget.ScrollView;


public class DroidActivity3 extends Activity {

	// create the view for this activity screen
	ScrollView sv;
	// Creates a new Layout Object
	LinearLayout layoutTheHardWay;
	// sets the layouts height and width
	LayoutParams layoutWidthHeight;
	// contains the picture to be displayed
	ImageView imageContainer;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// Removed this to create the layout in JAVA
		//setContentView(R.layout.second);
		
		
		// create the view for this activity screen
		sv = new ScrollView(getApplicationContext());
		// Creates a new Layout Object
		layoutTheHardWay = new LinearLayout( getApplicationContext() );
		// sets the layouts height and width
		layoutWidthHeight = new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT);
		// contains the picture to be displayed
		imageContainer = new ImageView(getApplicationContext());
		
		// Setting the layout properties
		layoutTheHardWay.setOrientation(LinearLayout.HORIZONTAL);
		layoutTheHardWay.setLayoutParams(layoutWidthHeight);
		
		// Set the image for the image view container
		imageContainer.setImageResource(R.drawable.roadrunner);
		
		// add the image view to this layout
		layoutTheHardWay.addView(imageContainer);
		
		// set the layout for the activity view
		sv.addView(layoutTheHardWay);
		
		setContentView(sv);
		
		
	}
	
//	@Override
//	public boolean onTouchEvent(MotionEvent event) {
//		
//		// to do this you had to import the INTENT class.
//		startActivity(new Intent (getApplicationContext(), DroidActivity.class) );
//		
//		// setup log to detect touch
//		Log.i("infoLogs","Detected Touch. Switching to Activity 1");
//		
//		// according to the API, return true if the event has been consumed
//		return true;
//	
//	}
	

}
