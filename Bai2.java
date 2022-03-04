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
public class Bai2 
{
     public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Input the 1st number: ");
        a = sc.nextInt();
        System.out.print("Input the 2st number: ");
        b = sc.nextInt();
        System.out.print("Input the 3st number: ");
        c = sc.nextInt();
        	if (a >= b && a >= c) 
                {
			System.out.println("The greatest: " + a);
		}
		if (b >= a && b >= c) 
                {
			System.out.println("The greatest: " + b);
		}
		if (c >= a && c >= b) 
                {
			System.out.println("The greatest: " + c);
		}
    }
    
}
