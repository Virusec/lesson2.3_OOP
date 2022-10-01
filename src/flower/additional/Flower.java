package flower.additional;

public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    Integer lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, double cost, Integer lifeSpan) {
        if (flowerName == null || flowerName.isEmpty()) {
            this.flowerName = "Цветок";
        }else {
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

        if (lifeSpan == null || lifeSpan < 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
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
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void printFlowers() {
        System.out.printf("%s. Цвет:%s. Страна происхождения: %s. Стоимость: %.2f рублей. Продолжительность жизни: %d"
                , getFlowerName(),
                getFlowerColor(),
                getCountry(),
                getCost(),
                lifeSpan);
    }
}
