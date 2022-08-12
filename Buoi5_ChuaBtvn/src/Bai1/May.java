package Bai1;

import java.util.Scanner;

public class May {
    private static Scanner scanner = new Scanner(System.in);
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public May(String maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public void input() {
        System.out.println(" Nhap ma may");
        maMay = scanner.nextLine();

        System.out.println(" Nhap kieu may ");
        kieuMay = scanner.nextLine();

        System.out.println(" Nhap tinh trang ");
        tinhTrang = scanner.nextLine();
    }

    public void output() {
        System.out.println("Ma may : " + maMay);
        System.out.println("Kieu may :  " + kieuMay);
        System.out.println("Tinh trang :" + tinhTrang);
    }

    public May() {
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
