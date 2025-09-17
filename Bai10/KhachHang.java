package Bai10;

import java.util.Scanner;

class KhachHang {
    protected  String hoTen_145;
    protected  String soNha_145;
    protected  String maCongTo_145;

    public KhachHang(){}
    public KhachHang(String hoTen_145,String soNha_145,String maCongTo_145){
        this.hoTen_145 = hoTen_145;
        this.soNha_145=soNha_145;
        this.maCongTo_145=maCongTo_145;
    }
    public void nhap(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Nhap ho ten chu ho: ");
        hoTen_145 = sc.nextLine();
        System.out.print("Nhap so nha: ");
        soNha_145 = sc.nextLine();
        System.out.print("Nhap ma cong to: ");
        maCongTo_145 = sc.nextLine();
    }

    public void hienThi() {
        System.out.printf("Chu ho: %s, So nha: %s, Ma cong to: %s\n",
                hoTen_145, soNha_145, maCongTo_145);
    }

    public String getHoTen_145() {
        return hoTen_145;
    }
}