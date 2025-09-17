
import java.util.Scanner;

class ThiSinhKhoiA extends ThiSinh {
    private String mon1_145 = "Toán";
    private String mon2_145 = "Lý";
    private String mon3_145 = "Hóa";

    public ThiSinhKhoiA(){
    }
    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.printf("Khối thi: A (%s, %s, %s)", this.mon1_145, this.mon2_145, this.mon3_145);
    }
    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
    }
}