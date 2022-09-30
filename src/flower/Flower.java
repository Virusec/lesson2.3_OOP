package flower;

public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;


    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerName == null || flowerName.isEmpty()) {
            this.flowerName = "Цветок";
        } else {
            this.flowerName = flowerName;
        }

        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }

        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }

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
        if (flowerName == null || flowerName.isEmpty()) {
            this.flowerName = "Цветок";
        } else {
            this.flowerName = flowerName;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
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

//    public static void printBouquet(int floristPercentage,Flower... flowers) {
//        System.out.println("Срок стояния букета - " + findMinExpiryDays());
//        System.out.println("Стоимость букета" + calculateCostBouquet(floristPercentage));
//
//    }

//    public static int findMinExpiryDays(Flower... flowers) {
//        int minExpiryDays = Integer.MAX_VALUE;
//        for (int i = 0; i < flowers.length; i++) {
//            if (minExpiryDays > flowers[i].lifeSpan) {
//                minExpiryDays = flowers[i].lifeSpan;
//            }
//        }
//        return minExpiryDays;
//    }
//
//    public static double calculateCostBouquet(int floristPercentage, Flower... flowers) {
//        double index = ((double) floristPercentage / 100) + 1;
//        double sum = 0;
//        for (Flower flower : flowers) {
//            sum += flower.getCost();
//        }
//        double result = sum * index;
//        return result;
//    }
}
