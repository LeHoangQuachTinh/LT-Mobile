
import java.util.Scanner;

class TaiLieu {
    protected  String maTaiLieu_145;
    protected   String tenNhaXuatBan_145;
    protected  int soBanPhatHanh_145;

    public TaiLieu(){};

    public TaiLieu(String maTaiLieu_145, String tenNhaXuatBan_145, int soBanPhatHanh_145) {
        this.maTaiLieu_145 = maTaiLieu_145;
        this.tenNhaXuatBan_145 = tenNhaXuatBan_145;
        this.soBanPhatHanh_145 = soBanPhatHanh_145;
    }

    public String getMaTaiLieu_145() { 
        return this.maTaiLieu_145; 
    }
    public String getTenNhaXuatBan_145() { 
        return this.tenNhaXuatBan_145; 
    }
    public int getSoBanPhatHanh_145() { 
        return this.soBanPhatHanh_145; 
    }

    public void hienThiThongTin() {
        System.out.println("Mã tài liệu: " + this.maTaiLieu_145);
        System.out.println("Nhà xuất bản: " + this.tenNhaXuatBan_145);
        System.out.println("Số bản phát hành: " + this.soBanPhatHanh_145);
    }
    public void nhapThongTin(Scanner sc){
        System.out.print("Nhập mã tài liệu: " );
        this.maTaiLieu_145 = sc.nextLine();
        System.out.print("Nhập nhà xuất bản: " );
        this.tenNhaXuatBan_145 = sc.nextLine();
        System.out.print("Nhập số bản phát hành: " );
        this.soBanPhatHanh_145 = sc.nextInt();
    }
}