package info.tAIR.tAIRApp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class CodeActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.codetab);
        final Button button01 = (Button)
        findViewById(R.id.Button01);
        button01.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                 //Perform action on click
           	 Uri uri = Uri.parse("http://code.google.com/p/the-ai-repository");
        	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        	 startActivity(intent);
            }
        });

        final Button button02 = (Button)
        findViewById(R.id.Button02);
        button02.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                 //Perform action on click
            	 Uri uri = Uri.parse("http://code.google.com/p/the-ai-repository/downloads/list");
            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            	 startActivity(intent);
            }
        });
            	 
        final Button button03 = (Button)
        findViewById(R.id.Button03);
        button03.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                 //Perform action on click
            	 Uri uri = Uri.parse("http://code.google.com/p/the-ai-repository/source/browse/");
            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            	 startActivity(intent);
            }
        });
		
        final Button button04 = (Button)
        findViewById(R.id.Button04);
        button04.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                 //Perform action on contributors click
            	Intent contribIntent = new Intent();
            	contribIntent.setClassName("info.tAIR.tAIRApp", "info.tAIR.tAIRApp.ContributorActivity");
            	startActivity(contribIntent); 
            }
            });
 	            	 
        final Button button05 = (Button)
        findViewById(R.id.Button05);
        button05.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                 //Perform action on click
            	Toast.makeText(CodeActivity.this, "tAIR Companion App v2.0\n\n  Copyright @ 2010-2011\n\n    http://www.tAIR.info", Toast.LENGTH_LONG).show();
            	}
        	});
    }
}
