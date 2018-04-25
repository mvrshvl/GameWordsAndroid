package com.orbit.msgcl.gamewords;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import static com.orbit.msgcl.gamewords.PlaySolo.rejim;

/**
 * Created by MSGcl on 11.04.2018.
 */

public class Friends extends Activity {

    private Button Bwon;
    private Button Twon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Bwon = (Button)findViewById(R.id.but1);
        Bwon.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));
        Twon = (Button)findViewById(R.id.but2);
        Twon.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));


    }
    public void classic(View view){
        Intent intent = new Intent(Friends.this, classic.class);
        startActivity(intent);
        rejim=0;
        finish();
    }

    public void city(View view){
        Intent intent = new Intent(Friends.this, classic.class);
        startActivity(intent);
        rejim=1;
        finish();
    }
}