package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        bibNumber=nextBibNumber++;
    }

    public static void main(String[] args) {
        //create two athletes
    	Athlete Athlete1=new Athlete("Bob", 10);
    	Athlete Athlete2=new Athlete("John", 11);
        //print their names, bibNumbers, and the location of their race. 
    	System.out.println(Athlete1.name+Athlete1.bibNumber+Athlete1.raceLocation);
    	System.out.println(Athlete2.name+Athlete2.bibNumber+Athlete2.raceLocation);
    }
}