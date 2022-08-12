package KeThua;

public class Student {
    private String ten;
    private int tuoi;
    private String diachi;

    public Student(String ten, int tuoi, String diachi) {
        super();
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }

    public Student() {

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
//        System.out.println(" Day la lop CNTT2");
        System.out.println(" Day la lop CNTT3");
    }

    @Override
    public String toString() {
        return "KeThua.Student{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diachi='" + diachi + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.hienThiLop();
    }
}
