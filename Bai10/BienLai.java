package Bai10;

import java.util.Scanner;

class BienLai extends  KhachHang{
    private int chiSoCu_145;
    private int chiSoMoi_145;
    private int soTien_145;

    public BienLai(){
    }
    public BienLai(String hoTen,String soNha,String maCongTo,int chiSoCu_145,int chiSoMoi_145){
        super(hoTen, soNha, maCongTo);
        this.chiSoCu_145=chiSoCu_145;
        this.chiSoMoi_145 = chiSoMoi_145;
        // this.soTien_145 = soTien_145;
    }
    @Override
    public void nhap(Scanner sc) {
        System.out.println("=== Nhap thong tin khach hang ===");
        super.nhap(sc);
        System.out.print("Nhap chi so cu: ");
        chiSoCu_145 = sc.nextInt();
        System.out.print("Nhap chi so moi: ");
        chiSoMoi_145 = sc.nextInt();
        tinhTien();
    }

    private void tinhTien() {
        soTien_145 = (chiSoMoi_145 - chiSoCu_145) * 750;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Chi so cu: %d, Chi so moi: %d, Tien phai tra: %d VND\n",
                chiSoCu_145, chiSoMoi_145, soTien_145);
    }

    public int getSoTien_145() {
        return soTien_145;
    }

    public String getTenChuHo() {
        return this.getHoTen_145();
    }
}
