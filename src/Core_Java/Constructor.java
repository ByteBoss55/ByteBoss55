package Core_Java;

import javax.xml.namespace.QName;

class demo {
    String name;
    int age;
    String address;


    public demo() {
        System.out.println("No argument constructor");
        name = "Mukund";
        age = 23;
        address = "Narewadi";
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
    public demo(int a){
        System.out.println("Parameterized constructor");
        name = "Shubham";
        age = 23;
        address = "Bhadgaon";
    }
}
public class Constructor {
    public static void main(String[] args) {
        demo a = new demo();
        a.display();
        demo b = new demo(10);
        b.display();
    }
}
