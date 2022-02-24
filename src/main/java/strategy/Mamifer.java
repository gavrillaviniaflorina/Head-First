package strategy;

public abstract class Mamifer {

  IWalk walkBehavior;
    IDrive driveBehavior;


    public abstract void display();


    public void performMove(){
        walkBehavior.move();
    }


    public void performDrive(){driveBehavior.drive();}

    public void breath(){
        System.out.println("All mamifers breath air");
    }

}
