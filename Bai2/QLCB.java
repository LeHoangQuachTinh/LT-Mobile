
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class QLCB {
    private List<CanBo> dscb = new ArrayList<>();

    public QLCB(){}

    public void nhapCanBo(Scanner sc) {
        System.out.println("Chọn loại cán bộ: 1.Công nhân  2.Kỹ sư  3.Nhân viên");
        int chon = Integer.parseInt(sc.nextLine());
        CanBo cb = null;
        switch (chon) {
            case 1:
                cb  = new CongNhan();
                break;
            case 2:
                cb = new KySu();
                break;
            case 3:
                cb = new NhanVien();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
        cb.nhapThongTin(sc);
        
        this.themCanBo(cb);
    }
    public void themCanBo(CanBo cb){
        this.dscb.add(cb);
    }
    public void timKiemTheoTen(String hoTen) {
        boolean found = false;
        for (CanBo cb : dscb) {
            if (cb.getHoTen_145().equalsIgnoreCase(hoTen)) {
                cb.hienThiThongTin();
                System.out.println("-----------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy cán bộ tên: " + hoTen);
        }
    }

    public void hienThiTatCa() {
        for (CanBo cb : dscb) {
            cb.hienThiThongTin();
            System.out.println("-----------------------");
        }
    }
}
