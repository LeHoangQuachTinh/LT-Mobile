package Bai6;

import java.util.Scanner;

class KhachTro extends  Nguoi{
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;

    public KhachTro() {

    }
    public KhachTro(String hoTen,String CMND,int soNgayTro,String loaiPhong,double giaPhong){
        this.hoTen = hoTen;
        this.cmnd = CMND;
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhập số ngày trọ: ");
        this.soNgayTro = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập loại phòng: ");
        this.loaiPhong = sc.nextLine();
        System.out.print("Nhập giá phòng/ngày: ");
        this.giaPhong = Double.parseDouble(sc.nextLine());
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.printf("Số ngày trọ: %d, Loại phòng: %s, Giá phòng/ngày: %.2f\n",
                          soNgayTro, loaiPhong, giaPhong);
    }

    public String getCmnd() {
        return this.cmnd;
    }

    public double tinhTien() {
        return soNgayTro * giaPhong;
    }
}
