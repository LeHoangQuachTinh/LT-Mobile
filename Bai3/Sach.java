
import java.util.Scanner;

class Sach extends TaiLieu {
    private String tenTacGia_145;
    private int soTrang_145;

    public Sach(){}

    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh,String tenTacGia_145, int soTrang_145) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia_145 = tenTacGia_145;
        this.soTrang_145 = soTrang_145;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Tên tác giả: " + this.tenTacGia_145);
        System.out.println("Số trang: " + this.soTrang_145);
    }
    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("Nhập tên tác giả: ");
        this.tenTacGia_145 = sc.nextLine();
        System.out.print("Nhập số trang: ");
        this.soTrang_145 = sc.nextInt();
    }
}