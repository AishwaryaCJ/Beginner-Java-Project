package JavaPackp1;

public class SUV extends Car{

    public SUV(String name, int wheels, int gears, boolean isManual, String type) {
        super(name, 4, gears, isManual, "SUV");

    }
    public void acclerate(int rate){
        int newSpeed = getCurrentSpeed() + rate ;//getCurrent Method from Vehicle class
        /*
        speed = 0 , gear = 1
        speed 0-10 , gear = 1
        speed 10-20 , gear = 2
        speed 20-30 , gear = 3
        speed 30 - 50 , gear = 4
        speed 50 - 70 , gear = 5
        else 6
         */
        if(newSpeed == 0)
        {
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed<=10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed<=20) {
            changeGear(2);
        }
        else if (newSpeed > 20 && newSpeed<30) {
            changeGear(3);
        }
        else if (newSpeed > 30 && newSpeed<=50) {
            changeGear(4);
        }
        else if (newSpeed >50 && newSpeed<=70) {
            changeGear(5);
        }
        else {
            changeGear(6);
        }

        if(newSpeed >0){
            changeSpeed(newSpeed , getCurrentDirection());
        }

    }
}
