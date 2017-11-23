package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        final int ZERO = 0;
        StringWriter stringWriter = new StringWriter();

        try {
            int x = 5 / ZERO;
        } catch(ArithmeticException arEx) {
            /* 印出錯誤訊息 */
            System.out.println("ArithmeticException: " + arEx.getMessage());
            //ArithmeticException: / by zero
        }

        try
        {
            int[] ints = new int[10];
            ints[100] = 100;
        }
        catch(ArrayIndexOutOfBoundsException  arrayEx) {
            /* 印出詳細的錯誤訊息 */
            arrayEx.printStackTrace(new PrintWriter(stringWriter));
            System.out.println(stringWriter.toString());
            //java.lang.ArrayIndexOutOfBoundsException: 100
            //at com.company.Main.main(Main.java:21)
            //
        }

        try {
            FileInputStream inputStream = new FileInputStream("someText.text");
        } catch (FileNotFoundException e) {
            /* 印出上一個的錯誤訊息的流程 */
            StackTraceElement[] ste = e.getStackTrace();
            for (StackTraceElement stackTraceElement : ste)
                System.out.println(stackTraceElement.toString());

            //java.io.FileInputStream.open0(Native Method)
            //java.io.FileInputStream.open(FileInputStream.java:195)
            //java.io.FileInputStream.<init>(FileInputStream.java:138)
            //java.io.FileInputStream.<init>(FileInputStream.java:93)
            //com.company.Main.main(Main.java:30)
        }
    }
}
