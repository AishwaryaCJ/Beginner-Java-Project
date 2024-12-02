package JavaPackp1;

import javax.swing.plaf.basic.BasicFormattedTextFieldUI;

class Vehicle{
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name)
    {
        this.name = name;
        this.currentDirection=0;
        this.currentSpeed=0;
    }

    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Steer Method called : Steering at "+this.currentDirection+ " direction");
    }

    public void move(int speed , int direction){
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("move method is called moving at : " + currentSpeed + " in direction " + currentDirection);
    }

    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name = name;

    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public void setCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;

    }
    public int getCurrentDirection(){
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection){
        this.currentDirection = currentDirection;
    }

    public void stop()
    {
        this.currentSpeed = 0;
    }


}



public class VehicleProject {
    public static void main(String[] args) {
        SUV fortuner = new  SUV("FORTUNER",4,6,false,"SUV");
        fortuner.move(40,0);
        fortuner.acclerate(20);

    }
}
