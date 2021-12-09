package com.company;

public class Main {

    int[] mas = new int[]{4, 2, 9, 1, 3, 7, 8};

    public void ForSum(int sum) {

        for (int elements : mas) {
            sum += elements;
        }
        System.out.println(sum);
    }

    public void WhileSum(int sum, int i) {
        while ( i < mas.length) {
            sum += mas[i];
            i++;
        }
        System.out.println(sum);
    }

    public void DoWhileSum(int sum, int i) {
        do {
            sum += mas[i];
            i++;
        } while(i < mas.length);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Main res = new Main();
        res.ForSum(0);
        res.WhileSum(0, 0);
        res.DoWhileSum(0, 0);
    }
}
