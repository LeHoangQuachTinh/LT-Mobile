package Bai8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected  String hoTen;
    protected   LocalDate ngaySinh;  // có thể dùng String cho đơn giản
    protected  String queQuan;

    public Nguoi(){

    }
    public Nguoi(String hoTen,LocalDate ngaySinh,String queQuan){
        this.hoTen = hoTen;
        this.ngaySinh=ngaySinh;
        this.queQuan=queQuan;
    }
    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String strdate = sc.nextLine();
        ngaySinh = strToLocalDate(strdate);
        System.out.print("Nhap que quan: ");
        queQuan = sc.nextLine();
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
        System.out.println("Ho ten: " + hoTen + ", Ngay sinh: " + ngaySinh + ", Que quan: " + queQuan);
    }

    // getter
    public String getHoTen() {
        return hoTen;
    }
}
