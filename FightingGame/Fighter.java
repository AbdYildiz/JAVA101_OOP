
package JAVA101_OOP.FightingGame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = (dodge>=0 && dodge<=100) ? dodge:0; 
    }

    int hit(Fighter foe){  // foe = opponent
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu." );
        
        if (isDodge()){
            System.out.println(foe.name + " gelen hasari blokladi !");
            return foe.health;
        } else if (foe.health - this.damage <= 0 ) {
            return 0;
        } else {
            return foe.health - this.damage;
        }
    }

    boolean isDodge(){
        double randomNum = Math.random() * 100;
        return randomNum <= this.dodge;
    }
}
