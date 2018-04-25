package com.orbit.msgcl.gamewords;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import static com.orbit.msgcl.gamewords.MainActivity.APP_PREFERENCES;
import static com.orbit.msgcl.gamewords.MainActivity.APP_PREFERENCES_COUNTER;
import static com.orbit.msgcl.gamewords.MainActivity.APP_PREFERENCES_GT;
import static com.orbit.msgcl.gamewords.classic.pointss;

/**
 * Created by MSGcl on 15.01.2018.
 */

public class Settings extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sett);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


    }

}