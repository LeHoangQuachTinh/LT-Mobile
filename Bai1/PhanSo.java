
import java.util.Scanner;

public class PhanSo {
    private int tuSo_145;
    private int mauSo_145;

    public PhanSo() {
        this.tuSo_145 = 0;
        this.mauSo_145 = 1;
    }

    public PhanSo(int tuSo_145, int mauSo_145) {
        if (mauSo_145 == 0) 
            throw new IllegalArgumentException("Mẫu số không thể bằng 0");
        this.tuSo_145 = tuSo_145;
        this.mauSo_145 = mauSo_145;
        this.toiGianPS(); 
    }

    public int gettuSo_145() {
        return tuSo_145;
    }

    public int getMauSo_145() {
        return mauSo_145;
    }

    private int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public boolean kiemTraToiGian() {
        return timUCLN(tuSo_145, mauSo_145) == 1;
    }

    public void toiGianPS() {
        int gcd = timUCLN(tuSo_145, mauSo_145);
        tuSo_145 /= gcd;
        mauSo_145 /= gcd;
        if (mauSo_145 < 0) { 
            tuSo_145 = -tuSo_145;
            mauSo_145 = -mauSo_145;
        }
    }

    public PhanSo congPS(PhanSo p) {
        int tu = this.tuSo_145 * p.mauSo_145 + p.tuSo_145 * this.mauSo_145;
        int mau = this.mauSo_145 * p.mauSo_145;
        return new PhanSo(tu, mau);
    }

    public PhanSo truPS(PhanSo p) {
        int tu = this.tuSo_145 * p.mauSo_145 - p.tuSo_145 * this.mauSo_145;
        int mau = this.mauSo_145 * p.mauSo_145;
        return new PhanSo(tu, mau);
    }

    public PhanSo nhanPS(PhanSo p) {
        int tu = this.tuSo_145 * p.tuSo_145;
        int mau = this.mauSo_145 * p.mauSo_145;
        return new PhanSo(tu, mau);
    }

    public PhanSo chiaPS(PhanSo p) {
        if (p.tuSo_145 == 0) 
            throw new ArithmeticException("Không thể chia cho phân số có tử số 0");
        int tu = this.tuSo_145 * p.mauSo_145;
        int mau = this.mauSo_145 * p.tuSo_145;
        return new PhanSo(tu, mau);
    }
    public void nhapPS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        this.tuSo_145 = sc.nextInt();
        do {
            System.out.print("Nhập mẫu số (khác 0): ");
            this.mauSo_145 = sc.nextInt();
            if (this.mauSo_145 == 0) 
                System.out.println("Mẫu số không thể bằng 0. Vui lòng nhập lại.");
        } while (this.mauSo_145 == 0);
        // rutGon();
    }

    public String hienThiPS() {
        if (mauSo_145 == 1) return tuSo_145 + "";
        return tuSo_145 + "/" + mauSo_145;
    }
     @Override
    public String toString() {
        if (mauSo_145 == 1) return tuSo_145 + "";
        return tuSo_145 + "/" + mauSo_145;
    }
}