import java.util.Scanner;

class ThiSinhKhoiC extends ThiSinh {
    private String mon1_145 = "Văn";
    private String mon2_145 = "Sử";
    private String mon3_145 = "Địa";

    public ThiSinhKhoiC(){}
    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
       System.out.printf("Khối thi: C (%s, %s, %s)\n", this.mon1_145, this.mon2_145, this.mon3_145);
    }

    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
    }
}