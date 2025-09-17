public class Main {
    public static void main(String[] args) {
        PhanSo sp1 = new PhanSo();
        sp1.nhapPS();
        PhanSo sp2 = new PhanSo();
        sp2.nhapPS();

        System.out.println("Phân số 1: " + sp1);
        System.out.println("Phân số 2: " + sp2);

        PhanSo spTong = sp1.congPS(sp2);
        System.out.println("Tổng: " + spTong);

        PhanSo spHieu = sp1.truPS(sp2);
        System.out.println("Hiệu: " + spHieu);

        PhanSo spTich = sp1.nhanPS(sp2);
        System.out.println("Tích: " + spTich);

        PhanSo spThuong = sp1.chiaPS(sp2);
        System.out.println("Thương: " + spThuong);

        System.out.println("sp1 có tối giản không? " + (sp1.kiemTraToiGian() ? "Có" : "Không"));
        System.out.println("sp2 có tối giản không? " + (sp2.kiemTraToiGian() ? "Có" : "Không"));
    }
}