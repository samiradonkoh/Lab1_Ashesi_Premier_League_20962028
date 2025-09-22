
import java.util.Scanner;
public class PlayerSelection{
    public static void main(String[] args) {
//Deriving input from the user
        Scanner input=new Scanner(System.in);
        System.out.println("What is your name?-");
        String player = input.nextLine();
        System.out.println("How old are you?");
        int age=input.nextInt();
        System.out.println("What is your height in 2 decimal places?");
        double height= input.nextDouble();
        System.out.println("What is your weight to 1 decimal place?");
        double  weight= input.nextDouble();
        System.out.println("Type in your jersey number.");
        int  jersey = input.nextInt();


//conversion of height to cm and weight to kg
        double pound=0.45359237;
        int meter=100;
        double new_weight= 0.453* weight ;
        double new_height= 100* height ;
        int final_weight=(int) new_weight;
        int final_height=(int) new_height;


//Increment of age by 1, and Decrement of jersey by 1
        ++age;
        --jersey;


//Checking eligibility
        boolean eligible_player=(age>=18 && age<=35 && final_weight<90);
        if (eligible_player){
            System.out.println("Eligible");
        }
        else {
            System.out.println(" Not Eligible");
            }
        if (age<18 ||final_weight>=90){
            System.out.println("Player has a problem(either too young or too heavy)");
                }
        if (!eligible_player){
            System.out.println("Not eligible");
                }


//Categorizing based on ages
        String category;
        if (age < 20) {category = "Rising Star";}
        else if (age >=20 && age <=30) {category=" Prime Player";}
        else {category ="Veteran";}

//Assigning positions based on coach's input
        System.out.println("Hi coach,enter the jersey number of your player");
        int coach_jersey_number= input.nextInt();
        String position;
        switch(coach_jersey_number) {
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
            case 5:
                position = "Defender";
                 break;
            case 6:
            case 8:
                position = "Midfielder";
                break;
            case 7:
            case 11:
                position = "Winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playmaker";
                break;
            default:
                position = "Player position not known";
                }
                System.out.println("Player position-"+position);


//Deciding if the player is part of the starting lineup or rest
                boolean starting_lineup=position.equals ("Playmaker") && final_weight<80;
                {System.out.println(starting_lineup?"Starting lineup":"Bench");
  }


//Deciding if the player will play or rest
                String final_decision=eligible_player?"Play":"Rest";


//Final printout
                System.out.println("FINAL PLAYER REPORT");
                System.out.println("Player:"+ player);
                System.out.println("Age:"+ age+ ","+category);
                System.out.println("Height:"+final_height);
                System.out.println("Weight:"+final_weight);
                System.out.println("Jersey Number:"+jersey);
                System.out.println("Position:"+position);
                System.out.println("Eligibility:"+(eligible_player?"Eligible":"Not eligible"));
                System.out.println("Lineup Decision:"+(starting_lineup?"Starting lineup":"Bench"));
                System.out.println("Final Decision:"+final_decision);
    }
}