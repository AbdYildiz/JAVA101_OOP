package JAVA101_OOP.FightingGame;

public class Match {
    Fighter f1; 
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    void run(){
        if (check(this.f1) && check(this.f2)) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("============NEW ROUND===========");

                this.f2.health = this.f1.hit(this.f2);
                System.out.println(this.f2.name + " health : " + this.f2.health);
                if (isWin()) break;

                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.name + " health : " + this.f1.health);
                if (isWin()) break;
            }
        } else {
            System.out.println("Sporcularin sikletleri uymuyor");
        }
    }

    boolean check(Fighter f){
        return (f.weight >= minWeight && f.weight <= maxWeight);
    }

    boolean isWin(){
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandi ! ");
            return true;
        } else if(this.f2.health == 0){
            System.out.println(this.f1.name + " kazandi ! ");
            return true;
        } else {
            return false;
        }
    }

}
