//VD : DON KE THUA
package KeThua.KeThuaDon;

public class SinhVien extends Lop {
    private String ten;
    private int tuoi;
    private String diachi;

    public SinhVien(String ten, int tuoi, String diachi) {
        super();
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }

    public SinhVien() {

    }

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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public void hienThiLop(){
        super.hienThiLop();//Kế thừa lại phương thức của Lớp bằng từ khóa supper
        System.out.println(" Day la lop CNTT3");//Định nghĩa lại phuơng thức được kế thừa
    }

    //Phương thức này sẽ chyển đổi một Object thành một String (chuỗi) rồi trả vè nó
    @Override
    public String toString() {
        return "KeThua.Student{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diachi='" + diachi + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SinhVien student = new SinhVien();
        student.hienThiLop();
    }
}
