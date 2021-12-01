public class Fighter {
    String name;
    int health;
    int damage;
    int weight;
    double dodge;

    public Fighter(String name,int health,int damage,int weight, double dodge){
        this.name=name;
        this.health=health;
        this.damage=damage;
        this.weight=weight;
        this.dodge=dodge;
    }

    public int hit(Fighter enemy){
        System.out.println("-----------");
        System.out.println(this.name + " dealt " + this.damage + " damage to " + enemy.name);
        if(dodgeCheck(enemy.dodge)){
            System.out.println(enemy.name + " gelen hasari savurdu");
            return enemy.health;
        }
        if(enemy.health-this.damage<=0){
            return 0;
        }
        return enemy.health-this.damage;
    }

    public boolean dodgeCheck(double dodge){
        double randomValue=Math.random()*100;
        return dodge>randomValue;
    }
}
