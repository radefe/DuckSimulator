public class FlyingDuck extends Duck{

public FlyingDuck(int age,String color,String speciesName){
    super(age,color,speciesName);
    System.out.println("It started flying around!");
}
public void display(){
    System.out.println("The " +this.getColor() + " " + this.getSpeciesName() + " is Flying around...");
}

}
