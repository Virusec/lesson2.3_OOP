package flower;

public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;


    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        setFlowerName(flowerName);
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);

        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }

    }

    public Flower(String flowerName, String flowerColor, String country, double cost) {
        this(flowerName, flowerColor, country, cost, 3);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        if (isNullOrEmptyOrBlank(flowerName)) {
            this.flowerName = "Цветок";
        } else {
            this.flowerName = flowerName;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (isNullOrEmptyOrBlank(flowerColor)) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (isNullOrEmptyOrBlank(country)) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    public void printFlowers() {
        System.out.printf("%s. Цвет:%s. Страна происхождения: %s. Стоимость: %.2f рублей. Продолжительность жизни: %d\n"
                , getFlowerName(),
                getFlowerColor(),
                getCountry(),
                getCost(),
                lifeSpan);
    }

    public static void printBouquet(int floristPercentage, Flower... flowers) {
        for (Flower flower : flowers) {
            if (flower != null) {
                flower.printFlowers();
            }
        }
        System.out.println("Срок стояния букета - " + findMinExpiryDays(flowers));
        System.out.printf("Стоимость букета - %.2f", calculateCostBouquet(floristPercentage, flowers));
    }

    public static int findMinExpiryDays(Flower... flowers) {
        int minExpiryDays = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower != null) {
                if (minExpiryDays > flower.lifeSpan) {
                    minExpiryDays = flower.lifeSpan;
                }
            }
        }
        return minExpiryDays;
    }

    public static double calculateCostBouquet(int floristPercentage, Flower... flowers) {
        double index = ((double) floristPercentage / 100) + 1;
        double sum = 0;
        for (Flower flower : flowers) {
            if (flower != null) {
                sum += flower.getCost();
            }
        }
        double result = sum * index;
        return result;
    }

    public static boolean isNullOrEmptyOrBlank(String value) {
        return value == null || value.isBlank() || value.isEmpty();
    }
}
