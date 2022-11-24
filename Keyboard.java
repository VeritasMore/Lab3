public class Keyboard {
    private String name;
    private String Interface;
    private int keys;
    private int price;

    public Keyboard(){
        name = "DefaultKeyboard";
        Interface = "USB-A";
        keys = 5;
        price = 8000;
        System.out.printf("Keyboard '%s' was created with default params.\n", name);
    }
    public Keyboard(String name){
        this.name = name;
        Interface = Interface;
        keys = 5;
        price = 8000;
        System.out.printf("Keyboard '%s' was created with default params.\n", this.name);
    }
    public Keyboard(String name, String Interface, int keys, int price){
        this.name = name;
        this.Interface = Interface;
        this.keys = keys;
        this.price = price;
        System.out.printf("Keyboard '%s' was created.\n", this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setInterface(String Interface) {
        this.Interface = Interface;
    }
    public String getInterface() {
        return Interface;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }
    public int getKeys() {
        return keys;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void printParams() {
        System.out.printf("\tKeyboard: %s, %s, %d Keys, %d RUB\n", this.name, this.Interface, this.keys, this.price);
    }
}
