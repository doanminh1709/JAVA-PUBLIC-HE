package model;

public class Person {
    protected int tuoi;
    protected String name;

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ngu(){
        System.out.println(" dang ngu");
    }
}
