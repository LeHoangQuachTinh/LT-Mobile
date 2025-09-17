
import java.util.Scanner;

class CongNhan extends CanBo {
    private String bac_145;

    public CongNhan(){}

    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac_145) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac_145 = bac_145;
    }

    public String getBac_145() { 
        return bac_145; 
    }
    public void setBac_145(String bac_145) { 
        this.bac_145 = bac_145; 
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Bậc công nhân: " + this.bac_145);
    }
    @Override 
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("Nhập bậc công nhân: ");
        this.bac_145 = sc.nextLine();
    }
}