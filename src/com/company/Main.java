package com.company;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static   Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {



        int[] array = {10,20,30,40,50};

        System.out.println(Arrays.toString(array));


        reverse(array);
        System.out.println(Arrays.toString(array));


//        int count = scan.nextInt();
//
//        int[] returnedArray = readIntegers(count);
//        int returnedMin = findMin(returnedArray);
//        System.out.println("Min is : " + returnedMin);
    }
    private static   int[] printArray(int count){
        int[]array = new int[count];
        for (int i=0; i<array.length;i++ ){
            int number = scan.nextInt();
            array[i] = number;
        }
        return array;
    }
    private static void reverse(int[] array){
        int maxIndex = array.length-1;
        int halfLenght = array.length / 2;
        for (int i=0; i<halfLenght;i++){
            int temp = array[i];
            array[i]= array[maxIndex-i];
            array[maxIndex-i] = temp;

        }
    }




    private static int[] readIntegers(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number to be added to the array: ");
            int number = scan.nextInt();
            arr[i] = number;
        }
        return arr;

    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}








