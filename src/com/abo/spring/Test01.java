package com.abo.spring;


import org.testng.annotations.Test;

public class Test01 {
    public static void main(String[] args) {

        int[] arr = {1, 22, 3, 14, 5};

        int temp = 22;

        for (int num : arr) {
            if (temp == num) {
                System.out.println("存在"+num);
                return;
            }
        }
        System.out.println("不存在");
    }

    @Test
    public void de(){
        int[] arr = {1,2,3,4,5,6};
        //arr.bin
    }

    @Test
    public void test(){
        int x = 9;
        if (!(x == 3)){
            System.out.println("=");
        }else {
            System.out.println("!=");
        }
    }

    @Test
    public void opt(){
       new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("新线程");
           }
       }).start();
    }


    @Test
    public void testL(){
        new Thread(() ->{
            System.out.println("new thread...");
        }).start();
    }
}

