package Bai7;

import java.util.Scanner;

public class HSHocSinh extends Nguoi {
    private String lop;
    private String khoaHoc;
    private String kyHoc;

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap lop: ");
        lop = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoaHoc = sc.nextLine();
        System.out.print("Nhap ky hoc: ");
        kyHoc = sc.nextLine();
    }

    public void hienThi() {
        super.hienThi();
        System.out.println("Lop: " + lop + ", Khoa hoc: " + khoaHoc + ", Ky hoc: " + kyHoc);
    }

    public String getLop() {
        return lop;
    }
}
