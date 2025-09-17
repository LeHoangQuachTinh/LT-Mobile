
import java.util.Scanner;

class TapChi extends TaiLieu {
    private int soPhatHanh_145;
    private int thangPhatHanh_145;

    public TapChi(){}

    public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh_145, int thangPhatHanh_145) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh_145 = soPhatHanh_145;
        this.thangPhatHanh_145 = thangPhatHanh_145;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số phát hành: " + this.soPhatHanh_145);
        System.out.println("Tháng phát hành: " + this.thangPhatHanh_145);
    }
    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("Nhập số phát hành: ");
        this.soPhatHanh_145 = sc.nextInt();
        System.out.print("Nhập tháng phát hành: ");
        this.thangPhatHanh_145 = sc.nextInt();
    }
}