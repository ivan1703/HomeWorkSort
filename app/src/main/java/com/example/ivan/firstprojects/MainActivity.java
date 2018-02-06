/*--------------------------------------------------------------
 | Сдесь находит кодовая печать, она подверждае,               |
 | что прогграмму сортировки массивов из 10(десяти)элементов   |
 | написал Балашов Иван Александрович, студент Колледжа        |
 | экономики и информатики учащийся на втором курсе очной      |
 | формы обучения. https://vk.com/iwan.balaschow               |
  --------------------------------------------------------------*/
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
    public Button max,karman;
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
        karman = findViewById(R.id.karman);
        generate = findViewById(R.id.generator);
        keys_one = findViewById(R.id.keys_one);
        keys_two =  findViewById(R.id.keys_two);
        ArrayOne = findViewById(R.id.array);
        ress = findViewById(R.id.ress);
        final Random ran = new Random();
        //обработчик события---------------------------------------------------------->(нажатие на кнопку "Создать массив")
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
        //обработчик события---------------------------------------------------------->(нажатие на кнопку "по возоастанию")
        max.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                pubg.KarSort(array);
                ress.setText(pubg.write(array));
            }
        });
        //обработчик события---------------------------------------------------------->(нажатие на кнопку "смотреть карманы")
        karman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keys_one.setText(pubg.Kar1(array));
                keys_two.setText(pubg.Kar2(array));
            }
        });
        //обработчик события---------------------------------------------------------->(нажатие на кнопку "назад")


    }
}
