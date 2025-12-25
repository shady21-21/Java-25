package OppsV2.innnerclass.memberInnerClass;

public class Engine {

    private  Bike bike;
    public  Engine(Bike bike){
        this.bike = bike;
    }

    public void start(){
        if(!bike.isEngineOn()){
            bike.setEngineOn(true);
            System.out.println(bike.getBikename() + " engine is started...");
        }else{
            System.out.println("Engine is already on!!");
        }
    }

    public void stop(){
        if(bike.isEngineOn()){
            bike.setEngineOn(false);
            System.out.println(bike.getBikename() + " engine is stopped...");
        }else{
            System.out.println("Engine is already off!!");
        }
    }
}
