
class mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}


public class staticvar {
    public static void main(String[] args) {
        mobile obj1 = new mobile();
        obj1.brand = "Apple";
        obj1.price = 1200;
        mobile.name = "14Promax";

        mobile obj2 = new mobile();
        obj2.brand = "Samsung";
        obj2.price = 1300;
        mobile.name = "S24Ultra";
        
        obj1.show();
        obj2.show();
    }
}
