import java.util.Scanner;

class ThiSinhKhoiB extends ThiSinhKhoiA {
    private String mon1 = "Toán";
    private String mon2 = "Hóa";
    private String mon3 = "Sinh";
    public ThiSinhKhoiB(){
    }
    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
          System.out.printf("Khối thi: B (%s, %s, %s)\n", this.mon1, this.mon2, this.mon3);
    }

    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
    }
}