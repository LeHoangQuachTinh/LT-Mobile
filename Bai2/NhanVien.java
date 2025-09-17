
import java.util.Scanner;

class NhanVien extends CanBo {
    private String congViec_145;

    public NhanVien(){}
    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec_145) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec_145 = congViec_145;
    }

    public String getCongViec_145() { 
        return this.congViec_145; 
    }
    public void setCongViec_145(String congViec_145) { 
        this.congViec_145 = congViec_145; 
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Công việc: " + this.congViec_145);
    }
    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.err.print("Nhập công việc:");
        this.congViec_145 = sc.nextLine();
    }
}