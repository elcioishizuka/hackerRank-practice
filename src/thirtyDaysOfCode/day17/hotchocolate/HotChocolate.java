package thirtyDaysOfCode.day17.hotchocolate;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException {
        if (cocoaTemp >= tooHot){
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold){
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        double currentCocoaTemp = 200;
        boolean wrongTemp = true;
        while(wrongTemp){
            try{
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("That cocoa was good!");
                wrongTemp = false;
            } catch (TooHotException e) {
                System.err.format("Current temperature: %.0f deg F. That's too hot!\n", currentCocoaTemp);
                currentCocoaTemp -= 5;
            } catch (TooColdException e) {
                System.err.format("Current temperature: %.0f deg F. That's too cold\n", currentCocoaTemp);
                currentCocoaTemp += 5;
            }
            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("And it's gone");
    }

}
