public class Main {
    public static void main(String[] args) {
        int startSum = 300;
        int addSum = 1300;
        int bonus = addSum / 100;

        startSum += addSum > 1000 ? addSum + bonus : addSum;

        System.out.println("Ваш баланс " + startSum + ". Начислено бонусных рублей: " + bonus);
    }
}
