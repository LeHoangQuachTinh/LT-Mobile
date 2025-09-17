package Bai10;

import java.util.Scanner;

class KhachHang {
    protected  String hoTen;
    protected  String soNha;
    protected  String maCongTo;

    public KhachHang(){}
    public KhachHang(String hoTen,String soNha,String maCongTo){
        this.hoTen = hoTen;
        this.soNha=soNha;
        this.maCongTo=maCongTo;
    }
    public void nhap(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Nhap ho ten chu ho: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap so nha: ");
        soNha = sc.nextLine();
        System.out.print("Nhap ma cong to: ");
        maCongTo = sc.nextLine();
    }

    public void hienThi() {
        System.out.printf("Chu ho: %s, So nha: %s, Ma cong to: %s\n",
                hoTen, soNha, maCongTo);
    }

    public String getHoTen() {
        return hoTen;
    }
}