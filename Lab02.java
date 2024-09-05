import java.util.Scanner;
public class Lab02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pt: ax + b = 0");
        System.out.println("Enter number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter number b: ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Pt có vô số nghiệm.");
        } else if (a == 0 && b!= 0) {
            System.out.println("Pt vô nghiệm.");
        } else{
            int x = -b / a;
            System.out.println("x = " + x);
        }
        scanner.close();
    }
}
