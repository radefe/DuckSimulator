public class QuackingDuck extends Duck {
    public QuackingDuck(int age,String color,String speciesName){
        super(age,color,speciesName);
        System.out.println("It started quacking!");
    }
    public void display(){
        System.out.println("The " +this.getColor() + " " + this.getSpeciesName() + " is quacking...");
    }
}
