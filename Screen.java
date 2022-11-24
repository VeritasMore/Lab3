public class Screen {
    private String name;
    private int frequency ;
    private int brightness;
    private int price;

    public Screen() {
        name = "DefaultScreen";
        frequency = 144;
        brightness = 350;
        price = 36000;
        System.out.printf("Screen '%s' was created with default params.\n", name);
    }
    public Screen(String name) {
        this.name = name;
        frequency = 144;
        brightness = 350;
        price = 36000;
        System.out.printf("Screen '%s' was created with default params.\n", this.name);
    }
    public Screen(String name, int frequency, int brightness, int price) {
        this.name = name;
        this.frequency = frequency;
        this.brightness = brightness;
        this.price = price;
        System.out.printf("Screen '%s' was created.\n", this.name);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getBrightness() {
        return brightness;
    }
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void printParams() {
        System.out.printf("\tScreen: %s, %d HZ, %d Nit, %d RUB\n", this.name, this.frequency, this.brightness, this.price);
    }
}
