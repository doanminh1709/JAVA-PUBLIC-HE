import java.util.Scanner;

public class DiaChi {
    private static Scanner scanner = new Scanner(System.in);
    private String quan;
    private String huyen;
    private String tinh;

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public void input() {
        System.out.println(" Nhap vao quan : ");
        quan = scanner.nextLine();

        System.out.println(" Nhap vao huyen : ");
        huyen = scanner.nextLine();

        System.out.println(" Nhap vao tinh : ");
        tinh = scanner.nextLine();
    }

    public void output() {
        System.out.println("Quan " + quan);
        System.out.println("Huyen " + huyen);
        System.out.println("Tinh " + tinh);
    }
}
