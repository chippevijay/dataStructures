package com.selectionsort;

public class Main {

    public static void main(String[] args) {

        int[] array = { 90 , 80 , 40, 20, 70, 95, -75};

        int largest;

        for( int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            largest = 0;

            for (int i =1; i<= lastUnsortedIndex;i++){
                if( array[i] > array[largest]){
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }

        for (int i =0; i< array.length;i++){
            System.out.println(array[i]);
        }

    }

    public static void swap( int[] intArray, int i, int j){
        if(i == j){
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
