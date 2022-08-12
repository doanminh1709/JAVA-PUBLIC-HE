package Bai2;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private static int temp = 1;
    private Address address = new Address();
    public static Scanner scanner = new Scanner(System.in);

    public Student() {
        id = temp++;
    }

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void input() {

        System.out.println(" Nhap vao name : ");
        name = scanner.nextLine();

        System.out.println(" Nhap vao age : ");
        age = scanner.nextInt();
        scanner.nextLine();
        address.input();
    }

    public void output() {
        System.out.printf("%-10d %-10s %-10d", id, name, age);
        address.output();
    }

}
