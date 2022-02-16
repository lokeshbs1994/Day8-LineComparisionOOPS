package com.bridgeLabz.lineComparisionOOPS;

import java.util.Scanner;

public class LineComparisionOOPS {
    public static void main(String[] args) {
        System.out.println("welcome to line comparision computation program");
        LineComparisionOOPS lineCompare = new LineComparisionOOPS();
        lineCompare.getLength();
    }

    public void getLength() {
        Scanner sc=new Scanner(System.in);
        int x1, x2, x3, x4, y1, y2, y3, y4;
        System.out.println("Enter a x1 and y1 value of a first point of line1: ");
        x1=sc.nextInt();
        y1=sc.nextInt();
        System.out.println("Enter a x2 and y2 value of a second point of line1: ");
        x2=sc.nextInt();
        y2=sc.nextInt();
        System.out.println("Enter a x3 and y3 value of a third point of line2: ");
        x3=sc.nextInt();
        y3=sc.nextInt();
        System.out.println("Enter a x4 and y4 value of a fourth point of line2: ");
        x4=sc.nextInt();
        y4=sc.nextInt();
        int length1= (int) Math.sqrt(Math.pow(x2-x1,  2) + Math.pow(y2-y1, 2));
        int length2= (int) Math.sqrt(Math.pow(x4-x3,  2) + Math.pow(y4-y3, 2));
        System.out.println("Length of a line1 is: " + length1);
        System.out.println("Length of a line2 is: " + length2);
        Integer lineLength1 = length1;
        Integer lineLength2 = length2;
        int result =lineLength1.compareTo(lineLength2);
        if(lineLength1.equals(lineLength2)) {
            System.out.println("Lines are equal");
        }
        else {
            System.out.println("Lines are not equal");
        }

        if(result > 0) {
            System.out.println("Line1 is greater than line2");
        }
        else if(result < 0) {
            System.out.println("Line1 is less than line2");
        }
        else {
            System.out.println("Line1 is equal to line2");
        }
    }
}
