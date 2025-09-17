package Bai6;
import java.util.Scanner;

class Nguoi {
    protected  String hoTen_145;
    protected  String ngaySinh_145;
    protected  String cmnd_145;

    public Nguoi() {}

    public Nguoi(String hoTen_145, String ngaySinh_145, String cmnd_145) {
        this.hoTen_145 = hoTen_145;
        this.ngaySinh_145 = ngaySinh_145;
        this.cmnd_145 = cmnd_145;
    }
     public Nguoi(String hoTen_145, String cmnd_145) {
        this.hoTen_145 = hoTen_145;
        this.cmnd_145 = cmnd_145;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập họ tên: ");
        this.hoTen_145 = sc.nextLine();
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        this.ngaySinh_145 = sc.nextLine();
        System.out.print("Nhập số CMND_145: ");
        this.cmnd_145 = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.printf("Họ tên: %s, Ngày sinh: %s, CMND_145: %s\n",hoTen_145, ngaySinh_145, cmnd_145);
    }

    public String getCmnd_145() {
        return cmnd_145;
    }

    public String getHoTen_145() {
        return hoTen_145;
    }
}
