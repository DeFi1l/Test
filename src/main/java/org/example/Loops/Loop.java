package org.example.Loops;

public class Loop {
    public static void main(String[] args) {
        int a = 10;
        a = a + 1;
        a += 1;
        a++;
        a = a - 1;
        a -= 1;
        a--;

        int j = 1000;
        while (j >= 0) {
            j--;
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

        int sum = 0;
        int count = 0;


        while (count <= 100) {
            sum += count;
            count++;
        }
        float result = sum / (float) count;
        System.out.println(result);

        int b = 0;
        do {
            System.out.println("Привет!");
        }
        while (b > 0);

        for (int i = 1000; i > 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);

            }
        }
    }
}
