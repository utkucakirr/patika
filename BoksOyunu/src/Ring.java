import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    public Ring(Fighter f1, Fighter f2, int maxWeight, int minWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }

    public void run(){
        if(checkWeight()){
            int i=1;
            while(f1.health>0&&f2.health>0){
                System.out.println("------" + i + ". Round" + "------");
                Random rd=new Random();
                if(rd.nextBoolean()){
                    f2.health=f1.hit(f2);
                    if(checkWinner()){
                        break;
                    }
                }else{
                    f1.health=f2.hit(f1);
                    if(checkWinner()){
                        break;
                    }
                }
                printScore();
                i++;
            }
        }else{
            System.out.println("Agirliklar uyusmuyor. ");
        }
    }

    public boolean checkWinner(){
        if(f1.health==0){
            System.out.println(f2.name + " kazandi.");
            return true;
        }else if(f2.health==0){
            System.out.println(f1.name + " kazandi.");
            return true;
        }
        return false;
    }

    public boolean checkWeight(){
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public void printScore(){
        System.out.println("--------------");
        System.out.println(f1.name + " kalan cani: " + f1.health);
        System.out.println(f2.name + " kalan cani: " + f2.health);
    }
}
