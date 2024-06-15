package demo;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của người dùng");
        String name = scanner.nextLine();
        System.out.println("tên của mày là" + name);
        scanner.close();
    }
}
