package info.tAIR.tAIRApp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

	public class AndDevActivity extends Activity {
		@Override
		public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
			
	        setContentView(R.layout.anddevtab);
	        final Button button01 = (Button)
	        findViewById(R.id.Button01);
	        button01.setOnClickListener(new OnClickListener() {
	            public void onClick(View v) {
	                 //Perform action on click
	            	 Uri uri = Uri.parse("http://developer.android.com/sdk/index.html");
	            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
	            	 startActivity(intent);
	             }
            });
	            	           
	        final Button button02 = (Button)
	        findViewById(R.id.Button02);
	        button02.setOnClickListener(new OnClickListener() {
		            public void onClick(View v) {
//		                 //Perform action on click
		            	 Uri uri = Uri.parse("http://developer.android.com/guide/index.html");
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
		            	 Uri uri = Uri.parse("http://developer.android.com/reference/packages.html");
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
		            	 Uri uri = Uri.parse("http://developer.android.com/resources/index.html");
		            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		            	 startActivity(intent);
		             }
                });
		            	 
 		        final Button button05 = (Button)
		        findViewById(R.id.Button05);
		        button05.setOnClickListener(new OnClickListener() {
		            public void onClick(View v) {
		            	//Perform action on click
		            	 Uri uri = Uri.parse("https://groups.google.com/forum/#!forum/android-developers");
		            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		            	 startActivity(intent);
		             }
                });
		        
	 		   final Button button06 = (Button)
			   findViewById(R.id.Button06);
			   button06.setOnClickListener(new OnClickListener() {
			       public void onClick(View v) {
			         	//Perform action on click
			         	 Uri uri = Uri.parse("mailto:android-developers@googlegroups.com?body=\n\n\n\n\nSent from tAIR Companion App");
			           	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			           	 startActivity(intent);
			         }			       
                });
		        }
	}
	
