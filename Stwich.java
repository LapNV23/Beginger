import java.util.Scanner;
public class Stwich {
    public static void main(String[] args) {
//         int day = 8;
//     switch(day){
//         case 1:
//             System.out.println("Monday");
//             break;
//         case 2:
//             System.out.println("Tuesday");
//             break;
//         case 3:
//             System.out.println("Wednesday");
//             break;
//         case 4:
//             System.out.println("Thursday");
//             break;
//         case 5:
//             System.out.println("Friday");
//             break;
//         case 6:
//             System.out.println("Saturday");
//             break;
//         case 7:
//             System.out.println("Sunday");
//             break;
//         default:
//             System.out.println("Don't know.");
// }
        //Task easy:
        System.out.println(">>Lựa chọn tính năng<<");
        System.out.println("++...........++");
        System.out.println("1.Cộng    |");
        System.out.println("2.Trừ     |");
        System.out.println("3.Kết thúc  |");
        System.out.println("++...........++");
        System.out.println("Lựa chọn của bạn là: ");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Bạn chọn phép cộng");
                break;
            case 2:
                System.out.println("Bạn chọn phép trừ");
                break;
            default:
                System.out.println("Bạn chọn thoát chương trình");
                System.exit(0);
        }
        // int on = scanner.nextInt();
        scanner.close();
    }
    
}
