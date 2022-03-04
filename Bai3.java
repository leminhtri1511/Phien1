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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.print("nhap vao mot so: ");
        a=sc.nextDouble();
        int b;
        b =(int) a;
        if(b == 0)
        {
            System.out.println("Input value: "+b);
            System.out.println("zero number");
        }else if(b<1 || b>1000000){
            System.out.println("Input value: "+b);
            System.out.println("negative number");
        }else{
            System.out.println("Input value: "+b);
            System.out.println("positive number");
        }
    }
    
}
