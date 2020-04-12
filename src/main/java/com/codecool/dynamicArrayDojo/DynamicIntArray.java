package com.codecool.dynamicArrayDojo;

import java.util.Arrays;


public class DynamicIntArray {
    private int arraySize;

    private int[] dynamicIntArray;

    public DynamicIntArray(){
        this.arraySize = 0;
        this.dynamicIntArray = new int[arraySize];
    }

    public void add(int number){
        int[] newArray = new int[dynamicIntArray.length + 1];
        System.arraycopy(dynamicIntArray, 0, newArray, 0, dynamicIntArray.length);
        newArray[newArray.length-1] = number;
        dynamicIntArray = newArray;
    }

    public void remove(int number){
        for (int i = 0; i < dynamicIntArray.length; i++) {
            if (dynamicIntArray[i] == number) {
                dynamicIntArray[i] = Integer.MIN_VALUE;
            }
        }
        int[] tempArray = new int[dynamicIntArray.length - 1];
        int ct = 0;
        for (int i = 0; i < dynamicIntArray.length; i++) {
            if (dynamicIntArray[i] != Integer.MIN_VALUE) {
                tempArray[ct] = dynamicIntArray[i];
                ct++;
            }
        }
        dynamicIntArray = tempArray;
    }

    public void insert(int index, int value){
        int[] tempArray = new int[dynamicIntArray.length + 1];
        for(int i =0, j=0; i< dynamicIntArray.length; i++,j++){
            if(i==index){
                tempArray[j] = value;
                j++;
            }
            tempArray[j] = dynamicIntArray[i];
        }
        dynamicIntArray = tempArray;
    }


    @Override
    public String toString() {
        return "DynamicIntArray{" +
                "arraySize=" + arraySize +
                ", dynamicIntArray=" + Arrays.toString(dynamicIntArray) +
                '}';
    }
}
