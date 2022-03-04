import java.util.Scanner;
import java.lang.Math;
import javax.sound.midi.SysexMessage;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap vao so b: ");
        double b =sc.nextDouble();
        a = Math.round(a * 1000);
        a = a / 1000;
        b =Math.round(b * 1000);
        b = b / 1000;
        if (a == b) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    }
}
