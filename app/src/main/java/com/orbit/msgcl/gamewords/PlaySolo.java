package com.orbit.msgcl.gamewords;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by MSGcl on 15.01.2018.
 */

public class PlaySolo extends Activity {

    private Button button1;
    private Button button2;
    private Button button3;


    protected static int rejim=0;

//если равен 0 то классический
    //если 1 то города
    //если 2 то
    private TextView txtPoint;
//метод загружающий активность и устанавливающий все правила на нем
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_solo);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        button1 = (Button) findViewById(R.id.but1);
        button1.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));
        button2 = (Button) findViewById(R.id.but2);
        button2.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));
    }

    public void classic(View view){
        rejim=0;
        if(level.key==4){
            Intent intent= new Intent(PlaySolo.this, classic.class);
            startActivity(intent);

        }
        else if(level.key==0){
            Intent intent = new Intent(PlaySolo.this, level.class);
            startActivity(intent);
        }
        finish();
    }
    public void City(View view){
        rejim=1;
        if(level.key==4){
            Intent intent= new Intent(PlaySolo.this, classic.class);
            startActivity(intent);

        }
        else if(level.key==0){
            Intent intent = new Intent(PlaySolo.this, level.class);
            startActivity(intent);
        }
        finish();
    }
}
