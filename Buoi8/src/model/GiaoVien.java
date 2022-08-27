package model;

import inteface.PersonInterface;
import inteface.TestIntaece;

public class GiaoVien extends Person implements PersonInterface , TestIntaece {

    private String dayMon;
    private int namKn;

    public String getDayMon() {
        return dayMon;
    }

    public void setDayMon(String dayMon) {
        this.dayMon = dayMon;
    }

    public int getNamKn() {
        return namKn;
    }

    public void setNamKn(int namKn) {
        this.namKn = namKn;
    }

    @Override
    public void ngu(){
        System.out.println("giao vien dang ngu");
    }
    public void giangBai(){
        System.out.println(" Dang giang bai");
    }

    @Override
    public void choi() {
        System.out.println("Giao vien dang choi");
    }

    @Override
    public void nauNuong() {
        System.out.println(" Giao vien dang nau nuong");
    }

    @Override
    public void test() {
        System.out.println(" Test nhap giao vien ");
    }

    //Sử dụng hằng số trong Interface
    public void chamDiem(){
        System.out.println("sinh vien A được " +DIEM);
    }
}
