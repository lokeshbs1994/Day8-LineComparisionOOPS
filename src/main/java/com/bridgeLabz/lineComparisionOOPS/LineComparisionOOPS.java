package com.bridgeLabz.lineComparisionOOPS;

import java.util.Scanner;

public class LineComparisionOOPS {
    public static void main(String[] args) {
        System.out.println("welcome to line comparision computation program");
        LineComparisionOOPS lineCompare = new LineComparisionOOPS();
        lineCompare.getLength();
    }

    public void getLength() {
        Scanner sc = new Scanner(System.in);
        int x1, x2, y1, y2;
        System.out.print("Enter a x1 and y1 value of a first point: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("Enter a x2 and y2 value of a second point: ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        int length = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of a line is: " + length);
    }
}
