package com.practice;

public class Array {
    private int[] items;

    public Array(int length){
        items = new int[length];
    }
    public void Print(){
        for (int i = 0; i < items.length; i++){
            System.out.println(items[i]);
        }
    }
}
