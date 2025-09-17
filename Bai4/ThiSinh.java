
import java.util.Scanner;

class ThiSinh {
    protected  String soBaoDanh;
    protected  String hoTen;
    protected String diaChi;
    protected String uuTien;

    public ThiSinh(){}
    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public String getSoBaoDanh() { 
        return this.soBaoDanh; 
    }
    public String getHoTen() { 
        return this.hoTen; 
    }
    public String getDiaChi() { 
        return this.diaChi; 
    }
    public String getUuTien() { 
        return this.uuTien; 
    }

    public void hienThiThongTin() {
        System.out.println("SBD: " + this.soBaoDanh);
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Địa chỉ: " + this.diaChi);
        System.out.println("Ưu tiên: " + this.uuTien);
    }
    public void nhapThongTin(Scanner sc){
        System.out.print("Nhập SBD: ");
        this.soBaoDanh = sc.nextLine();
        System.out.print("Nhập họ tên: " );
        this.hoTen = sc.nextLine();
        System.out.print("Nhập địa chỉ: " );
        this.diaChi = sc.nextLine();
        System.out.print("Nhập ưu tiên: ");
        this.uuTien = sc.nextLine();
    }
}
