
import java.util.Scanner;

class CanBo {
    protected  String hoTen_145;
    protected  String ngaySinh_145;
    protected String gioiTinh_145;
    protected String diaChi_145;

    public CanBo() {
        
    }

    public CanBo(String hoTen_145, String ngaySinh_145, String gioiTinh_145, String diaChi_145) {
        this.hoTen_145 = hoTen_145;
        this.ngaySinh_145 = ngaySinh_145;
        this.gioiTinh_145 = gioiTinh_145;
        this.diaChi_145 = diaChi_145;
    }

    public String getHoTen_145() { 
        return this.hoTen_145;
    }
    public void setHoTen_145(String hoTen_145) {
        this.hoTen_145 = hoTen_145; 
    }

    public String getNgaySinh_145() { 
        return this.ngaySinh_145; 
    }
    public void setNgaySinh_145(String ngaySinh_145) {
         this.ngaySinh_145 = ngaySinh_145; 
    }

    public String getGioiTinh_145() { 
        return this.gioiTinh_145; 
    }
    public void setGioiTinh_145(String gioiTinh_145) { 
        this.gioiTinh_145 = gioiTinh_145; 
    }

    public String getDiaChi_145() { 
        return this.diaChi_145; 
    }
    public void setDiaChi_145(String diaChi_145) { 
        this.diaChi_145 = diaChi_145; 
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + this.hoTen_145);
        System.out.println("Ngày sinh: " + this.ngaySinh_145);
        System.out.println("Giới tính: " + this.gioiTinh_145);
        System.out.println("Địa chỉ: " + this.diaChi_145);
    }
    public void nhapThongTin(Scanner sc){
        System.out.print("Nhập họ tên: ");
        this.hoTen_145 = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        this.ngaySinh_145 = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        this.gioiTinh_145 = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.diaChi_145 = sc.nextLine();
    }
}