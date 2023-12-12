package Toools;
class Animals{
    public void animalVoice(){
        System.out.println("Animal speaks");
    }
}
class Sheep extends Animals{
    public void animalVoice(){
        System.out.println("Sheep says Meee Meee");

    }
}
class Pig extends Animals{
    public void animalVoice(){
        System.out.println("Pig says miii miii");
    }
}
public class Poly {

public static void main(String[]args){
        Animals animals = new Animals();
        Animals myShip = new Sheep();
        Animals myPig = new Pig();

        myPig.animalVoice();
        myShip.animalVoice();

        }
}