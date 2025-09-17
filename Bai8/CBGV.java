package Bai8;

import java.util.Scanner;

public class CBGV extends Nguoi {
    private double luongCung;
    private double thuong;
    private double phat;

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap luong cung: ");
        luongCung = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap thuong: ");
        thuong = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap phat: ");
        phat = Double.parseDouble(sc.nextLine());
    }

    public double tinhLuongThucLinh() {
        return luongCung + thuong - phat;
    }

    public void hienThi() {
        super.hienThi();
        System.out.println("Luong cung: " + luongCung + 
                           ", Thuong: " + thuong + 
                           ", Phat: " + phat + 
                           ", Luong thuc linh: " + tinhLuongThucLinh());
    }
}
