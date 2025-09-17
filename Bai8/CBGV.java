package Bai8;

import java.util.Scanner;

public class CBGV extends Nguoi {
    private double luongCung_145;
    private double thuong_145;
    private double phat_145;

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap luong cung: ");
        luongCung_145 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap thuong_145: ");
        thuong_145 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap phat_145: ");
        phat_145 = Double.parseDouble(sc.nextLine());
    }

    public double tinhLuongThucLinh() {
        return luongCung_145 + thuong_145 - phat_145;
    }

    public void hienThi() {
        super.hienThi();
        System.out.println("Luong cung: " + luongCung_145 + 
                           ", Thuong_145: " + thuong_145 + 
                           ", Phat_145: " + phat_145 + 
                           ", Luong thuc linh: " + tinhLuongThucLinh());
    }
}
