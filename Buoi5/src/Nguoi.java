import java.util.Scanner;

public class Nguoi {
    private static Scanner scanner = new Scanner(System.in);
    private String name;
    private int tuoi;
    private DiaChi diaChi = new DiaChi();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

    public void input(){
        System.out.println(" Nhap ten ");
        name = scanner.nextLine();

        System.out.println(" Nhap tuoi ");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        diaChi.input();

    }

    public void output(){
        System.out.println(" Name :  "+name);
        System.out.println(" Name :  "+tuoi);
        diaChi.output();
    }

    public static void main(String[] args) {
        Nguoi a = new Nguoi();
        a.input();
        a.output();
    }

}
