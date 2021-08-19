package com.graviton;

import java.util.Scanner;

public class arraysort {

    public static void main(String[] args)
    {
        int num, temp;
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter number of elements in array:");
        num = console.nextInt();
        int array[] = new int[num];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++)
        {
            array[i] = console.nextInt();
        }
        for (int i = 0; i < num; i++)
        {
            for (int j = i + 1; j < num; j++)
            {
                if (array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Elements of array in ascending Order:");
        for (int i = 0; i < num - 1; i++)
        {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[ num - 1]);
    }
}

