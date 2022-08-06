import java.util.Scanner;

public class DongVat {
    private static Scanner scanner = new Scanner(System.in);
    private String ten;
    private int tuoi;
    private String gioiTinh;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void Nhap() {
        System.out.println(" Nhap ten dong vat");
        ten = scanner.nextLine();

        System.out.println(" Nhap tuoi dong vat");
        tuoi = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Nhap gt dong vat");
        gioiTinh = scanner.nextLine();
    }


    public void Xuat() {
        System.out.printf("%-10s %-10d %-10s\n", ten, tuoi, gioiTinh);
    }

    public static void main(String[] args) {
        //cú pháp khai báo 1 mảng đối tượng
        DongVat obj[] = new DongVat[3];
        //Sau khi tạo 1 mảng , mình phải new mới từng phần tử trong mảng
        // New mới từng phần tử trong mảng theo cách 1
        obj[0] = new DongVat();
        obj[1] = new DongVat();
        obj[2] = new DongVat();
        // New mới từng phần tử trong mảng theo cách 2
        for (int i = 0; i < 3; i++) {
            obj[i] = new DongVat();
        }

        // Nhập từng phần tử ( Cách 1 )
        System.out.println(" Nhập đối tượng 1");
        obj[0].Nhap();
        System.out.println(" Nhập đối tượng 2");
        obj[1].Nhap();
        System.out.println(" Nhập đối tượng 3");
        obj[2].Nhap();

        // Nhập từng phần tử cách 2
        for (int i = 0; i < 3; i++) {
            System.out.println(" Nhập đối tượng thứ : " + (i + 1));
            obj[i].Nhap();
        }

        //Xuất theo cách 1
        obj[0].Xuat();
        obj[1].Xuat();
        obj[2].Xuat();
        //Xuất theo cách 2 : Sử dụng foreach
        for (DongVat item :
                obj) {
            item.Xuat();
        }
        //Xuất theo cách 3
        for (int i = 0; i < 3; i++) {
            obj[i].Xuat();
        }

    }
}
