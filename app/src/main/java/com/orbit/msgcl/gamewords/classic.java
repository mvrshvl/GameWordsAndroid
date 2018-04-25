package com.orbit.msgcl.gamewords;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.orbit.msgcl.gamewords.MainActivity.APP_PREFERENCES;
import static com.orbit.msgcl.gamewords.MainActivity.APP_PREFERENCES_GT;
import static com.orbit.msgcl.gamewords.MainActivity.friends;
import static com.orbit.msgcl.gamewords.R.id.InputWordXML;
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
import static com.orbit.msgcl.gamewords.slovar.letterC1;
import static com.orbit.msgcl.gamewords.slovar.letterC10;
import static com.orbit.msgcl.gamewords.slovar.letterC11;
import static com.orbit.msgcl.gamewords.slovar.letterC12;
import static com.orbit.msgcl.gamewords.slovar.letterC13;
import static com.orbit.msgcl.gamewords.slovar.letterC14;
import static com.orbit.msgcl.gamewords.slovar.letterC15;
import static com.orbit.msgcl.gamewords.slovar.letterC16;
import static com.orbit.msgcl.gamewords.slovar.letterC17;
import static com.orbit.msgcl.gamewords.slovar.letterC18;
import static com.orbit.msgcl.gamewords.slovar.letterC19;
import static com.orbit.msgcl.gamewords.slovar.letterC2;
import static com.orbit.msgcl.gamewords.slovar.letterC20;
import static com.orbit.msgcl.gamewords.slovar.letterC21;
import static com.orbit.msgcl.gamewords.slovar.letterC22;
import static com.orbit.msgcl.gamewords.slovar.letterC23;
import static com.orbit.msgcl.gamewords.slovar.letterC24;
import static com.orbit.msgcl.gamewords.slovar.letterC25;
import static com.orbit.msgcl.gamewords.slovar.letterC26;
import static com.orbit.msgcl.gamewords.slovar.letterC27;
import static com.orbit.msgcl.gamewords.slovar.letterC28;
import static com.orbit.msgcl.gamewords.slovar.letterC29;
import static com.orbit.msgcl.gamewords.slovar.letterC3;
import static com.orbit.msgcl.gamewords.slovar.letterC4;
import static com.orbit.msgcl.gamewords.slovar.letterC5;
import static com.orbit.msgcl.gamewords.slovar.letterC6;
import static com.orbit.msgcl.gamewords.slovar.letterC7;
import static com.orbit.msgcl.gamewords.slovar.letterC8;
import static com.orbit.msgcl.gamewords.slovar.letterC9;


public class classic extends level {

    private TextView mTimer;
    int Spaces[] = new int[34];//массивы для работы со словарями
    String inputWord="",outputWord="",message="",history=" ";//переменные для работы с проверкой
    int LengthInputWord;
    String FirstSymbolInput,LastSymbolInput,LastSymbolOut;
    boolean tim=false,wordEmpty,FirLastSym=true,slovarIn,WasOrNotWasIn,HaveOrNotHave,WasOrNotWasOut;
int rej = PlaySolo.rejim;
    String copyWords1 = letter1, copyWords2 = letter2, copyWords3 = letter3, copyWords4 = letter4, copyWords5 = letter5, copyWords6 = letter6, copyWords7 = letter7, copyWords8 = letter8, copyWords9 = letter9, copyWords10 = letter10, copyWords11 = letter11, copyWords12 = letter12, copyWords13 = letter13, copyWords14 = letter14, copyWords15 = letter15, copyWords16 = letter16, copyWords17 = letter17, copyWords18 = letter18, copyWords19 = letter19, copyWords20 = letter20, copyWords21 = letter21, copyWords22 = letter22, copyWords23 = letter23, copyWords24 = letter24, copyWords25 = letter25, copyWords26 = letter26, copyWords27 = letter27, copyWords28 = letter28, copyWords29 = letter29, copyWords30 = letter30;

    String str="";//входное слово ввод
    CountDownTimer timer;
private int pointForlvl;

    protected static int pointss=0 ;

    int keys = level.key;//количество слов на уровне
    int lvlStart=0;
    int lvl = 0;
    //настройки
    private SharedPreferences mSettings;
    private int GTfla;//информация о таймере(вкл/выкл)
    //переменные для установки шрифтов
    private Button falli;
    private TextView summi;
    private TextView messi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clasics);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        GTfla = mSettings.getInt(APP_PREFERENCES_GT, 0);

        if(keys==4){
            GTfla=0;
        }
        if(GTfla==1) {
            //установка таймера
            mTimer = (TextView) findViewById(R.id.tv);
            timer = new CountDownTimer(40000, 1000) {
                //Здесь обновляем текст счетчика обратного отсчета с каждой секундой
                public void onTick(long millisUntilFinished) {
                    mTimer.setText("Осталось: "
                            + millisUntilFinished / 1000);

                }

                //Задаем действия после завершения отсчета (высвечиваем надпись "ВЫ проиграли!"):
                public void onFinish() {
                    Intent intent = new Intent(classic.this, Lose.class);
                    startActivity(intent);
                    finish();
                }
            };
            timer.start();
        }
        //установка шрифтов
        falli = (Button)findViewById(R.id.fall);
        falli.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));
        summi = (TextView) findViewById(R.id.summ);
        summi.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));
        messi = (TextView) findViewById(R.id.messageXML);
        messi.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));
        //установка количества слов для победы количество очков полученных за игру
        switch (keys){
            case 1:
                lvl=20;
                if(GTfla==1)
                    pointForlvl=3;
                else
                    pointForlvl=1;
                break;
            case 2:

                lvl=40;
                if(GTfla==1)
                    pointForlvl=6;
                else
                    pointForlvl=3;
                break;
            case 3:
                lvl=60;
                if(GTfla==1)
                    pointForlvl=10;
                else
                    pointForlvl=6;
                break;
            case 4:
                pointForlvl=0;
                lvl=99999;
                break;
        }
        LengthSpace();
    }

//игнорирование нажатия кнопки назад
    @Override
    public void onBackPressed() {
        // super.onBackPressed();
    }
//Сдаться
    void ex(View view){
        Intent intent = new Intent(classic.this, Lose.class);
        startActivity(intent);
        if(GTfla==1||keys!=4) {
            pointss=-1;
            timer.cancel();}
        finish();

    }

    private void numbersWords(String slovar,int number) {
        for (int i = 0; i < slovar.length(); i++) {
            char tmp = slovar.charAt(i);
            if(tmp==' ') Spaces[number]++;
        }
        Spaces[number]--;
    }

    //установка словарей в зависимости от режима
    private void LengthSpace(){
        if(rej==0)
        {
             copyWords1 = letter1; copyWords2 = letter2; copyWords3 = letter3; copyWords4 = letter4; copyWords5 = letter5; copyWords6 = letter6; copyWords7 = letter7; copyWords8 = letter8; copyWords9 = letter9; copyWords10 = letter10; copyWords11 = letter11; copyWords12 = letter12; copyWords13 = letter13; copyWords14 = letter14; copyWords15 = letter15; copyWords16 = letter16; copyWords17 = letter17; copyWords18 = letter18; copyWords19 = letter19; copyWords20 = letter20; copyWords21 = letter21; copyWords22 = letter22; copyWords23 = letter23; copyWords24 = letter24; copyWords25 = letter25; copyWords26 = letter26; copyWords27 = letter27; copyWords28 = letter28; copyWords29 = letter29; copyWords30 = letter30;
        }
        else if(rej==1){
             copyWords1 = letterC1; copyWords2 = letterC2; copyWords3 = letterC3; copyWords4 = letterC4; copyWords5 = letterC5; copyWords6 = letterC6; copyWords7 = letterC7; copyWords8 = letterC8; copyWords9 = letterC9; copyWords10 = letterC10; copyWords11 = letterC11; copyWords12 = letterC12; copyWords13 = letterC13; copyWords14 = letterC14; copyWords15 = letterC15; copyWords16 = letterC16; copyWords17 = letterC17; copyWords18 = letterC18; copyWords19 = letterC19; copyWords20 = letterC20; copyWords21 = letterC21; copyWords22 = letterC22; copyWords23 = letterC23; copyWords24 = letterC24; copyWords25 = letterC25; copyWords26 = letterC26; copyWords27 = letterC27; copyWords28 = letterC28; copyWords29 = letterC29; copyWords30 = letter30;
        }
//cчитаем длину всех словарей
        numbersWords(copyWords1,1);numbersWords(copyWords2,2);numbersWords(copyWords3,3);numbersWords(copyWords4,4);numbersWords(copyWords5,5);numbersWords(copyWords6,6);numbersWords(copyWords7,7);numbersWords(copyWords8,8);numbersWords(copyWords9,9);numbersWords(copyWords10,10);
        numbersWords(copyWords11,11);numbersWords(copyWords12,12);numbersWords(copyWords13,13);numbersWords(copyWords14,14);numbersWords(copyWords15,15);numbersWords(copyWords16,16);numbersWords(copyWords17,17);numbersWords(copyWords18,18);numbersWords(copyWords19,19);numbersWords(copyWords20,20);
        numbersWords(copyWords21,21);numbersWords(copyWords22,22);numbersWords(copyWords23,23);numbersWords(copyWords24,24);numbersWords(copyWords25,25);numbersWords(copyWords26,26);numbersWords(copyWords27,27);numbersWords(copyWords28,28);numbersWords(copyWords29,29);numbersWords(copyWords30,30);

    }
    //проверка входящаего слова на повторение, существование , взятие последней буквы для ответа компьютера, проверка на первую букву
    public void PrepareInputWord() {
        inputWord = "";

        EditText et = (EditText) findViewById(InputWordXML);
        LengthInputWord = et.getText().length() - 1;//как по массиву длина будет снижена на 1 на самом же деле длина на 1 больше указанного числа
        if (LengthInputWord == -1) {
            wordEmpty = true;
        }
        else {
            wordEmpty=false;
            //проверка пробелов после слова
            if (et.getText().charAt(LengthInputWord) != ' ') {
                LastSymbolInput = "" + et.getText().charAt(LengthInputWord);
            } else {
                boolean b = true;
                while (b != false) {
                    if ((et.getText().charAt(LengthInputWord) == ' ') && (LengthInputWord > 0)) {
                        LengthInputWord = LengthInputWord - 1;
                    } else {
                        b = false;
                    }
                }
            }
//работа с последним символом входящего слова
            LastSymbolInput = "" + et.getText().charAt(LengthInputWord);
            if (LastSymbolInput.startsWith("ь")||LastSymbolInput.startsWith("ы")||LastSymbolInput.startsWith("ъ")) {
                LastSymbolInput = "" + et.getText().charAt(LengthInputWord - 1);
            }

            if (LastSymbolInput.length() == 0) {
                inputWord = "ааа";
            } else {
                for (int i = 0; i < et.getText().length(); i++) {
                    if (et.getText().charAt(i) != ' ') {
                        inputWord = inputWord + et.getText().charAt(i);
                        inputWord = inputWord.toLowerCase();
                    }
                }
            }
            //-----------------------------------------------------------------
            char ch = inputWord.charAt(0);
            FirstSymbolInput = "" + ch;
            String st = "" + FirstSymbolInput;
                if (LastSymbolOut != null) {
                    message = FirstSymbolInput + " " + LastSymbolOut + " ";
                    if (FirstSymbolInput.charAt(0) == LastSymbolOut.charAt(0)) {
                        FirLastSym = true;
                    } else {
                        FirLastSym = false;
                        message = "Твоё слово должно начинаться с буквы " + LastSymbolOut;
                    }
                }
            else{FirLastSym=true;}
        }
    }
//рандомный выбор слова из словаря для ответа
    public  void chooseLetter(int sp,String copySlovar) {

            outputWord = "";
        int x = 0, random_number, space_ = 0, startsRandom;
        random_number = x + (int) (Math.random() * sp);
        for (startsRandom = 1; space_ != random_number; startsRandom++) {
            char symbol = copySlovar.charAt(startsRandom);
            if (symbol == ' ') {
                space_++;
            }
        }
        char symbol = 'g';
        for (int i = startsRandom; symbol != ' '; i++) {
            symbol = copySlovar.charAt(i);
            if (symbol != ' ') {
                outputWord = outputWord + symbol;
            }
        }
    }

    //функция которая определяет первую букву слова пользователя и подбираем нужный словарь
    void Check(String word,boolean bool,int InOrOut){
        String s;
        if(InOrOut==1)
         s=FirstSymbolInput;
        else
        s=LastSymbolInput;

        String abc = "абвгдеёжзиклмнопрстуфчэюяхцщшй";
        int findslovar = abc.indexOf(s);
        switch (findslovar)
        {
            case 0:
                if(InOrOut==1)
                CheckSlovar(word, copyWords1);
                else
                    chooseLetter(Spaces[1], copyWords1);
                break;
            case 1:
                if(InOrOut==1)
                    CheckSlovar(word, copyWords2);
                else
                    chooseLetter(Spaces[2], copyWords2);
                break;
            case 2:
                if(InOrOut==1)
                    CheckSlovar(word, copyWords3);
                else
                    chooseLetter(Spaces[3], copyWords3);
                break;
            case 3:
                if(InOrOut==1)
                    CheckSlovar(word, copyWords4);
                else
                    chooseLetter(Spaces[4], copyWords4);
                break;
            case 4:
                if(InOrOut==1)
                    CheckSlovar(word, copyWords5);
                else
                    chooseLetter(Spaces[5], copyWords5);
                break;
            case 5:
                if(InOrOut==1)
                    CheckSlovar(word, copyWords6);
                else
                    chooseLetter(Spaces[6], copyWords6);
                break;
            case 6:
                if(InOrOut==1)
                    CheckSlovar(word, copyWords30);
                else
                    chooseLetter(Spaces[30], copyWords30);
                break;
            case 7:
                if(InOrOut==1)
                    CheckSlovar(word, copyWords7);
                else
                    chooseLetter(Spaces[7], copyWords7);
                break;
            case 8:
                if(InOrOut==1)
                CheckSlovar(word, copyWords8);
                else
                chooseLetter(Spaces[8], copyWords8);
                break;
            case 9:
                if(InOrOut==1)
                CheckSlovar(word, copyWords9);
                else
                    chooseLetter(Spaces[9], copyWords9);
                break;
            case 10:
                if(InOrOut==1)
                CheckSlovar(word, copyWords11);
                else
                    chooseLetter(Spaces[11], copyWords11);
                break;
            case 11:
                if(InOrOut==1)
                CheckSlovar(word, copyWords12);
                else
                    chooseLetter(Spaces[12], copyWords12);
                break;
            case 12:
                if(InOrOut==1)
                CheckSlovar(word, copyWords13);
                else
                    chooseLetter(Spaces[13], copyWords13);
                break;
            case 13:
                if(InOrOut==1)
                CheckSlovar(word, copyWords14);
                else
                    chooseLetter(Spaces[14], copyWords14);
                break;
            case 14:
                if(InOrOut==1)
                CheckSlovar(word, copyWords15);
                else
                    chooseLetter(Spaces[15], copyWords15);
                break;
            case 15:
                if(InOrOut==1)
                CheckSlovar(word, copyWords16);
                else
                    chooseLetter(Spaces[16], copyWords16);
                break;
            case 16:
                if(InOrOut==1)
                CheckSlovar(word, copyWords17);
                else
                    chooseLetter(Spaces[17], copyWords17);
                break;
            case 17:
                if(InOrOut==1)
                CheckSlovar(word, copyWords18);
                else
                    chooseLetter(Spaces[18], copyWords18);
                break;
            case 18:
                if(InOrOut==1)
                CheckSlovar(word, copyWords19);
                else
                    chooseLetter(Spaces[19], copyWords19);
                break;
            case 19:
                if(InOrOut==1)
                CheckSlovar(word, copyWords20);
                else
                    chooseLetter(Spaces[20], copyWords20);
                break;
            case 20:
                if(InOrOut==1)
                CheckSlovar(word, copyWords21);
                else
                    chooseLetter(Spaces[21], copyWords21);
                break;
            case 21:
                if(InOrOut==1)
                CheckSlovar(word, copyWords24);
                else
                    chooseLetter(Spaces[24], copyWords24);
                break;
            case 22:
                if(InOrOut==1)
                CheckSlovar(word, copyWords27);
                else
                    chooseLetter(Spaces[27], copyWords27);
                break;
            case 23:
                if(InOrOut==1)
                CheckSlovar(word, copyWords28);
                else
                    chooseLetter(Spaces[28], copyWords28);
                break;
            case 24:
                if(InOrOut==1)
                CheckSlovar(word, copyWords29);
                else
                    chooseLetter(Spaces[29], copyWords29);
                break;
            case 25:
                if(InOrOut==1)
                CheckSlovar(word, copyWords22);
                else
                    chooseLetter(Spaces[22], copyWords22);
                break;
            case 26:
                if(InOrOut==1)
                CheckSlovar(word, copyWords23);
                else
                    chooseLetter(Spaces[23], copyWords23);
                break;
            case 27:
                if(InOrOut==1)
                CheckSlovar(word, copyWords26);
                else
                    chooseLetter(Spaces[26], copyWords26);
                break;
            case 28:
                if(InOrOut==1)
                CheckSlovar(word, copyWords25);
                else
                    chooseLetter(Spaces[25], copyWords25);
                break;
            case 29:
                if(InOrOut==1)
                CheckSlovar(word, copyWords10);
                else
                    chooseLetter(Spaces[10], copyWords10);
                break;
        }

        if(InOrOut==0){
            int len = outputWord.length() - 1;
            char ch = outputWord.charAt(len);
            LastSymbolOut = "" + ch;

            if ((LastSymbolOut.startsWith("ь")) || (LastSymbolOut.startsWith("ы"))) {
                LastSymbolOut = "" + outputWord.charAt(len - 1);
            }
            message = "тебе на " + LastSymbolOut;
        }
    }

    //проверка на повтор
    void CheckStory(String word, String slovar,int who){//слово, история, от кого проверка
        boolean flag = false;
        int position=0;
        if(slovar!="") {
            while (flag != true) {
                int i = slovar.indexOf(word, position);

                if (i != -1) {
                    if((slovar.charAt(i-1)==' ')&&(slovar.charAt(i+word.length())==' ') )     {
                        flag=true;
                        if(who==0)//0 - выходящее слово
                        WasOrNotWasOut=false;
                        else//исходящее
                            WasOrNotWasIn=false;
                    }
                    else{
                        position=i+word.length();
                        flag=false;
                        if(who==0)
                        WasOrNotWasOut=true;
                        else
                            WasOrNotWasIn=true;
                    }

                } else {flag=true;
                    if(who==0)
                    WasOrNotWasOut=true;
                    else WasOrNotWasIn=true;
                }
            }
        }
        else{
            if(who==0)
            WasOrNotWasOut=true;
            else WasOrNotWasIn=true;
        }
    }

    void CheckSlovar(String word,String slovar){
        boolean flag = false;
        int position=0;
        if(slovar!="") {
            while (flag != true) {
                int i = slovar.indexOf(word, position);

                if (i != -1) {
                    if((slovar.charAt(i-1)==' ')&&(slovar.charAt(i+word.length())==' ') )     {
                        flag=true;
                        HaveOrNotHave=true;
                    }
                    else{
                        position=i+word.length();
                        flag=false;

                        HaveOrNotHave=false;
                    }

                } else {flag=true;
                    HaveOrNotHave=false;
                }
            }

        }
    }

//отображение всего на активити
    void Output(String input,String output){
        TextView ClearIn=(TextView) findViewById(InputWordXML);
        ClearIn.setText("");
        TextView TestoutputW = (TextView) findViewById(R.id.OutputWordXML);
        TestoutputW.setText(output);
        TextView message_ = (TextView) findViewById(R.id.messageXML);
        message_.setText(message);
       //отображение сколько слов уже отвечено
        if(keys!=4) {
            String str = "/";
            str = lvlStart + str + lvl;
            TextView s = (TextView) findViewById(R.id.summ);
            s.setText(str);
        }
        else{
            str = str+lvlStart;
            TextView s = (TextView) findViewById(R.id.summ);
            s.setText(str);
            str="";
        }
        //обновление таймера если таков задан режимом
        if(GTfla==1){
            timer.cancel();
            if(tim==false) {
                timer = new CountDownTimer(30000, 1000) {
                    //Здесь обновляем текст счетчика обратного отсчета с каждой секундой
                    public void onTick(long millisUntilFinished) {
                        mTimer.setText("Осталось: "
                                + millisUntilFinished / 1000);

                    }

                    //Задаем действия после завершения отсчета (высвечиваем надпись "Бабах!"):
                    public void onFinish() {
                        Intent intent = new Intent(classic.this, Lose.class);
                        startActivity(intent);
                        pointss=-1;
                        finish();
                    }

                };
                timer.start();
            }
        }
    }
    //Если сработала ошибка по входящему слову
    void OutputMes(String messag){

        TextView message_ = (TextView) findViewById(R.id.messageXML);
        message_.setText(messag);

    }
    //обработка входящего слова и при условии что все правила соблюдены подготовка ответного и передача в метод output
    void Display(View view){
        PrepareInputWord();
        if(wordEmpty!=true){
            Check(inputWord,slovarIn,1);
            WasOrNotWasIn=false;
            CheckStory(inputWord,history,1);
            if((HaveOrNotHave==true)&&(WasOrNotWasIn==true)&&(FirLastSym==true)) {
                if(friends==0) {//если режим игры с другом то выходящее слово компьютера генерировать не надо
                    WasOrNotWasOut = false;
                    while (WasOrNotWasOut != true) {
                       // PrepareOutputWord();
                        Check(inputWord,slovarIn,0);
                        CheckStory(outputWord, history,0);
                    }
                    history = history + outputWord + " ";
                    history = history + inputWord + " ";
                  //  hist = true;
                    str = "";
                    lvlStart++;
                    if (lvlStart != lvl) {
                        Output(inputWord, outputWord);
                    } else {
                        if (GTfla == 1) {
                            timer.cancel();
                        }
                        pointss = pointss + pointForlvl;

                        Intent intent = new Intent(classic.this, Win.class);
                        startActivity(intent);
                        finish();

                    }

                }
                else{
                    WasOrNotWasIn=false;
                    outputWord=inputWord;

                    int len = outputWord.length() - 1;
                    char ch = outputWord.charAt(len);
                    LastSymbolOut = "" + ch;

                    if ((LastSymbolOut.startsWith("ь")) || (LastSymbolOut.startsWith("ы"))) {
                        LastSymbolOut = "" + outputWord.charAt(len - 1);
                    }
                    message = "тебе на " + LastSymbolOut;
                    OutputMes(message);
                    history = history + inputWord + " ";
                    str="";
                    lvlStart++;
                    if (lvlStart != lvl) {
                        Output(inputWord, outputWord);
                    } else {
                        if (GTfla == 1) {
                            timer.cancel();
                        }
                        pointss = pointss + pointForlvl;

                        Intent intent = new Intent(classic.this, Win.class);
                        startActivity(intent);
                        finish();

                    }
                }
            }

            else if(HaveOrNotHave==false){
                message="Я не знаю такого слова";
                OutputMes(message);
            }
            else if(WasOrNotWasIn==false){
                message="Это слово уже было, давай другое";
                OutputMes(message);

            }
            else if(FirLastSym==false){
                message="Твое слово должно начинаться с другой буквы";
                OutputMes(message);
            }
        }
        else{
            message="Но ты ведь ничего не ввёл";
            OutputMes(message);
        }
    }


    //функции создающие виртуальную клавиатуру на активности
    void yo(View view){
        str=str+"ё";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void q(View view){
        str=str+"й";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void w(View view){
        str=str+"ц";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void e(View view){
        str=str+"у";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void r(View view){
        str=str+"к";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void t(View view){
        str=str+"е";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void y(View view){
        str=str+"н";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void u(View view){
        str=str+"г";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void i(View view){
        str=str+"ш";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void o(View view){
        str=str+"щ";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void p(View view){
        str=str+"з";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void he(View view){
        str=str+"х";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void tz(View view){
        str=str+"ъ";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }


    void a(View view){
        str=str+"ф";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void s(View view){
        str=str+"ы";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void d(View view){
        str=str+"в";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void f(View view){
        str=str+"а";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void g(View view){
        str=str+"п";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void h(View view){
        str=str+"р";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void j(View view){
        str=str+"о";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void k(View view){
        str=str+"л";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void l(View view){
        str=str+"д";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void je(View view){
        str=str+"ж";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void ee(View view){
        str=str+"э";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void z(View view){
        str=str+"я";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void x(View view){
        str=str+"ч";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }

    void c(View view){
        str=str+"с";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void v(View view){
        str=str+"м";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void b (View view){
        str=str+"и";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void n(View view){
        str=str+"т";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void m (View view){
        str=str+"ь";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void be(View view){
        str=str+"б";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void yu(View view){
        str=str+"ю";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void space(View view){
        str=str+"-";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }
    void del(View view){
        String copyStr="";
        int lens=str.length()-1;
        for(int i=0;i<lens;i++){
            copyStr= copyStr+str.charAt(i);
        }
        str=copyStr;
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }

    void delF(View view){

        str="";
        TextView add = (TextView) findViewById(InputWordXML);
        add.setText(str);
    }

}
