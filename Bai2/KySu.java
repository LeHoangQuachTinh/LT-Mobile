
import java.util.Scanner;

class KySu extends CanBo {
    private String nganhDaoTao_145;

    public KySu(){}

    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao_145) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganhDaoTao_145 = nganhDaoTao_145;
    }


    public String getNganhDaoTao_145() { 
        return this.nganhDaoTao_145; 
    }
    public void setNganhDaoTao_145(String nganhDaoTao_145) { 
        this.nganhDaoTao_145 = nganhDaoTao_145; 
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngành đào tạo: " + nganhDaoTao_145);
    }
    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("Nhập ngành đào tạo:");
        this.nganhDaoTao_145 = sc.nextLine();
    }
}