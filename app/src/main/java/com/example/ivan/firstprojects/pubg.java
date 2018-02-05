package com.example.ivan.firstprojects;
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


    public static String WriteArray(int[] arr){
        String result = "";
        for(int i = 9;i>0;i--){
            if(arr[i] != 0) {
                result = result + Integer.toString(arr[i]) + " ";
            }
        }
        return result;
    }
    public static String WriteArrayS(int[] arr){
        String result= "";
        for(int i = 0;i<arr.length;i++){
                result = result + Integer.toString(arr[i]) + " ";
        }
        return result;
    }
    public static String KarSort(int[] array){
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
        Arrays.sort(ones);

        int xy = 0;
        for(int j = 0;j<ones.length;j++){
                array[j]=ones[j];
                xy++;
            }
            xy--;
        for(int j = 0;j<twos.length;j++){
            array[j]=ones[j];
            xy++;
        }
        String result = write(array);
        return result;
    }

}
