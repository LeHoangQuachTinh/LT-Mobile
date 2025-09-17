
import java.util.Scanner;

class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao(){}

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngày phát hành: " + ngayPhatHanh);
    }
    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
         System.out.print("Nhập ngày phát hành: " );
         this.ngayPhatHanh = sc.nextLine();
    }
}