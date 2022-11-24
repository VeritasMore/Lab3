import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name, Interface;
        int i = 0, f = 0, frequency = 0, dpi = 0, buttons = 0, price = 0, keys = 0, brightness = 0;
        double format;

        Mouse[] mouses = new Mouse[6];
        mouses[0] = new Mouse();
        Headphones [] headphones = new Headphones [6];
        headphones [0] = new Headphones();
        Keyboard[] keyboards = new Keyboard[6];
        keyboards[0] = new Keyboard();
        Screen[] screens = new Screen[6];
        screens[0] = new Screen();
        Devices devices = new Devices(mouses[0], headphones[0], keyboards[0], screens[0]);
        System.out.println();

        while (true) {
            System.out.println("Menu:");
            System.out.println("\t1. Info about Devices.");
            System.out.println("\t2. Total cost.");
            System.out.println("\t3. Change Devices.");
            System.out.println("\t4. Exit.");
            System.out.print("> ");
            f = Integer.parseInt(reader.readLine());
            while (f < 1 || f > 5) {
                System.out.print("Error! Choose correct menu item.\n> ");
                f = Integer.parseInt(reader.readLine());
            }
            System.out.println();
            if (f == 5) break;

            switch (f) {
                case 1 -> {
                    devices.printInfo();
                    System.out.println("Press [Enter] for continue...");
                    reader.readLine();
                }
                case 2 -> {
                    System.out.println("Total cost:");
                    System.out.printf("\tTotal cost all devices: %d Rub\n", devices.Cost());
                    System.out.println("Press [Enter] for continue...");
                    reader.readLine();
                }
                case 3 -> {
                    System.out.println("Change Devices:");
                    System.out.println("\tWhat Devices you want to change?");
                    System.out.println("\t\t1. Mouse.");
                    System.out.println("\t\t2. Headphones.");
                    System.out.println("\t\t3. Keyboard.");
                    System.out.println("\t\t4. Screen.");
                    System.out.println("\t\t5. Back to menu.");
                    System.out.print("> ");
                    f = Integer.parseInt(reader.readLine());
                    while (f < 1 || f > 5) {
                        System.out.print("Error! Choose correct menu item.\n> ");
                        f = Integer.parseInt(reader.readLine());
                    }
                    System.out.println();
                    if (f == 5) break;

                    switch (f) {
                        case 1 -> {
                            System.out.println("Change Mouse:");
                            System.out.println("\tSelect in list:");
                            for (i = 0; i < 5; i++) {
                                if (mouses[i] != null) System.out.printf("\t\t%d. %s\n", i + 1, mouses[i].getName());
                                else break;
                            }
                            System.out.println("\t\t" + ++i + ". Create new...");
                            System.out.print("> ");
                            f = Integer.parseInt(reader.readLine());
                            while (f < 1 || f > i) {
                                System.out.print("Error! Choose correct menu item.\n> ");
                                f = Integer.parseInt(reader.readLine());
                            }
                            if (f == i) {
                                System.out.println("\nCreate new Mouse:");
                                System.out.print("\tInput name of Mouse: ");
                                name = reader.readLine();
                                System.out.print("\tInput Frequency: ");
                                frequency = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput DPI: ");
                                dpi = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput Buttons: ");
                                buttons = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput Price: ");
                                price = Integer.parseInt(reader.readLine());
                                mouses[f - 1] = new Mouse(name, frequency, dpi, buttons, price);
                            }
                            devices.setMouse(mouses[f - 1]);
                        }
                        case 2 -> {
                            System.out.println("Change Headphones:");
                            System.out.println("\tSelect in list:");
                            for (i = 0; i < 5; i++) {
                                if (headphones[i] != null) System.out.printf("\t\t%d. %s\n", i + 1, headphones[i].getName());
                                else break;
                            }
                            System.out.println("\t\t" + ++i + ". Create new...");
                            System.out.print("> ");
                            f = Integer.parseInt(reader.readLine());
                            while (f < 1 || f > i) {
                                System.out.print("Error! Choose correct menu item.\n> ");
                                f = Integer.parseInt(reader.readLine());
                            }

                            if (f == i) {
                                System.out.println("\nCreate new Headphones:");
                                System.out.print("\tInput name of Headphones: ");
                                name = reader.readLine();
                                System.out.print("\tInput Format: ");
                                format = Double.parseDouble(reader.readLine());
                                System.out.print("\tInput Frequency: ");
                                frequency = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput Price: ");
                                price = Integer.parseInt(reader.readLine());
                                headphones[f - 1] = new Headphones(name, (int) format, frequency,price);
                            }
                            devices.setHeadphones(headphones[f - 1]);
                        }
                        case 3 -> {
                            System.out.println("Change Keyboard:");
                            System.out.println("\tSelect in list:");
                            for (i = 0; i < 5; i++) {
                                if (keyboards[i] != null) System.out.printf("\t\t%d. %s\n", i + 1, keyboards[i].getName());
                                else break;
                            }
                            System.out.println("\t\t" + ++i + ". Create new...");
                            System.out.print("> ");
                            f = Integer.parseInt(reader.readLine());
                            while (f < 1 || f > i) {
                                System.out.print("Error! Choose correct menu item.\n> ");
                                f = Integer.parseInt(reader.readLine());
                            }

                            if (f == i) {
                                System.out.println("\nCreate new Keyboard:");
                                System.out.print("\tInput name of Keyboard: ");
                                name = reader.readLine();
                                System.out.print("\tInput Interface: ");
                                Interface = reader.readLine();
                                System.out.print("\tInput Keys: ");
                                keys = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput Price: ");
                                price = Integer.parseInt(reader.readLine());
                                keyboards[f - 1] = new Keyboard(name, Interface, keys, price);
                            }
                            devices.setKeyboard(keyboards[f - 1]);
                        }
                        case 4 -> {
                            System.out.println("Change Screen:");
                            System.out.println("\tSelect in list:");
                            for (i = 0; i < 5; i++) {
                                if (screens[i] != null) System.out.printf("\t\t%d. %s\n", i + 1, screens[i].getName());
                                else break;
                            }
                            System.out.println("\t\t" + ++i + ". Create new...");
                            System.out.print("> ");
                            f = Integer.parseInt(reader.readLine());
                            while (f < 1 || f > i) {
                                System.out.print("Error! Choose correct menu item.\n> ");
                                f = Integer.parseInt(reader.readLine());
                            }

                            if (f == i) {
                                System.out.println("\nCreate new Screen:");
                                System.out.print("\tInput name of Screen: ");
                                name = reader.readLine();
                                System.out.print("\tInput frequency: ");
                                frequency = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput brightness: ");
                                brightness = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput price: ");
                                price = Integer.parseInt(reader.readLine());
                                screens[f-1] = new Screen(name, frequency, brightness, price);
                            }
                            devices.setScreen(screens[f - 1]);
                        }
                    }
                    System.out.println("Press [Enter] for continue...");
                    reader.readLine();
                }
            }
        }
    }
}
