package OppsV2.innnerclass.memberInnerClass;

public class Car {

    private String model;
    private boolean isEngineOn;

     Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }


     class Engine{
         void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model + " engine is started...");
            }else{
                System.out.println("Engine is already on!!");
            }
        }

         void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + "engine is stopped...");
            }else{
                System.out.println("Engine is already off!!");
            }
        }
    }
}
