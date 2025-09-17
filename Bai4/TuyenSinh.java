import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class TuyenSinh {
    private final List<ThiSinh> danhSach = new ArrayList<>();

    // Nhập thông tin thí sinh
    public void nhapThiSinh(Scanner sc) {
        System.out.println("Chọn khối thi: 1.Khối A  2.Khối B  3.Khối C");
        int loai = Integer.parseInt(sc.nextLine());

        ThiSinh ts_145 = null;

        switch (loai) {
            case 1:
                ts_145 = new ThiSinhKhoiA();
                break;
            case 2:
               ts_145 = new ThiSinhKhoiB();
                break;
            case 3:
               ts_145 = new ThiSinhKhoiC();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
        ts_145.nhapThongTin(sc);
        this.themThiSinh(ts_145);
    }
    public void themThiSinh(ThiSinh ts_145){
        this.danhSach.add(ts_145);
    }
    public void hienThiTatCa() {
        for (ThiSinh ts_145 : this.danhSach) {
            ts_145.hienThiThongTin();
            System.out.println("------------------");
        }
    }

    public void timKiemTheoSBD(String sbd) {
        boolean found = false;
        for (ThiSinh ts_145 : this.danhSach) {
            if (ts_145.getSoBaoDanh_145().equalsIgnoreCase(sbd)) {
                ts_145.hienThiThongTin();
                System.out.println("------------------");
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy thí sinh có SBD: " + sbd);
    }
}