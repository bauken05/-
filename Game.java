package prototype;

public class Game {
    public static void main(String[] args) {

        // Базалық прототип
        Enemy baseEnemy = new Enemy("Goblin", 100, 15);

        // Клондар жасау
        Enemy weakEnemy = baseEnemy.clone();
        weakEnemy.setHealth(70);

        Enemy strongEnemy = baseEnemy.clone();
        strongEnemy.setHealth(150);
        strongEnemy.setDamage(30);

        // Нәтижені шығару
        System.out.println(baseEnemy);
        System.out.println(weakEnemy);
        System.out.println(strongEnemy);
    }
}
