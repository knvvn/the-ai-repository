package info.tAIR.tAIRApp;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class tAIRTabWidget extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, tAIRActivity.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("tair").setIndicator("tAIR",
                          res.getDrawable(R.drawable.ic_tab_tair))
                      .setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, GroupActivity.class);
        spec = tabHost.newTabSpec("group").setIndicator("Discuss",
                          res.getDrawable(R.drawable.ic_tab_group))
                      .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, CodeActivity.class);
        spec = tabHost.newTabSpec("code").setIndicator("Code",
                          res.getDrawable(R.drawable.ic_tab_code))
                      .setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, AIActivity.class);
        spec = tabHost.newTabSpec("aiforum").setIndicator("AI Forums",
                          res.getDrawable(R.drawable.ic_tab_ai))
                      .setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, AndDevActivity.class);
        spec = tabHost.newTabSpec("anddev").setIndicator("Android Developer",
                          res.getDrawable(R.drawable.ic_tab_anddev))
                      .setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(0);
    }
}