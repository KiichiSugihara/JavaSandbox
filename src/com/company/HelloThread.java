package com.company;

public class HelloThread{
    public static void main(String []args){
        Counter1 cnt1 = new Counter1();
        Thread th1 = new Thread(cnt1);
        th1.start();
        Counter2 cnt2 = new Counter2();
        Thread th2 = new Thread(cnt2);
        th2.start();
        Counter3 cnt3 = new Counter3();
        Thread th3 = new Thread(cnt3);
        th3.start();
    }
}

class Counter1 implements Runnable {
    public void run() {
        int i=0;
        while(i<=100) {
            System.out.println(i);
            i=i+1;
        }
    }
}
class Counter2 implements Runnable {
    public void run() {
        int i=100;
        while(i>=0) {
            System.out.println(i);
            i=i-1;
        }
    }
}
class Counter3 implements Runnable {
    public void run() {
        int i=200;
        int sum=0;
        while(i<=300) {
            sum=sum+i;
            i=i+1;
        }
        System.out.println(sum);
    }
}