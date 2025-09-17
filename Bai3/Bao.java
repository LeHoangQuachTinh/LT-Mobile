
import java.util.Scanner;

class Bao extends TaiLieu {
    private String ngayPhatHanh_145;

    public Bao(){}

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh_145) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh_145 = ngayPhatHanh_145;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngày phát hành: " + ngayPhatHanh_145);
    }
    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
         System.out.print("Nhập ngày phát hành: " );
         this.ngayPhatHanh_145 = sc.nextLine();
    }
}