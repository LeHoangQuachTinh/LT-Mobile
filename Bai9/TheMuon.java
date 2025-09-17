package Bai9;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

class TheMuon {
    private String soPhieuMuon;
    private LocalDate ngayMuon;
    private LocalDate hanTra;
    private String soHieuSach;
    private SinhVien sv;

    public void nhap(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Nhap so phieu muon: ");
       String soPhieuMuon = sc.nextLine();
        System.out.print("Nhap ngay muon (dd/MM/yyyy): ");
        String strNgayMuon = sc.nextLine();
        ngayMuon = strToLocalDate(strNgayMuon);
        System.out.print("Nhap han tra (dd/MM/yyyy): ");
        String strHanTra = sc.nextLine();
        hanTra = strToLocalDate(strHanTra);
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
                soPhieuMuon, ngayMuon, hanTra, soHieuSach);
        sv.hienThi();
    }

    public boolean canTraCuoiThang() {
        // tách ngày từ hạn trả: định dạng dd/MM/yyyy
        try {
            String[] parts = hanTra.toString().split("/");
            int ngay = Integer.parseInt(parts[0]);
            // nếu ngày = 30 hoặc 31 thì coi là cuối tháng
            return (ngay == 30 || ngay == 31);
        } catch (Exception e) {
            return false;
        }
    }

    public String getTenSV() {
        return sv.getHoTen();
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }
}
