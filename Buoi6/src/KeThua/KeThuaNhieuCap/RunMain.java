package KeThua.KeThuaNhieuCap;

public class RunMain {
    public static void main(String[] args) {
        ConTrai ct = new ConTrai();
        ct.daBong();
        //Ngoài phương thức dá bóng của mình , con trai còn được kế thừa phương thức hút thuộc và chơi cờ
        //của ông và bố
        ct.hutThuoc();
        ct.choiCo();
    }

}
