package com.orbit.msgcl.gamewords;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.button1;
import static com.orbit.msgcl.gamewords.PlaySolo.rejim;
import static com.orbit.msgcl.gamewords.R.id.InputWordXML;
import static com.orbit.msgcl.gamewords.R.id.points;
import static com.orbit.msgcl.gamewords.classic.pointss;
import static com.orbit.msgcl.gamewords.slovar.letter1;
import static com.orbit.msgcl.gamewords.slovar.letter10;
import static com.orbit.msgcl.gamewords.slovar.letter11;
import static com.orbit.msgcl.gamewords.slovar.letter12;
import static com.orbit.msgcl.gamewords.slovar.letter13;
import static com.orbit.msgcl.gamewords.slovar.letter14;
import static com.orbit.msgcl.gamewords.slovar.letter15;
import static com.orbit.msgcl.gamewords.slovar.letter16;
import static com.orbit.msgcl.gamewords.slovar.letter17;
import static com.orbit.msgcl.gamewords.slovar.letter18;
import static com.orbit.msgcl.gamewords.slovar.letter19;
import static com.orbit.msgcl.gamewords.slovar.letter2;
import static com.orbit.msgcl.gamewords.slovar.letter20;
import static com.orbit.msgcl.gamewords.slovar.letter21;
import static com.orbit.msgcl.gamewords.slovar.letter22;
import static com.orbit.msgcl.gamewords.slovar.letter23;
import static com.orbit.msgcl.gamewords.slovar.letter24;
import static com.orbit.msgcl.gamewords.slovar.letter25;
import static com.orbit.msgcl.gamewords.slovar.letter26;
import static com.orbit.msgcl.gamewords.slovar.letter27;
import static com.orbit.msgcl.gamewords.slovar.letter28;
import static com.orbit.msgcl.gamewords.slovar.letter29;
import static com.orbit.msgcl.gamewords.slovar.letter3;
import static com.orbit.msgcl.gamewords.slovar.letter30;
import static com.orbit.msgcl.gamewords.slovar.letter4;
import static com.orbit.msgcl.gamewords.slovar.letter5;
import static com.orbit.msgcl.gamewords.slovar.letter6;
import static com.orbit.msgcl.gamewords.slovar.letter7;
import static com.orbit.msgcl.gamewords.slovar.letter8;
import static com.orbit.msgcl.gamewords.slovar.letter9;
import static java.sql.Types.NULL;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private TextView TVcourse;
    private boolean flag;
    private int mCounter;

    private TextView mInfoTextView;

    public static final String APP_PREFERENCES = "mysettings";
    public static final String APP_PREFERENCES_COUNTER = "counter";
    public static final String APP_PREFERENCES_GT = "GTFLAG";
    private SharedPreferences mSettings;
    protected static int friends=0 ;
    private TextView txtPoint;

    //главное меню , инициализация всех настроек
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        button1 = (Button)findViewById(R.id.but1);
        button1.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));
        button2 = (Button)findViewById(R.id.but2);
        button2.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));
 TVcourse = (TextView) findViewById(R.id.but3);
        TVcourse.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));

        mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);


        txtPoint=(TextView)findViewById(R.id.points);
        txtPoint.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));


    }

    @Override
    protected void onResume() {
        super.onResume();

        if (mSettings.contains(APP_PREFERENCES_COUNTER)) {
            // Получаем число из настроек
            mCounter = mSettings.getInt(APP_PREFERENCES_COUNTER, 0);
            // Выводим на экран данные из настроек

            if(pointss!=0){
                mCounter=mCounter+pointss;
                pointss=0;
                SharedPreferences.Editor editor = mSettings.edit();
                editor.putInt(APP_PREFERENCES_COUNTER, mCounter);
                editor.apply();
            }
            txtPoint.setText("Рейтинг: "
                    + mCounter);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Запоминаем данные
        SharedPreferences.Editor editor = mSettings.edit();
        editor.putInt(APP_PREFERENCES_COUNTER, mCounter);
        editor.apply();
    }

    public void classic(View view){
        Intent intent = new Intent(MainActivity.this, PlaySolo.class);
        level.key=0;
        friends=0;
        startActivity(intent);
    }

    public void standart(View view){
        Intent intent = new Intent(MainActivity.this, PlaySolo.class);
        level.key=4;
        friends=0;
        startActivity(intent);
    }


    public void friends(View view){
        Intent intent = new Intent(MainActivity.this,  Friends.class);
        level.key=4;
        friends=1;
        rejim=0;
        startActivity(intent);
    }

}
