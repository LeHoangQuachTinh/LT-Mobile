import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class HoDan {
    private int soNha_145;
    private int soThanhVien_145;
    private List<Nguoi> thanhVien_145;

    public HoDan() {
        this.thanhVien_145 = new ArrayList<>();
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập số nhà: ");
        this.soNha_145 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số thành viên: ");
        this.soThanhVien_145 = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < this.soThanhVien_145; i++) {
            System.out.println("Nhập thông tin thành viên thứ " + (i + 1));
            Nguoi n = new Nguoi();
            n.nhapThongTin(sc);
            thanhVien_145.add(n);
        }
    }

    public void hienThiThongTin() {
        System.out.println("Số nhà: " + this.soNha_145 + ", Số thành viên: " + this.soThanhVien_145);
        for (Nguoi n : this.thanhVien_145) {
            n.hienThiThongTin();
        }
    }

    public boolean coNguoi80Tuoi(int namHienTai) {
        for (Nguoi n : this.thanhVien_145) {
            int tuoi = namHienTai - n.getNamSinh_145();
            if (tuoi == 80) {
                System.out.println("-> Nhà số " + this.soNha_145 + " có người mừng thượng thọ 80: " + n.getHoTen_145());
                return true;
            }
        }
        return false;
    }
}