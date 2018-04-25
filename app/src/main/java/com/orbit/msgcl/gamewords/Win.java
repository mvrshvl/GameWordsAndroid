package com.orbit.msgcl.gamewords;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by MSGcl on 16.12.2017.
 */
//экран победы

public class Win extends Activity {

    private Button Bwon;
    private TextView Twon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Bwon = (Button)findViewById(R.id.butwon);
        Bwon.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));
        Twon = (TextView)findViewById(R.id.won);
        Twon.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));


    }
    public void next(View view){
        Intent intent = new Intent(Win.this, MainActivity.class);
         startActivity(intent);
        finish();

    }
}
