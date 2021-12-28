package Bai14.BubbleSort;

public class BubbleSort {
    static int[] list = {1, 4, 7, 2, -1, 12, 16, 13, 21};
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass ; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if(list[j] > list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i] + " ");
    }
}
