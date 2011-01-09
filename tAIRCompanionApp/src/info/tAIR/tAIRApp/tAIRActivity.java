package info.tAIR.tAIRApp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

	public class tAIRActivity extends Activity {
		@Override
		public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
			
	        setContentView(R.layout.tairtab);
	        final Button button01 = (Button)
	        findViewById(R.id.Button01);
	        button01.setOnClickListener(new OnClickListener() {
	            public void onClick(View v) {
	                 //Perform action on click
	            	 Uri uri = Uri.parse("http://www.tair.info/messages");
	            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
	            	 startActivity(intent);
	             }
            });
	            	           
	        final Button button02 = (Button)
	        findViewById(R.id.Button02);
	        button02.setOnClickListener(new OnClickListener() {
		            public void onClick(View v) {
//		                 //Perform action on click
		            	 Uri uri = Uri.parse("http://www.tair.info/block-images");
		            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		            	 startActivity(intent);
		             }
            });
//
		        final Button button03 = (Button)
		        findViewById(R.id.Button03);
		        button03.setOnClickListener(new OnClickListener() {
		            public void onClick(View v) {
//		                 //Perform action on click
		            	 Uri uri = Uri.parse("http://www.tair.info/source-code");
		            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		            	 startActivity(intent);
		             }
                });
//			            
		        final Button button04 = (Button)
		        findViewById(R.id.Button04);
		        button04.setOnClickListener(new OnClickListener() {
		            public void onClick(View v) {
//		                 //Perform action on click
		            	 Uri uri = Uri.parse("http://www.tair.info/tutorials");
		            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		            	 startActivity(intent);
		             }
                });
		            	 
 		        final Button button05 = (Button)
		        findViewById(R.id.Button05);
		        button05.setOnClickListener(new OnClickListener() {
		            public void onClick(View v) {
		            	//Perform action on click
		            	 Uri uri = Uri.parse("http://www.tair.info/other-resources");
		            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		            	 startActivity(intent);
		             }
                });
				            	 
 		        final Button button06 = (Button)
		        findViewById(R.id.Button06);
		        button06.setOnClickListener(new OnClickListener() {
		        	public void onClick(View v) {
		                 //Perform action on click
						 Uri uri = Uri.parse("http://www.tair.info/android-sdk-1");
					   	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
					   	 startActivity(intent);
		             }
                });
						            	 
 		        final Button button07 = (Button)
		        findViewById(R.id.Button07);
		        button07.setOnClickListener(new OnClickListener() {
		            public void onClick(View v) {
		            	//Perform action on click
		            	 Uri uri = Uri.parse("http://www.tair.info/contact-us");
		            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		            	 startActivity(intent);
		             }
                });
		}
	}
	
