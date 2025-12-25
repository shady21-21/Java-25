package OppsV2.innnerclass.memberInnerClass;

public class Bike {


    private String bikename;
    private boolean isEngineOn;

    public Bike(String bikename){
        this.bikename = bikename;
    }

    public String getBikename() {
        return bikename;
    }

    public void setBikename(String bikename) {
        this.bikename = bikename;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }
}
