package Bai1;

import java.util.Scanner;

public class QuanLy {
    private static Scanner scanner = new Scanner(System.in);
    private String maQly;
    private String hoTen;

    public QuanLy() {
    }

    public QuanLy(String maQly, String hoTen) {
        this.maQly = maQly;
        this.hoTen = hoTen;
    }

    public void input() {
        System.out.println(" Nhap ma quan ly ");
        maQly = scanner.nextLine();

        System.out.println(" Nhap ho ten ");
        hoTen = scanner.nextLine();
    }

    public void output() {
        System.out.println(" Ma quan li : " + maQly);
        System.out.println(" Ho ten : " + hoTen);
    }

    public String getMaQly() {
        return maQly;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
