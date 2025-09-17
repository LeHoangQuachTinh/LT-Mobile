package Bai7;

import java.util.Scanner;

public class HSHocSinh extends Nguoi {
    private String lop_145;
    private String khoaHoc_145;
    private String kyHoc_145;

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap lop_145: ");
        lop_145 = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoaHoc_145 = sc.nextLine();
        System.out.print("Nhap ky hoc: ");
        kyHoc_145 = sc.nextLine();
    }

    public void hienThi() {
        super.hienThi();
        System.out.println("Lop_145: " + lop_145 + ", Khoa hoc: " + khoaHoc_145 + ", Ky hoc: " + kyHoc_145);
    }

    public String getLop_145() {
        return lop_145;
    }
}
