import java.util.Scanner;

class ThiSinhKhoiC extends ThiSinh {
    private String mon1 = "Văn";
    private String mon2 = "Sử";
    private String mon3 = "Địa";

    public ThiSinhKhoiC(){}
    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
       System.out.printf("Khối thi: C (%s, %s, %s)\n", this.mon1, this.mon2, this.mon3);
    }

    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
    }
}