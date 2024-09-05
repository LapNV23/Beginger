package Lab002;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pt: ax + b = 0");
        System.out.println("Enter number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter number b: ");
        int b = scanner.nextInt();
        System.out.printf("Giải phương trình bậc nhất %dx + %d = 0"+ "\n", a,b);

        if (a == 0 && b == 0) {
            System.out.println("Pt có vô số nghiệm.");
        } else if (a == 0 && b!= 0) {
            System.out.println("Pt vô nghiệm.");
        } else{
            float x =(float) -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
        scanner.close();
    }
}
