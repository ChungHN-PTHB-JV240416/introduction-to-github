package demo;

import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tieptuc = true;
        while(tieptuc){
            System.out.println("  Nhập số lượng môn học muốn tính điểm trung bình");
            int soluong = scanner.nextInt();
            double[] mang = new double[soluong];
            for (int i = 0; i < soluong; i++) {
                System.out.println("nhập điểm môn thứ" + (i + 1) + ":");
                mang[i] = scanner.nextDouble();

            }
            double tongdiem = 0;
            for (int i = 0; i < soluong; i++) {
                tongdiem += mang[i];
            }
            double trungbinhmon = tongdiem / soluong;
            System.out.println("điểm trung bình môn là : " + trungbinhmon);
            System.out.println("bạn có muốn tiếp tục không? Điền (có hoặc không)");
            String traloi = scanner.next();
            if (traloi.equalsIgnoreCase("không")) {
                tieptuc = false;
            }
        }
        scanner.close();
        }
    }

