package com.nirmal.algoExpert.arrays;

import java.util.Arrays;

public class ArrayOfProducts {

    // Solution 3:
    public int[] arrayOfProducts(int[] array) {
        // Write your code here.

        int[] productArray=new int[array.length];

        int leftProduct=1;
        for(int i=0;i<array.length;i++){
            productArray[i]=leftProduct;
            leftProduct=leftProduct*array[i];
        }

        int rightProduct=1;
        for(int i=array.length-1;i>=0;i--){
            productArray[i]= productArray[i]*rightProduct;
            rightProduct=array[i]*rightProduct;
        }
        return productArray;
    }
    // Solution 2
   /* public int[] arrayOfProducts(int[] array) {
        // Write your code here.
        int[] productArray= new int[array.length];
        int[] leftArray= new int[array.length];
        int[] rightArray= new int[array.length];

        int leftProduct=1;
        for(int i=0;i<array.length;i++){
            leftArray[i]=leftProduct;
            leftProduct=leftProduct*array[i];
        }

        int rightProduct=1;
        for(int i=array.length-1;i>=0;i--){
            rightArray[i]=rightProduct;
            rightProduct=rightProduct*array[i];
        }

        for(int i=0;i<array.length;i++){
            productArray[i]=leftArray[i] *rightArray[i];
        }
        for(int i=0;i<productArray.length;i++){
            System.out.print(productArray[i] +" ");
        }
        return productArray;
    }*/
    // Solution 1
    /*public int[] arrayOfProducts(int[] array) {
        // Write your code here.
        int[] resultArray=new int[array.length];

        for(int i=0;i<array.length;i++){
            int product=1;

            for(int j=0;j<array.length;j++){
                if(j != i){
                    product=product*array[j];
                }
            }
            resultArray[i]=product;
        }
        for(int i=0;i<resultArray.length;i++){
            System.out.print(resultArray[i] +" ");
        }
        return resultArray;
    }*/

    public static void main(String[] args) {
        ArrayOfProducts obj= new ArrayOfProducts();
        System.out.println(obj.arrayOfProducts(new int[]{5,1,4,2}).toString());
    }
}
