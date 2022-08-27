package model;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected int tuoi;
    protected String queQuan;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap ho ten : ");
        hoTen = sc.nextLine();
        System.out.println(" Nhap tuoi : ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println(" Nhap que quan : ");
        queQuan = sc.nextLine();
    }
    public void output(){
        System.out.printf("%-10s %-10d %-10s" , hoTen , tuoi , queQuan);
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}
