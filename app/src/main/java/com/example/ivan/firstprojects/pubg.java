package com.example.ivan.firstprojects;
import android.widget.TextView;

import java.util.Arrays;

public class pubg {

    public static String write(int[] arr){
        String result = "";
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0) {
                result = result + Integer.toString(arr[i]) + " ";
            }
        }
        return result;
    }
    public static int[] KarSort(int[] array){
        int one = 0, two = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] <= 5) {
                one++;
            } else {
                two++;
            }
        }
        int[] ones = new int[one];
        int[] twos = new int[two];
        one = 0;
        two = 0;

        for(int i = 0; i<array.length;i++){
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
        int fix = 0;
        for(int i=0;i<ones.length;i++){
            array[i] = ones[i];
            fix++;
        }
        for(int i=0;i<twos.length;i++){
            array[i+fix] = twos[i];
        }
        return array;
    }
    public static String Kar1(int[] array){
        int one = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] <= 5) {
                one++;
            }
        }
        int[] ones = new int[one];
        one = 0;
        for(int i = 0; i<array.length;i++){
            if(array[i]<=5){
                ones[one] = array[i];
                one++;
            }
        }
        String res1 = write(ones);
        return res1;
    }
    public static String Kar2(int[] array){
        int one = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                one++;
            }
        }
        int[] ones = new int[one];
        one = 0;
        for(int i = 0; i<array.length;i++){
            if(array[i]>5){
                ones[one] = array[i];
                one++;
            }
        }
        String res1 = write(ones);
        return res1;
    }

}
