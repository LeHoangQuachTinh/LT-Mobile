
import java.util.Scanner;

class Nguoi {
    private String hoTen_145;
    private int namSinh_145;
    private String ngheNghiep_145;

    public Nguoi() {}

    public Nguoi(String hoTen_145, int namSinh_145, String ngheNghiep_145) {
        this.hoTen_145 = hoTen_145;
        this.namSinh_145 = namSinh_145;
        this.ngheNghiep_145 = ngheNghiep_145;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập họ tên: ");
        this.hoTen_145 = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        this.namSinh_145 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập nghề nghiệp: ");
        this.ngheNghiep_145 = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.printf("Họ tên: %s, Năm sinh: %d, Nghề nghiệp: %s\n",this.hoTen_145, this.namSinh_145, this.ngheNghiep_145);
    }

    public int getNamSinh_145() {
        return this.namSinh_145;
    }

    public String getHoTen_145() {
        return this.hoTen_145;
    }
}