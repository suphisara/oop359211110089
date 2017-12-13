package ooplab5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class sortingArray {
    private static final int MAX = 10;
    private static int number[] = new int [MAX];
    public static void main(String[] args) {
        inputData(number,number.length);
        System.out.println("Before sorting: ");
        showData(number,number.length);
        findMaxData(number);
        System.out.println("Before sorting: ");
        //ascending order
        sortingDataAscending(number);
        // findMinData(number);
        // sortingData(number);
        sortingDataDesending(number);


    }//main

    private static void sortingDataDesending(int[] number) {
        System.out.println("Desending Order:");
        Integer[] num ={1,8,6,3};
        Arrays.sort(num, Collections.reverseOrder());
        showData(number,number.length);
    }//sortingDataDesending

    private static void sortingDataAscending(int[] number) {
        System.out.println("Ascending Order:");
        Arrays.sort(number);
        showData(number,number.length);

    }// sortingData

    private static void sortingData(int[] number) {
    }//sortingdata

    private static void findMinData(int[] number) {
    }//findmindata

    private static void findMaxData(int[] number) {
        int min = number[0];
        for (int i=0;i<number.length;i++){
            if (min<=number[i])
                min = number[i];
        }//for
        System.out.println("The maximum data: " + min);

    }//findmaxdata

    private static void showData(int[] number, int length) {
        System.out.print("Data in array: ");
        for (int i=0;i<length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }


    private static void inputData(int[] number, int length) {
        //user input data
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<length;i++)
        {
            System.out.println("Enter an integer["+i+"]: ");
            number[i] = scanner.nextInt();
        }

    }//inputData
}//class