import java.util.*;


class HoDan {
    private int soNha;
    private int soThanhVien;
    private List<Nguoi> thanhVien;

    public HoDan() {
        this.thanhVien = new ArrayList<>();
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập số nhà: ");
        this.soNha = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số thành viên: ");
        this.soThanhVien = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < this.soThanhVien; i++) {
            System.out.println("Nhập thông tin thành viên thứ " + (i + 1));
            Nguoi n = new Nguoi();
            n.nhapThongTin(sc);
            thanhVien.add(n);
        }
    }

    public void hienThiThongTin() {
        System.out.println("Số nhà: " + this.soNha + ", Số thành viên: " + this.soThanhVien);
        for (Nguoi n : this.thanhVien) {
            n.hienThiThongTin();
        }
    }

    public boolean coNguoi80Tuoi(int namHienTai) {
        for (Nguoi n : this.thanhVien) {
            int tuoi = namHienTai - n.getNamSinh();
            if (tuoi == 80) {
                System.out.println("-> Nhà số " + this.soNha + " có người mừng thượng thọ 80: " + n.getHoTen());
                return true;
            }
        }
        return false;
    }
}