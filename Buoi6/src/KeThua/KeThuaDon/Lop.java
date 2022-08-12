package KeThua.KeThuaDon;

public class Lop  {
    protected int maLop;
    protected String tenLop;

    public Lop(int maLop, String tenLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
    }

    public Lop() {

    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public void hienThiLop(){
        System.out.println(" Day la lop CNTT2");
    }
}
