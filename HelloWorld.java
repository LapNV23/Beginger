import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Chào tất cả các cháu");
        // int so = 23;
        // int test = 5 + 9*3 -10/2;
        // System.out.println("test:"+ test);// printf line
        // System.out.printf("hello world");//printf không format code
        // System.out.printf("hello world");
        // int age=22;
        // String name = "LapNV";
        // System.out.println("My name is: "+name +" I am:" +age+"age");
         Scanner scanner = new Scanner(System.in);
        // System.out.println("Your name is: ");
        // String name = scanner.nextLine();
        // System.out.println("Your age is: ");
        // int age = scanner.nextInt();
        // System.out.println("My name is "+name+", age = "+age);
        // scanner.close();
        // System.out.println("First number : " + Math.sqrt(81 ));
        System.out.println("Student: ");
        String name = scanner.nextLine();
        System.out.println("Point: ");
        int point = scanner.nextInt();
        System.out.println("Student: " + name + " point: " + point);
        scanner.close();
    }
}
