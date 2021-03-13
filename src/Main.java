import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        game();
    }

    public static void game() {
        ArrayList<Duck> ducks = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String choice;
        while (true) {
            System.out.println("Select an option:\n1:Watch ducks\n2:Add ducks\n0:Exit\n");
            choice = scan.nextLine();
            if (choice.equalsIgnoreCase("1")) {
                if(ducks.isEmpty()){
                    System.out.println("There aren't any, better get some");
                }
                else {
                    for (Duck duck : ducks)
                        duck.display();
                }
            } else if (choice.equalsIgnoreCase("2")) {
                try {
                    System.out.println("Enter duck species name: ");
                    String name = scan.next();
                    System.out.println("Enter duck age: ");
                    int age = scan.nextInt();
                    System.out.println("Enter duck color");
                    String color = scan.next();
                    System.out.println("Enter 1: Normal; 2: Flying; 3:Quacking; 4:Gifted");
                    int ch = scan.nextInt();
                    if (ch == 1)
                        ducks.add(new Duck(age, color, name));
                    else if (ch == 2)
                        ducks.add(new FlyingDuck(age, color, name));
                    else if (ch == 3)
                        ducks.add(new QuackingDuck(age, color, name));
                    else if(ch == 4)
                        ducks.add(new GiftedDuck(age,color,name));
                } catch (InputMismatchException e) {
                    System.out.println("Wrong choice");
                }
            }
        else if (choice.equalsIgnoreCase("0"))
                    break;
            }

        }
    }

