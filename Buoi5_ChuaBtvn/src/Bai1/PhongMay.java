package Bai1;

import java.util.Scanner;

public class PhongMay {
    private static Scanner scanner = new Scanner(System.in);
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private QuanLy x = new QuanLy();
    private May y = new May();

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, float dienTich, QuanLy x, May y) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        PhongMay.scanner = scanner;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May getY() {
        return y;
    }

    public void setY(May y) {
        this.y = y;
    }

    public void input() {
        System.out.println(" Nhap ten phong");
        tenPhong = scanner.nextLine();

        System.out.println(" Nhap dien tich ");
        dienTich = scanner.nextFloat();
        scanner.nextLine();

        x.input();
        y.input();
    }

    public void output() {
        System.out.println("===> Thong tin cua phong ");
        System.out.println(" Ten phong : " + tenPhong);
        System.out.println(" Dien tich : " + dienTich);

        System.out.println("===> Thong tin cua quan li ");
        x.output();

        System.out.println("===> Thong tin cua may ");
        y.output();
    }

}
