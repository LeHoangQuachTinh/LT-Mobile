package Bai10;

import java.util.Scanner;

class BienLai extends  KhachHang{
    private int chiSoCu;
    private int chiSoMoi;
    private int soTien;

    public BienLai(){
    }
    public BienLai(String hoTen,String soNha,String maCongTo,int chiSoCu,int chiSoMoi){
        super(hoTen, soNha, maCongTo);
        this.chiSoCu=chiSoCu;
        this.chiSoMoi = chiSoMoi;
        // this.soTien = soTien;
    }
    @Override
    public void nhap(Scanner sc) {
        System.out.println("=== Nhap thong tin khach hang ===");
        super.nhap(sc);
        System.out.print("Nhap chi so cu: ");
        chiSoCu = sc.nextInt();
        System.out.print("Nhap chi so moi: ");
        chiSoMoi = sc.nextInt();
        tinhTien();
    }

    private void tinhTien() {
        soTien = (chiSoMoi - chiSoCu) * 750;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Chi so cu: %d, Chi so moi: %d, Tien phai tra: %d VND\n",
                chiSoCu, chiSoMoi, soTien);
    }

    public int getSoTien() {
        return soTien;
    }

    public String getTenChuHo() {
        return this.getHoTen();
    }
}
