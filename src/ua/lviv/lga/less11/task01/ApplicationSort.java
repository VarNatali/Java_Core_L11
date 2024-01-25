package ua.lviv.lga.less11.task01;

import javax.annotation.processing.Generated;
import java.lang.reflect.GenericArrayType;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class ApplicationSort {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір масиву:");
        size = sc.nextInt();

        Integer[] myArray = new Integer[size];

        for (int i = 0; i < size; i++) myArray[i] = getRangom(10, 1200);

        System.out.println("Згенерований масив: "+Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println("У порядку зростання: " + Arrays.toString(myArray));
        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println("У порядку спадання: " + Arrays.toString(myArray));
    }

    public static int getRangom(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("min> max");
        }
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;

    }
}
