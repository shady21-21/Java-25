package OppsV2.innnerclass.staticNestedClass;

public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer("MAC", "m1-air", "Macintosh");
        computer.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("TYPE-C");

    }
}
