package com.example.ivan.firstprojects;



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
            if(arr[i] != 0) {
                result = result + Integer.toString(arr[i]) + " ";
            }
        }
        return result;
    }
}
