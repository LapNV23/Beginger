package Lab002;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>LỰA CHỌN TÍNH NĂNG<<");
        System.out.println("++...................++");
        System.out.println("1.Giải phương trình bậc nhất   |");
        System.out.println("2.Giải phương trình bậc hai   |");
        System.out.println("3.Tính số tiền điện   |");
        System.out.println("4. Kết thúc    |");
        System.out.println("++...................++");

        System.out.println("Nhập lựa chọn: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Pt: ax + b = 0");
                System.out.println("Enter number a: ");
                int a = scanner.nextInt();
                System.out.println("Enter number b: ");
                int b = scanner.nextInt();
                System.out.printf("Giải phương trình bậc nhất %dx + %d = 0"+ "\n", a,b);
                if (a == 0 && b == 0) {
                    System.out.println("Pt có vô số nghiệm.");
                } else if (a == 0 && b != 0) {
                    System.out.println("Pt vô nghiệm.");
                } else{
                    float x = (float) -b / a;
                    System.out.println("Phương trình có nghiệm x = " + x);
                }
                break;
        
            case 2:
                System.out.println("Pt: ax^2 + bx + c = 0");
                System.out.println("Enter number a:");
                a = scanner.nextInt();
                System.out.println("Enter number b:");
                b = scanner.nextInt();
                System.out.println("Enter number c:");
                int c = scanner.nextInt();
                System.out.printf("Giải phương trình bậc hai %d^2 + %dx + %d= 0 \n", a,b,c);
                float  x;
                if (a == 0) {
                    x =(float) (- c / b);
                    System.out.println(" Phương trình có nghiệm X = " + x);
                } else{
                    int delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        System.out.println("Pt vô nghiệm.");
                    } else if (delta == 0) {
                        x =(float) - b / (2 * a);
                        System.out.println("Pt có nghiệm kép X = "+ x);
                    } else{
                        float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                        float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                        System.out.println("Phương trình có 2 nghiệm riêng biệt x1 = "+x1+" x2 = "+x2);
                    }
                }
                break;
            case 3:
                float tien_dien;
                System.out.println("Nhập vào số điện :");
                float so_dien = scanner.nextFloat();
                if (so_dien <= 100 && so_dien >= 0) {
                    tien_dien = so_dien * 1000;
                    System.out.println("Số tiền  = "+tien_dien);
                } else if (so_dien >= 101) {
                    tien_dien = 100 * 1000 + (so_dien - 100) * 1500;
                    System.out.println("Số tiền = "+ tien_dien);
                } else{
                    System.out.println("Số diện bị lỗi");
                }
                break;
            case 4:
                System.out.println("Kết thúc trương trình.");
                break;
    
            default:
                System.exit(0);
                break;
        }
    }
}
