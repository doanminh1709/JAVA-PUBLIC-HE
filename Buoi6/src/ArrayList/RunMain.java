package ArrayList;

import KeThua.KeThuaDon.SinhVien;

import java.util.ArrayList;

public class RunMain {
    public static void main(String[] args) {

        //Khởi tạo một mảng arrayList kiểu dữ liệu là Interger
        /* Note  : trong arralist mình không thể truyền kiều dữ liệu nguyên thủy (int , float , double , long)
                   mà mình chỉ có thể truyền các wrapper class như Integer , Float , Double , Long
         */
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(4);
        numberList.add(5);

        //Chuyển 1 array List về Array bằng phương thức toArray
        Object[] a = numberList.toArray();
        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }

//        ArrayList<Float> floats = new ArrayList<>(); Ok
//        ArrayList<float> floats = new ArrayList<>(); Error

//        ArrayList<Double> doubles = new ArrayList<>();Ok
//        ArrayList<Double> doubles = new ArrayList<>();Error

//      ArrayList<Long> doubles = new ArrayList<>();OK
//      ArrayList<long> doubles = new ArrayList<>();Error



        //Cách ehởi tạo 1 mảng array list kiểu dữ liệu String
        ArrayList<String> list = new ArrayList<String>();

        //1.Phương thức add thêm các phần tử vào cuối arrayList
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");


        ArrayList<String> listA = new ArrayList<String>();
        listA.addAll(list);

//        list.addAll(listA);
//        thêm cả list A vào đăng sau list ( Dễ hình dung như mình đang nối chuỗi A vào đằng sau chuỗi B

        ArrayList<String> listB = new ArrayList<String>();
        listB.add("Java");

        //2.phương thức retainAll : xóa tất cả các phần tử không ở listB ra khỏi list A
        listA.retainAll(listB);


        //3.Phương thức removeAll : Xóa tất cả các phần tử ở listB ra khỏi list A
        listA.removeAll(listB);


        ///4. Phương thức remove : xóa phần tử theo chỉ số
        System.out.println(" Sau khi xoa chi so thu 1 ");
        listA.remove(1);
        System.out.println(listA);

        //5.Phương thức remove xóa phần tử theo giá trị , sẽ xóa phần tử đầu tiên có giá trị đó
        System.out.println(" Sau khi xoa gia tri trong mảng la Java");
        listA.remove("Java");


        //6.Phương thức contains : Tìm kiếm một giá trị xem xuất hiện ở trong list hay k , có trả về true , ngược
        //lại sẽ trả về false
        int cnt = 0;
        for (int i = 0; i < listA.size(); i++) {
//            if(listA.get(i).compareTo("C#") == 0) : cách so sánh chuỗi kiểu 1
//            if(listA.get(i).equals("C#")) : cách so sánh chuỗi kiểu 2
            if (listA.contains("C#")) {
                cnt++;
            }
        }
        if(cnt > 0){
            System.out.println(" Co phan tu ten la C #");
        }else{
            System.out.println(" Khong co phan tu la C#");
        }

        //Khởi tạo một mảng arraylist với kiẻu dữ liệu đầu vào là Object
        ArrayList<SinhVien> listStudent = new ArrayList<SinhVien>();
        SinhVien st = new SinhVien("B" , 22 , "TH");
        SinhVien st2 = new SinhVien("C" , 24 , "TH");

        listStudent.add(new SinhVien("A" , 20 , "HN"));//khởi tạo trực tiếp
        listStudent.add(st);
        listStudent.add(st2);
        int dem = 0;
        for(int i = 0 ; i < listStudent.size() ; i++){
            if(listStudent.get(i).getTen().equals("B")){
                dem++;
                listStudent.remove(i);
                break;
            }
        }
        for(int i = 0 ; i < listStudent.size() ; i++){
            if(listStudent.get(i).getTen().equals("B")){
                listStudent.get(i).setTen("E");
                listStudent.remove(i);
                break;
            }
        }

        System.out.println(listStudent.toString());




//in ra gía trị của một ArrayList

        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");

// C1 : in ra trực tiếp
        System.out.println(strings);

//C2 su dung foreach
        for (String item : strings){
            System.out.println(item);
        }
        //c3 : su dung for binh thuong
        for (int i = 0 ; i < strings.size() ; i++){
            System.out.println(strings.get(i));
        }

    }
}
