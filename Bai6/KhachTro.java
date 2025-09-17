package Bai6;

import java.util.Scanner;

class KhachTro extends  Nguoi{
    private int soNgayTro_145;
    private String loaiPhong_145;
    private double giaPhong_145;

    public KhachTro() {

    }
    public KhachTro(String hoTen,String CMND,int soNgayTro_145,String loaiPhong_145,double giaPhong_145){
        this.hoTen_145 = hoTen;
        this.cmnd_145 = CMND;
        this.soNgayTro_145 = soNgayTro_145;
        this.loaiPhong_145 = loaiPhong_145;
        this.giaPhong_145 = giaPhong_145;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhập số ngày trọ: ");
        this.soNgayTro_145 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập loại phòng: ");
        this.loaiPhong_145 = sc.nextLine();
        System.out.print("Nhập giá phòng/ngày: ");
        this.giaPhong_145 = Double.parseDouble(sc.nextLine());
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.printf("Số ngày trọ: %d, Loại phòng: %s, Giá phòng/ngày: %.2f\n",
                          soNgayTro_145, loaiPhong_145, giaPhong_145);
    }

    public String getCmnd() {
        return this.cmnd_145;
    }

    public double tinhTien() {
        return soNgayTro_145 * giaPhong_145;
    }
}
