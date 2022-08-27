package Bai1;

import java.util.Scanner;

public class CanBo {
    protected int id;
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;
    private static int temp = 1;

    public CanBo() {
        id = temp++;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap ho ten");
        hoTen = scanner.nextLine();
        System.out.println(" Nhap nam sinh ");
        namSinh = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Nhap gioi tinh ");
        gioiTinh = scanner.nextLine();
        System.out.println(" Nhap dia chi");
        diaChi = scanner.nextLine();
    }

    public void output() {
        System.out.printf("%-10d %-10s %-10s %-10s %-10s", id, hoTen, namSinh, gioiTinh, diaChi);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public static int getTemp() {
        return temp;
    }

    public static void setTemp(int temp) {
        CanBo.temp = temp;
    }
}
