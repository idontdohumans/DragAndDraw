package com.bignerdranch.android.draganddraw;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DragAndDrawActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_drag_and_draw);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drag_and_draw, menu);
        return true;
    }
    
}
