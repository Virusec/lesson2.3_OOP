package flower;

public class MainFlower {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза", null, "Голландия", 35.59);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15, 5);
        Flower pion = new Flower("Пион", null, "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);

        rose.printFlowers();
        chrysanthemum.printFlowers();
        pion.printFlowers();
        gypsophila.printFlowers();

        printCostAndExpireDaysOfBouquet(10,
                rose, rose, rose,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila);
    }

    private static void printCostAndExpireDaysOfBouquet(int floristPercentage, Flower... flowers) {
        double index = ((double) floristPercentage / 100) + 1;
        double sum = 0;
        int minExpiryDays = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (minExpiryDays > flower.lifeSpan) {
                minExpiryDays = flower.lifeSpan;
            }
            sum += flower.getCost();
        }
        double result = sum * index;
        System.out.printf("Срок стояния букета - %d.\n", minExpiryDays);
        System.out.printf("Стоимость букета %.2f рублей.\n", result);
    }
}
