
import java.util.Scanner;

class ThiSinh {
    protected  String soBaoDanh_145;
    protected  String hoTen_145;
    protected String diaChi_145;
    protected String uuTien_145;

    public ThiSinh(){}
    public ThiSinh(String soBaoDanh_145, String hoTen_145, String diaChi_145, String uuTien_145) {
        this.soBaoDanh_145 = soBaoDanh_145;
        this.hoTen_145 = hoTen_145;
        this.diaChi_145 = diaChi_145;
        this.uuTien_145 = uuTien_145;
    }

    public String getSoBaoDanh_145() { 
        return this.soBaoDanh_145; 
    }
    public String getHoTen_145() { 
        return this.hoTen_145; 
    }
    public String getDiaChi_145() { 
        return this.diaChi_145; 
    }
    public String getUuTien_145() { 
        return this.uuTien_145; 
    }

    public void hienThiThongTin() {
        System.out.println("SBD: " + this.soBaoDanh_145);
        System.out.println("Họ tên: " + this.hoTen_145);
        System.out.println("Địa chỉ: " + this.diaChi_145);
        System.out.println("Ưu tiên: " + this.uuTien_145);
    }
    public void nhapThongTin(Scanner sc){
        System.out.print("Nhập SBD: ");
        this.soBaoDanh_145 = sc.nextLine();
        System.out.print("Nhập họ tên: " );
        this.hoTen_145 = sc.nextLine();
        System.out.print("Nhập địa chỉ: " );
        this.diaChi_145 = sc.nextLine();
        System.out.print("Nhập ưu tiên: ");
        this.uuTien_145 = sc.nextLine();
    }
}
