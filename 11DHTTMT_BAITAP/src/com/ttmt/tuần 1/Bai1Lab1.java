package BaiTap_Lab1;

import java.util.Scanner;

public class Bai1Lab1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thông tin sinh viên!");
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("ĐIểm TB: ");
        double diemTB = scanner.nextDouble();
        if (diemTB < 0 || diemTB > 10) {
            System.out.println("Vui lòng nhập lại điểm của bạn!");
        } else {
            System.out.print(hoTen + " " + diemTB + " điểm\n");
            System.out.println(hoTen + " " + diemTB + " điểm");
            System.out.printf("%s %f điểm", hoTen, diemTB);
        }
        scanner.close();
    }

}
