﻿package 多线程与锁;

public class MyThread implements Runnable{

	public void run() {
        for (int i = 0; i < 100; i++) { 
            if ((i) % 10 == 0) { 
                System.out.println("-------" + i); 
            } 
            System.out.print(i); 
            try { 
                Thread.sleep(1); 
                System.out.print("    线程睡眠1毫秒！\n"); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
	}

}
