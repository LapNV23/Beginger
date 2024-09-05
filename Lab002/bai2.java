package Lab002;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pt: ax^2 + bx + c = 0");
        System.out.println("Enter number a:");
        int a = scanner.nextInt();
        System.out.println("Enter number b:");
        int b = scanner.nextInt();
        System.out.println("Enter number c:");
        int c = scanner.nextInt();

        float  x;
        if (a == 0) {
            x =(float) (- c / b);
            System.out.println("X = " + x);
        } else{
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Pt vô nghiệm.");
            } else if (delta == 0) {
                x = (float) - b / (2 * a);
                System.out.println("Pt có nghiệm kép X = "+ x);
            } else{
                float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phương trình có 2 nghiệm riêng biệt x1 = "+x1+" x2 = "+x2);
            }
        } scanner.close();
    }
}
