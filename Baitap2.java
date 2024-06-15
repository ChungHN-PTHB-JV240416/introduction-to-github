package demo;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b = 0.00003929;
        while (true) {
            System.out.println("nhập số tiền muốn chuyển đổi(nhập số âm để thoát trương trình)");
            long a = scanner.nextLong();
            if (a<0){
                System.out.println("trương  trình kết thúc");
                break;
            }
            System.out.printf("Số tiền nhập được chuyển đổi thành %.5f USD%n", a * b);
        }
        scanner.close();
    }
}
