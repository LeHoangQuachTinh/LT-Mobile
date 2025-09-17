import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class KhuPho {
    private List<HoDan> dsHoDan_145;

    public KhuPho() {
        this.dsHoDan_145 = new ArrayList<>();
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap so ho dan: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin hộ dân thứ " + (i + 1));
            HoDan hd = new HoDan();
            hd.nhapThongTin(sc);
            dsHoDan_145.add(hd);
        }
    }

    public void hienThiHoCoNguoi80Tuoi() {
        int namHienTai = LocalDate.now().getYear();
        boolean timThay = false;
        for (HoDan hd : this.dsHoDan_145) {
            if (hd.coNguoi80Tuoi(namHienTai)) {
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không có hộ nào có người 80 tuổi trong năm " + namHienTai);
        }
    }
     public void hienThi() {
        for (HoDan hoDan : dsHoDan_145) {
            hoDan.hienThiThongTin();
        }
    }
}