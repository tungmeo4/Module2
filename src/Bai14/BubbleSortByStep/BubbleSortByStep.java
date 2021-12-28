package Bai14.BubbleSortByStep;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass ; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i ; j++) {
                if(list[j] > list[j + 1]) {
                    System.out.println("Swap " + list[j] + " with " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the " + i + " sort: ");
            for (int k = 0; k < list.length; k++) {
                System.out.println(list[k] + "\t");
            }
            System.out.println();
        }
    }
}
