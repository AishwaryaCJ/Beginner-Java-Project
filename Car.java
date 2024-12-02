package JavaPackp1;

public class Car extends Vehicle{
    private int wheels;
    private String type;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name , int wheels , int gears,boolean isManual , String type) {
        super(name);
        this.wheels = wheels;
        this.gears=gears;
        this.isManual = isManual;
        this.type = type;
        currentGear = 1;

    }
    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called changed to : "+ this.currentGear + " gear");
    }

    public void changeSpeed(int newSpeed , int newDirection){
        move(newSpeed,newDirection); //as car is inherited from vehicle to change speed we can access move method

        System.out.println("changeSpeed method is called , Speed : "+newSpeed + " direction "+newDirection);
    }
}
