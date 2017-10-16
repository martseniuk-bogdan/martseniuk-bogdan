package com.company.lessons5OOP;

public class BubbleSorter {
    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {            // i - номер прохода
            boolean prov=true;
            for (int j = array.length - 1; j > i; j--) {     // внутренний цикл прохода
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    prov=false;
                }
            }
            if (exit(prov)) break;
        }
    }

    public static void underSort(int[] array) {

        for (int i = array.length - 1; i > 0; i-- ) {            // i - номер прохода
            boolean prov=true;
            for (int j = 0; j < i; j++) {     // внутренний цикл прохода
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    prov=false;
                }
            }
            if (exit(prov)) break;
        }
    }

    private static boolean exit(boolean prov) {
        if (prov){
            System.out.println("Досрочный выход");
            return true;
        }
        return false;
    }

}
