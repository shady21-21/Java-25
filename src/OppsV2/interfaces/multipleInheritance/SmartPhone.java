package OppsV2.interfaces.multipleInheritance;

public class SmartPhone implements Camera,MusicPlayer,Calling{

    @Override
    public void makeCall(String number) {
        System.out.println("Calling on this " + number + " ...");

    }

    @Override
    public void endCall() {
        System.out.println("Call has been Ended.");
    }

    @Override
    public void takePhoto() {
        System.out.println("Clicking photos.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Video is being Recording.. ");
    }

    @Override
    public void playMusic() {
        System.out.println("Music is playing...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music is Stopped.");
    }
}
