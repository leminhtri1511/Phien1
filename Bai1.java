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
public class Bai1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.print("Type a number: ");
        n = sc.nextDouble();
        if(n >= 0)
        {
            System.out.println("Number is positive");
        }
        else System.out.println("Number is negative");
    }
}
