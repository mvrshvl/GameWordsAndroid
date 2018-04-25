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

import static com.orbit.msgcl.gamewords.MainActivity.APP_PREFERENCES;
import static com.orbit.msgcl.gamewords.MainActivity.APP_PREFERENCES_GT;

/**
 * Created by MSGcl on 12.12.2017.
 */
public class level extends Activity {
    protected static int key=0;
private Button ea;
    private Button mid;
    private Button hi;
    private Switch GT;


    private SharedPreferences mSettings;

    boolean FlagSave = true;
    private int GTflag;


    private TextView txtPoint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levels);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ea = (Button)findViewById(R.id.easy);
        ea.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));

        mid = (Button)findViewById(R.id.middle);
        mid.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));
        hi = (Button)findViewById(R.id.high);
        hi.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));




        //Создание настройки приложения, если нажато игра на время то игра это запомнит и будет выдавать в определенном режиме таймер
        mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);

        GTflag = mSettings.getInt(APP_PREFERENCES_GT, 0);

        GT=(Switch)findViewById(R.id.GameTime);
        if(GTflag==1)
            GT.setChecked(true);
        else if(GTflag==0){
            GT.setChecked(false);
        }
        GT.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // в зависимости от значения isChecked выводим нужное сообщение
                if (isChecked) {
                    GTflag=1;

                    SharedPreferences.Editor editor = mSettings.edit();
                    editor.putInt(APP_PREFERENCES_GT, GTflag);
                    editor.apply();                   // Toast.makeText(getApplicationContext(), "SET ON", Toast.LENGTH_SHORT).show();
                } else {
                    GTflag=0;
                    SharedPreferences.Editor editor = mSettings.edit();
                    editor.putInt(APP_PREFERENCES_GT, GTflag);
                    editor.apply();
                    // Toast.makeText(getApplicationContext(), "SET OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    //выбор уровня
    public void onClickSet(View view) {
        key=1;
            Intent intent = new Intent(level.this, classic.class);
            startActivity(intent);
            finish();

    }
    public void onClickSet1(View view) {
        key=2;
        Intent intent = new Intent(level.this, classic.class);
        startActivity(intent);
        finish();

    }
    public void onClickSet2(View view) {
        key=3;
        Intent intent = new Intent(level.this, classic.class);
        startActivity(intent);
        finish();
    }

    protected final int  alue(){
        return key;
    }
}
