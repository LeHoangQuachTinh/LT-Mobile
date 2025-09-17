package Bai6;
import java.util.Scanner;

class Nguoi {
    protected  String hoTen;
    protected  String ngaySinh;
    protected  String cmnd;

    public Nguoi() {}

    public Nguoi(String hoTen, String ngaySinh, String cmnd) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
    }
     public Nguoi(String hoTen, String cmnd) {
        this.hoTen = hoTen;
        this.cmnd = cmnd;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        this.ngaySinh = sc.nextLine();
        System.out.print("Nhập số CMND: ");
        this.cmnd = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.printf("Họ tên: %s, Ngày sinh: %s, CMND: %s\n",hoTen, ngaySinh, cmnd);
    }

    public String getCmnd() {
        return cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }
}
