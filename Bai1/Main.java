public class Main {
    public static void main(String[] args) {
        PhanSo sp1_145 = new PhanSo();
        sp1_145.nhapPS();
        PhanSo sp2_145 = new PhanSo();
        sp2_145.nhapPS();

        System.out.println("Phân số 1: " + sp1_145);
        System.out.println("Phân số 2: " + sp2_145);

        PhanSo spTong = sp1_145.congPS(sp2_145);
        System.out.println("Tổng: " + spTong);

        PhanSo spHieu = sp1_145.truPS(sp2_145);
        System.out.println("Hiệu: " + spHieu);

        PhanSo spTich = sp1_145.nhanPS(sp2_145);
        System.out.println("Tích: " + spTich);

        PhanSo spThuong = sp1_145.chiaPS(sp2_145);
        System.out.println("Thương: " + spThuong);

        System.out.println("sp1_145 có tối giản không? " + (sp1_145.kiemTraToiGian() ? "Có" : "Không"));
        System.out.println("sp2_145 có tối giản không? " + (sp2_145.kiemTraToiGian() ? "Có" : "Không"));
    }
}