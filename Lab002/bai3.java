package Lab002;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        float tien_dien;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện :");
        float x = scanner.nextFloat();
        if (x <= 100 && x >= 0) {
            tien_dien = x * 1000;
            System.out.println("Số tiền  = "+tien_dien);
        } else if (x >= 101) {
            tien_dien = 100 * 1000 + (x - 100) * 1500;
            System.out.println("Số tiền = "+ tien_dien);
        } else{
            System.out.println("Số diện bị lỗi");
        }
        scanner.close();
    }
}
