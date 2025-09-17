
import java.util.Scanner;

class ThiSinhKhoiA extends ThiSinh {
    private String mon1 = "Toán";
    private String mon2 = "Lý";
    private String mon3 = "Hóa";

    public ThiSinhKhoiA(){
    }
    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.printf("Khối thi: A (%s, %s, %s)", this.mon1, this.mon2, this.mon3);
    }
    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
    }
}