package com.example.ivan.firstprojects;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
//создание переменных(кейсы для кнопок)
    public Button max,min,karman;
    public Button openSourse,home;
    public TextView keys_one,keys_two;
    public Button generate;
    public TextView ArrayOne;
    public TextView ress;
    public int[] array = new int[10];

//запуск приложения->
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //заполнение кейсов(передаем знаечения с кнопок на переменные)->
        max = findViewById(R.id.max);
        min = findViewById(R.id.min);
        karman = findViewById(R.id.karman);
        openSourse = findViewById(R.id.openSourse);
        home = findViewById(R.id.home);
        generate = findViewById(R.id.generator);
        keys_one = findViewById(R.id.keys_one);
        keys_two =  findViewById(R.id.keys_two);
        ArrayOne = findViewById(R.id.array);
        ress = findViewById(R.id.ress);
        final Random ran = new Random();
        //обработчик события(нажатие на кнопку "Создать массив")
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result=" ";
                for(int i = 0;i<array.length;i++){
                    //заполняю массив случайными числами
                    array[i] = ran.nextInt(9)+1;

                    result = result + Integer.toString(array[i]) + " ";
                }
                ArrayOne.setText(result);
            }
        });
        //обработчик события(нажатие на кнопку "по возоастанию")
        max.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int one=0,two=0;
                for(int i=0;i<array.length;i++){
                    if(array[i]<=5){
                        one++;
                    }
                    else{
                        two++;
                    }
                }
                int[] ones = new int[one];
                int[] twos = new int[two];

                one=0;
                two=0;

                for(int i=0;i<array.length;i++){
                    if(array[i]<=5){
                        ones[one] = array[i];
                        one++;
                    }
                    else{
                        twos[two] = array[i];
                        two++;
                    }
                }

                Arrays.sort(ones);
                Arrays.sort(twos);
                one++;
                for(int i=0;i<ones.length;i++){
                    array[i] = ones[i];
                }
                /*for(int i=0;i<twos.length;i++){
                    array[one] = ones[i];
                    one++;
                }*/
                String result = pubg.WriteArrayS(array);
                ress.setText(result);



            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        karman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.keys);
            }
        });
    }
}
