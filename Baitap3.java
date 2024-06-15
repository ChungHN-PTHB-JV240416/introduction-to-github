package demo;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào cạnh của hình vuông");
            int canh = scanner.nextInt();
            int chuvi = canh*4;
            int dientich = canh * canh;
        if(canh<0){
            System.out.println("trương trình kết thúc");
            break;
        }
        System.out.println("chu vi của hình vuông là " + chuvi);
        System.out.println("diện tích của hình vuông là " + dientich);
        }
        scanner.close();
    }
}
