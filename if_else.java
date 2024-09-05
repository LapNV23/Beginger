import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        // int score = 3;
        // if (score > 5) {
        //     System.out.println("Pass");
        // } else {
        //     System.out.println("Not pass");
        // }

        //Task easy:Nhập vào số thuế, dùng if_else
        // dưới 10M: không đóng thuế;
        // từ 10-15M: đóng 10%;
        //từ 15-30M: đóng 20%;
        // trên 30M: đóng 50%;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền thuế: ");
        int price = scanner.nextInt();
        if (price < 10) {
            System.out.println("Không đóng thuế.");
        } else if (price >= 10 && price <= 15) {
            System.out.println("Thuế 10%");
        } else if (price > 15 && price <= 30) {
            System.out.println("Thuế 20%");
        }else{
            System.out.println("Thuế 50%");
        }
        scanner.close();
        
    }
}
