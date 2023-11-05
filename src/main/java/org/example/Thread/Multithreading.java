package org.example.Thread;

public class Multithreading {
    static boolean isFive = false;

    public static void main(String[] args) {

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (true) {
                        if (i == 5) {
                            isFive = true;
                        }
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }

                } catch (Exception e) {

                }

            }
        });
        timer.start();

        Thread timer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (!isFive) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }

                } catch (Exception e) {

                }

            }
        });
        timer1.start();

    }
}
