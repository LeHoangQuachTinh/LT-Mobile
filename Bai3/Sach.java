
import java.util.Scanner;

class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach(){}

    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh,String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Tên tác giả: " + this.tenTacGia);
        System.out.println("Số trang: " + this.soTrang);
    }
    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("Nhập tên tác giả: ");
        this.tenTacGia = sc.nextLine();
        System.out.print("Nhập số trang: ");
        this.soTrang = sc.nextInt();
    }
}