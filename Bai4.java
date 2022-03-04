/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaphien1;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Bai4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        switch (a) 
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
