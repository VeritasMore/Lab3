public class Mouse {
        private String name;
        private int frequency;
        private int dpi;
        private int buttons;
        private int price;

        public Mouse() {
            name = "DefaultMouse";
            frequency = 1000;
            dpi = 16000;
            buttons = 5;
            price = 10000;
            System.out.printf("Mouse '%s' was created with default params.\n", name);
        }
        public Mouse(String name) {
            this.name = name;
            frequency = 1000;
            dpi = 16000;
            buttons = 5;
            price = 10000;
            System.out.printf("Mouse '%s' was created with default params.\n", this.name);
        }
        public Mouse(String name, int frequency, int dpi, int buttons, int price) {
            this.name = name;
            this.frequency = frequency;
            this.dpi = dpi;
            this.buttons = buttons;
            this.price = price;
            System.out.printf("Mouse '%s' was created.\n", this.name);
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public int getDpi() {
            return dpi;
        }
        public void setDpi(int dpi) {
            this.dpi = dpi;
        }

        public int getFrequency() {
            return frequency;
        }
        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        public int getButtons() {
            return buttons;
        }
        public void setButtons(int buttons) {
            this.buttons = buttons;
        }

        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }

        public void printParams() {
            System.out.printf("\tMouse: %s, %d Hz, %d DPI, %d Buttons, %d RUB\n", this.name, this.frequency, this.dpi, this.buttons, this.price);
        }
}
