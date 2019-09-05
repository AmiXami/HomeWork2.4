package com.company;

import java.sql.SQLOutput;

public class Runners extends Thread {

    Thread runners1 = new Thread("Runner 1 ");
    Thread runners2 = new Thread("Runner 2");
    Thread runners3 = new Thread("Runner 3");
    Thread runners4 = new Thread("Runner 4");
    Thread runners5 = new Thread("Runner 5");

    @Override
    public void run() {
        super.run();
        System.out.println( runners1.getName() + " Берет палочку " );
        System.out.println(runners1.getName() + " Бежит к " + runners2.getName());
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(runners2.getName() + " Берет Палочку " );
        System.out.println(runners2.getName() + " Бежит к " + runners3.getName());
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runners3.getName() + " Берет Палочку " );
        System.out.println(runners3.getName() + " Бежит к " + runners4.getName());
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runners4.getName() + " Берет Палочку " );
        System.out.println(runners4.getName() + " Бежит к " + runners5.getName());
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runners5.getName() + " Берет Палочку " );
        System.out.println(runners5.getName() + " Бежит к финишу");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runners5.getName() + " Бежит к " + runners4.getName());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runners4.getName() + " Берет Палочку " );
        System.out.println(runners4.getName() + " Бежит к " + runners3.getName());
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runners3.getName() + " Берет Палочку " );
        System.out.println(runners3.getName() + " Бежит к " + runners2.getName());
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runners2.getName() + " Берет Палочку " );
        System.out.println(runners2.getName() + " Бежит к " + runners1.getName());
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runners1.getName() + " Берет Палочку ");
        System.out.println("Финишь");
    }
}

