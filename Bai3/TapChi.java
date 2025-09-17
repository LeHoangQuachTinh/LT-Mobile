
import java.util.Scanner;

class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(){}

    public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số phát hành: " + this.soPhatHanh);
        System.out.println("Tháng phát hành: " + this.thangPhatHanh);
    }
    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("Nhập số phát hành: ");
        this.soPhatHanh = sc.nextInt();
        System.out.print("Nhập tháng phát hành: ");
        this.thangPhatHanh = sc.nextInt();
    }
}