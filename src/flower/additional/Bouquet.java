package flower.additional;

import java.text.DecimalFormat;

public class Bouquet {
    private final Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Integer findMinExpiryDays() {
        int minExpiryDays = flowers[0].lifeSpan;
        for (int i = 1; i < flowers.length; i++) {
            if (minExpiryDays > flowers[i].lifeSpan) {
                minExpiryDays = flowers[i].lifeSpan;
            }
        }
        return minExpiryDays;
    }
    public double calculateCostBouquet(int floristPercentage) {
        double index = ((double) floristPercentage / 100) + 1;
        double sum = 0;
        for (Flower flower : flowers) {
            sum += flower.getCost();
        }
        double result = sum * index;
        return result;
    }

}
