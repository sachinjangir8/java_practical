interface goods1 {
    void getdata();
    void display();
}

class product implements goods1 {
    int id;
    String name;
    double price;

    public void getdata() {
        id = 101;
        name = "Laptop";
        price = 50000.0;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class multi07 {
    public static void main(String[] args) {
        product p = new product();
        p.getdata();
        p.display();
    }
}