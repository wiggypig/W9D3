package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arrExample;
        double[] examplesArray = {1,5,6,5,4,1};
        double maximum = examplesArray[0];
        int size = 4;
        int power = 2;

        int index = 0;

        for (int i = 1; i<examplesArray.length; i++){

            if (examplesArray[ i ] > maximum) {

                maximum = examplesArray[i];

                index = i;

            }

        }

        System.out.println(index);
        arrExample = toPower(size, power);
       /* for (int i = 0; i < arrExample.length; i++){
            System.out.println(arrExample[i]);
        }*/
        System.out.println(Arrays.toString(arrExample));


    }

    public static int[] toPower(int size, int power) {
        int[] arrTemp;
        arrTemp = new int[size];
        int tempProduct;
        for(int j = 0; j < size; j++){
            tempProduct = j * j;
            arrTemp[j] = tempProduct;
        }
        return arrTemp;
    }


}
