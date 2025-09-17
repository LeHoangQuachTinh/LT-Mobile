
import java.util.*;
class QuanLySach {
    private List<TaiLieu> danhSach = new ArrayList<>();


    public QuanLySach(){}
    public void nhapTaiLieu(Scanner sc) {
        System.out.println("Chọn loại tài liệu: 1.Sách  2.Tạp chí  3.Báo");
        int loai = Integer.parseInt(sc.nextLine());

        TaiLieu tl = null;

        switch (loai) {
            case 1:
                tl = new Sach();
                break;
            case 2:
                tl = new TapChi();
                break;
            case 3:
                tl = new Bao(); 
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
        if (tl != null) {
            tl.nhapThongTin(sc);
            this.themTaiLieu(tl);
        }

    }
    public void themTaiLieu(TaiLieu tl){
        this.danhSach.add(tl);
    }

    public void timKiemTheoMa(String ma) {
        boolean found = false;
        for (TaiLieu tl : danhSach) {
            if (tl.getMaTaiLieu().equalsIgnoreCase(ma)) {
                tl.hienThiThongTin();
                System.out.println("-------------------");
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy tài liệu có mã: " + ma);
    }

    public void timKiemTheoLoai(String loai) {
        boolean found = false;
        for (TaiLieu tl : danhSach) {
            if ((loai.equalsIgnoreCase("sach") && tl instanceof Sach) ||
                (loai.equalsIgnoreCase("tapchi") && tl instanceof TapChi) ||
                (loai.equalsIgnoreCase("bao") && tl instanceof Bao)) {
                tl.hienThiThongTin();
                System.out.println("-------------------");
                found = true;
            }
        }
        if (!found) System.out.println("Không có tài liệu thuộc loại: " + loai);
    }

    public void hienThiTatCa() {
        for (TaiLieu tl : danhSach) {
            tl.hienThiThongTin();
            System.out.println("-------------------");
        }
    }
}