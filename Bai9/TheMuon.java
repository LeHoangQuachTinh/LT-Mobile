package Bai9;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

class TheMuon {
    private String soPhieuMuon_145;
    private LocalDate ngayMuon_145;
    private LocalDate hanTra_145;
    private String soHieuSach;
    private SinhVien sv;

    public void nhap(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Nhap so phieu muon: ");
       String soPhieuMuon_145 = sc.nextLine();
        System.out.print("Nhap ngay muon (dd/MM/yyyy): ");
        String strNgayMuon_145 = sc.nextLine();
        ngayMuon_145 = strToLocalDate(strNgayMuon_145);
        System.out.print("Nhap han tra (dd/MM/yyyy): ");
        String strHanTra_145 = sc.nextLine();
        hanTra_145 = strToLocalDate(strHanTra_145);
        System.out.print("Nhap so hieu sach: ");
        soHieuSach = sc.nextLine();

        sv = new SinhVien();
        System.out.println("=== Nhap thong tin sinh vien ===");
        sv.nhap(sc);
    }
    private LocalDate strToLocalDate(String strDate){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = sdf.parse(strDate);
            return date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public void hienThi() {
        System.out.printf("So phieu: %s, Ngay muon: %s, Han tra: %s, So hieu sach: %s\n",
                soPhieuMuon_145, ngayMuon_145, hanTra_145, soHieuSach);
        sv.hienThi();
    }

    public boolean canTraCuoiThang() {
        // tách ngày từ hạn trả: định dạng dd/MM/yyyy
        try {
            String[] parts = hanTra_145.toString().split("/");
            int ngay = Integer.parseInt(parts[0]);
            // nếu ngày = 30 hoặc 31 thì coi là cuối tháng
            return (ngay == 30 || ngay == 31);
        } catch (Exception e) {
            return false;
        }
    }

    public String getTenSV() {
        return sv.getHoTen_145();
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }
}
