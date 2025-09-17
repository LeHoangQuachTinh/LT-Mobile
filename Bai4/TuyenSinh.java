import java.util.*;
class TuyenSinh {
    private final List<ThiSinh> danhSach = new ArrayList<>();

    // Nhập thông tin thí sinh
    public void nhapThiSinh(Scanner sc) {
        System.out.println("Chọn khối thi: 1.Khối A  2.Khối B  3.Khối C");
        int loai = Integer.parseInt(sc.nextLine());

        ThiSinh ts = null;

        switch (loai) {
            case 1:
                ts = new ThiSinhKhoiA();
                break;
            case 2:
               ts = new ThiSinhKhoiB();
                break;
            case 3:
               ts = new ThiSinhKhoiC();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
        ts.nhapThongTin(sc);
        this.themThiSinh(ts);
    }
    public void themThiSinh(ThiSinh ts){
        this.danhSach.add(ts);
    }
    public void hienThiTatCa() {
        for (ThiSinh ts : this.danhSach) {
            ts.hienThiThongTin();
            System.out.println("------------------");
        }
    }

    public void timKiemTheoSBD(String sbd) {
        boolean found = false;
        for (ThiSinh ts : this.danhSach) {
            if (ts.getSoBaoDanh().equalsIgnoreCase(sbd)) {
                ts.hienThiThongTin();
                System.out.println("------------------");
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy thí sinh có SBD: " + sbd);
    }
}