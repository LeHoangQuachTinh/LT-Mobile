package Bai7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private Date ngaySinh; // dạng dd/MM/yyyy
    private String queQuan;

    public Nguoi(){

    }
    public Nguoi(String hoTen,Date ngaySinh,String queQuan){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }
    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        String strdate = sc.nextLine();
        ngaySinh = strToDate(strdate);
        System.out.print("Nhap que quan: ");
        queQuan = sc.nextLine();
    }
    private Date strToDate(String strDate){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return (Date) sdf.parse(strDate);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new Date(0);
        }
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen + ", Ngay sinh: " + ngaySinh.toString() + ", Que quan: " + queQuan);
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }
}
