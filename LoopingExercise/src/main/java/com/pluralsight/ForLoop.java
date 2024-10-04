package com.pluralsight;

public class ForLoop {

    public static void main(String[] args) throws InterruptedException
    {
        int i;
        for (i = 10; i >= 0; i--)
        {
            if (i >= 1)
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
            else if (i == 0)
            {
                Thread.sleep(1000);
                System.out.println("Launch!");
            }
        }
    }
}
