public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int replenishment = 1100;
        int bonus = replenishment / 100;
        if (!(replenishment > 1000)) {
            bonus = 0;
        }
        int amount = balance + replenishment + bonus;
        System.out.println("Баланс вашего счёта:" + amount);
        System.out.println("Полученных бонусов:" + bonus);
    }
}
