
import java.util.Scanner;

class TaiLieu {
    protected  String maTaiLieu;
    protected   String tenNhaXuatBan;
    protected  int soBanPhatHanh;

    public TaiLieu(){};

    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() { 
        return this.maTaiLieu; 
    }
    public String getTenNhaXuatBan() { 
        return this.tenNhaXuatBan; 
    }
    public int getSoBanPhatHanh() { 
        return this.soBanPhatHanh; 
    }

    public void hienThiThongTin() {
        System.out.println("Mã tài liệu: " + this.maTaiLieu);
        System.out.println("Nhà xuất bản: " + this.tenNhaXuatBan);
        System.out.println("Số bản phát hành: " + this.soBanPhatHanh);
    }
    public void nhapThongTin(Scanner sc){
        System.out.print("Nhập mã tài liệu: " );
        this.maTaiLieu = sc.nextLine();
        System.out.print("Nhập nhà xuất bản: " );
        this.tenNhaXuatBan = sc.nextLine();
        System.out.print("Nhập số bản phát hành: " );
        this.soBanPhatHanh = sc.nextInt();
    }
}