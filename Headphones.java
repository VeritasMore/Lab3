public class Headphones {
    private String name;
    private double format;
    private int frequency;
    private int price ;

    public Headphones(){
        name = "DefaultHeadphones";
        format = 7.1;
        frequency = 16000;
        price = 10000;
        System.out.printf("Headphones '%s' was created with default params.\n", name);
    }
    public Headphones(String name){
        this.name = name;
        format = 7.1;
        frequency = 16000;
        price = 10000;
        System.out.printf("Headphones '%s' was created with default params.\n", this.name);
    }
    public Headphones(String name, int format, int frequency, int price){
        this.name = name;
        this.format = format;
        this.frequency = frequency;
        this.price = price;
        System.out.printf("Headphones '%s' was created.\n", this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setFormat(double format) {
        this.format = format;
    }
    public double getFormat() {
        return format;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    public int getFrequency() {
        return frequency;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void printParams() {
        System.out.printf("\tHeadphones: %s, %.1f, %d Hz, %d RUB\n", this.name, this.format, this.frequency, this.price);
    }
}

