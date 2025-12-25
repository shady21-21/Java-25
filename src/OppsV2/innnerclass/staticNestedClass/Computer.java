package OppsV2.innnerclass.staticNestedClass;

public class Computer {
    private String brand;
    private String model;
    private OperatingSystem os;
    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    static class USB{
        //If compute object is create then its does't affect the USB class.
        //Saved the memory
        private String type;
        public USB(String type){
            this.type = type;
        }

        void displayInfo(){
            System.out.println("USE TYPE : " + type);
        }
    }


    class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer Model : " + model);
            System.out.println("OS : " + osName);
        }
    }
    public OperatingSystem getOs() {
        return os;
    }
}
