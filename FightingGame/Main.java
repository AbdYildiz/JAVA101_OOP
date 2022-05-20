package JAVA101_OOP.FightingGame;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Rocky", 30, 120, 100, 30);
        Fighter f2 = new Fighter("Micky", 10, 80, 90, 40);

        double num = Math.random() * 10;
        if (num < 5) {
            Match match = new Match(f1, f2, 90, 100);
            match.run();
        } else {
            Match match = new Match(f2, f1, 90, 100);
            match.run();
        }
    }
}
