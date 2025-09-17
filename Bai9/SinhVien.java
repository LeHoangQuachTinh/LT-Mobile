package Bai9;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

class SinhVien {
    private String hoTen;
    private String maSV;
    private LocalDate ngaySinh;
    private String lop;

    public void nhap(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ma SV: ");
        maSV = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String strDate = sc.nextLine();
        ngaySinh = strToLocalDate(strDate);
        System.out.print("Nhap lop: ");
        lop = sc.nextLine();
    }
    private LocalDate strToLocalDate(String strDate){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = sdf.parse(strDate);
            return date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public void hienThi() {
        System.out.printf("Ho ten: %s, MaSV: %s, Ngay sinh: %s, Lop: %s\n",
                hoTen, maSV, ngaySinh, lop);
    }

    public String getHoTen() {
        return hoTen;
    }
}

