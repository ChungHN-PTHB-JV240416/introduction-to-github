package demo;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        boolean tieptuc = true;
        Scanner scanner = new Scanner(System.in);
       while (tieptuc){
           System.out.println(" Nhập bán kính hình tròn ");
           double r = scanner.nextDouble();
           double pi = 3.14;
           System.out.println("Chu vi của hình tròn là " +(2 * pi * r));
           System.out.println("Diện tích hình tròn là " + (pi * r * r));
           System.out.println("Bạn có muôn tiếp tục không? Nhập có hoặc không");
           String traloi = scanner.next();
           if (traloi.equalsIgnoreCase("không")){
               tieptuc=false;
           }
       }
       scanner.close();
    }
}
