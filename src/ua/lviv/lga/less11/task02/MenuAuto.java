package ua.lviv.lga.less11.task02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MenuAuto {
    static void menu() {
        System.out.println();
        System.out.println(" Щоб вивести всі авто, атисніть 1");
        System.out.println(" Щоб засетити однакове значення в масив Авто натисніть 2");

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HelmMaterials[] materials = HelmMaterials.values();

        /* Сформували масив, з яким далі працюємо */
        Auto[][] arrAuto = getAutos(materials);

        while (true) {
            menu();
            switch (sc.next()) {
                case "1":
                    System.out.println(Arrays.deepToString(arrAuto));
                    break;

                case "2":
                    System.out.println(Arrays.deepToString(arrAuto));

                    /*вибираємо довільно з цього ж масиву значення*/
                    Auto objAuto = arrAuto[getRandom(0, arrAuto.length - 1)][getRandom(0, arrAuto[0].length - 1)];

                    System.out.println("заміна на: " + objAuto.toString());

                    for (int i = 0; i < arrAuto.length; i++) {
                        Arrays.fill(arrAuto[i], objAuto);
                    }
                    System.out.println(Arrays.deepToString(arrAuto));

                    break;

            }
        }
    }

    private static Auto[][] getAutos(HelmMaterials[] materials) {
        Auto[][] objAuto = new Auto[getRandom(2, 4)][getRandom(2, 4)];
        for (int i = 0; i < objAuto.length; i++) {
            for (int j = 0; j < objAuto[i].length; j++) {
                objAuto[i][j] = new Auto(getRandom(50, 600), getRandom(1930, 2023),
                        new Engine(getRandom(1, 16)), new Helm(getRandom(40, 60), materials[getRandom(0, 1)].toString()));
            }
        }
        return objAuto;
    }

    public static int getRandom(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Значення min має бути більшим за значення max");
        }
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;

    }

}
