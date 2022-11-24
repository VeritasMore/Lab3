public class Devices {
    private Mouse mouse;
    private Headphones headphones;
    private Keyboard keyboard;
    private Screen screen;

    Devices() {
        mouse = new Mouse();
        headphones = new Headphones();
        keyboard = new Keyboard();
        screen = new Screen();
        System.out.print("Devices was created with default params.\n\n");
    }

    Devices(Mouse mouse, Headphones headphones, Keyboard keyboard, Screen screen) {
        this.mouse = mouse;
        this.headphones = headphones;
        this.keyboard = keyboard;
        this.screen = screen;
        System.out.print("Devices was created.\n\n");
    }

    public void setMouse(Mouse mouse) {
        System.out.print("Mouse was changed for pc.\n");
        this.mouse = mouse;
    }

    public void setHeadphones(Headphones headphones) {
        System.out.print("Headphones was changed for pc.\n");
        this.headphones = headphones;
    }

    public void setKeyboard(Keyboard keyboard) {
        System.out.print("Keyboard was changed for pc.\n");
        this.keyboard = keyboard;
    }

    public void setScreen(Screen screen) {
        System.out.print("Screen was changed for pc.\n");
        this.screen = screen;
    }

    public int Cost() {
        return mouse.getPrice() + headphones.getPrice() + keyboard.getPrice() + screen.getPrice();
    }

    public void printInfo() {
        System.out.print("Info about Devices:\n");
        mouse.printParams();
        headphones.printParams();
        keyboard.printParams();
        screen.printParams();
        System.out.printf("Total cost all devices: %d RUB\n", Cost());
    }
}
