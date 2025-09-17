
import java.util.Scanner;

class Nguoi {
    private String hoTen;
    private int namSinh;
    private String ngheNghiep;

    public Nguoi() {}

    public Nguoi(String hoTen, int namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        this.namSinh = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập nghề nghiệp: ");
        this.ngheNghiep = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.printf("Họ tên: %s, Năm sinh: %d, Nghề nghiệp: %s\n",this.hoTen, this.namSinh, this.ngheNghiep);
    }

    public int getNamSinh() {
        return this.namSinh;
    }

    public String getHoTen() {
        return this.hoTen;
    }
}