public class GiftedDuck extends Duck {
    public GiftedDuck(int age,String color,String speciesName){
        super(age,color,speciesName);
        System.out.println("It started quacking and flying!");
    }
    public void display(){
        System.out.println("The " +this.getColor() + " " + this.getSpeciesName() + " is flying and quacking...");
    }
}

