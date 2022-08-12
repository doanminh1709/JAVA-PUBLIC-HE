package Bai2;

import java.util.Scanner;

public class Address {
    private int id;
    private String district;
    private String province;
    private static int tempAd = 1000;
    public static Scanner scanner = new Scanner(System.in);

    public Address() {
        id = tempAd++;
    }

    public Address( String district, String province) {
        this.district = district;
        this.province = province;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void input() {
        System.out.println(" Nhap district : ");
        district = scanner.nextLine();
        System.out.println(" Nhap province ");
        province = scanner.nextLine();
    }

    public void output(){
        System.out.printf("%-10d %-10s %-10s\n" , id , district , province);
    }
}
