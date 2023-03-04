package fei.stuba.uim.oop;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student(101, "Fero", "Mrkva", 20);
        students[1] = new Student(102, "Samo", "Dlhy", 21);
        students[2] = new Student(103, "Peto", "Kratky", 20);
        students[3] = new Student(104, "Jozo", "Mudry", 23);
        students[4] = new Student(105, "Tomas", "Pekny", 19);

        int size = students.length;

        int[] ids = new int[size];
        for (int i = 0; i < size; i++) {
            ids[i] = students[i].getID();
        }

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = students[i].getName();
        }

        String[] surenames = new String[size];
        for (int i = 0; i < size; i++) {
            surenames[i] = students[i].getSurename();
        }

        int[] ages = new int[size];
        for (int i = 0; i < size; i++) {
            ages[i] = students[i].getAge();
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Vyber si smer triedenia : vzostupne/zostupne");
        String inputOrder = scan.nextLine();

        System.out.println("Vyber si parameter triedenia : ID/meno/priezvisko/vek");
        String inputParameter = scan.nextLine();

        if (inputOrder.equals("vzostupne")) {
            switch(inputParameter) {
                case "ID":
                    Quicksort.intQuickSortAsc(ids, 0, size - 1);
                    System.out.println("Vzostupne zotriedene pole podla ID : " + Arrays.toString(ids));
                    break;

                case "meno":
                    Quicksort.stringQuickSortAsc(names, 0, size - 1);
                    System.out.println("Vzostupne zotriedene pole podla mena : " + Arrays.toString(names));
                    break;

                case "priezvisko":
                    Quicksort.stringQuickSortAsc(surenames, 0, size - 1);
                    System.out.println("Vzostupne zotriedene pole podla priezviska : " + Arrays.toString(surenames));
                    break;

                case "vek":
                    Quicksort.intQuickSortAsc(ages, 0, size - 1);
                    System.out.println("Vzostupne zotriedene pole podla veku : " + Arrays.toString(ages));
                    break;

                default:
                    System.out.println("Zle zadany parameter!");
                    break;
            }

        } else if (inputOrder.equals("zostupne")) {
            switch(inputParameter) {
                case "ID":
                    Quicksort.intQuickSortDesc(ids, 0, size - 1);
                    System.out.println("Zostupne zotriedene pole podla ID : " + Arrays.toString(ids));
                    break;

                case "meno":
                    Quicksort.stringQuickSortDesc(names, 0, size - 1);
                    System.out.println("Zostupne zotriedene pole podla mena : " + Arrays.toString(names));
                    break;

                case "priezvisko":
                    Quicksort.stringQuickSortDesc(surenames, 0, size - 1);
                    System.out.println("Zostupne zotriedene pole podla priezviska : " + Arrays.toString(surenames));
                    break;

                case "vek":
                    Quicksort.intQuickSortDesc(ages, 0, size - 1);
                    System.out.println("Zostupne zotriedene pole podla veku : " + Arrays.toString(ages));
                    break;

                default:
                    System.out.println("Zle zadany parameter!");
                    break;
            }

        } else System.out.println("Zle zadany smer!");

    }

    //Arrays.sort(arr);
    //Arrays.sort(arr, Collections.reverseOrder()); pri integeroch Integer[]!!
}