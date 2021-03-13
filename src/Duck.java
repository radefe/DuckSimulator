public class Duck {
    private int age;
    private final String color;
    private final String speciesName;
    public Duck(int age,String color,String speciesName){
        this.age=age;
        this.color=color;
        this.speciesName=speciesName;
        System.out.println("A new " + color+" " + speciesName + " appeared. It is " + age + "years old.");
    }
    public void display(){
        System.out.println("The " +this.getColor() + " " + this.getSpeciesName() + " is swimming around...");
    }


    public String getSpeciesName() {
        return speciesName;
    }

    public String getColor() {
        return color;
    }
}
