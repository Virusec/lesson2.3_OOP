package flower.additional;


public class MainAdditional {
    public static void main(String[] args) {
//        Flower rose = new Flower("Роза",null, "Голландия", 35.59, null);
//        Flower chrysanthemum = new Flower("Хризантема",null, null, 15, 5);
//        Flower pion = new Flower("Пион",null, "Англия", 69.9, 1);
//        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);


        Flower[] flowers = new Flower[4];

        flowers[0] = new Flower("Роза", null, "Голландия", 35.59, null);
        flowers[1] = new Flower("Хризантема", null, null, 15, 5);
        flowers[2] = new Flower("Пион", null, "Англия", 69.9, 1);
        flowers[3] = new Flower("Гипсофила", null, "Турция", 19.5, 10);

        Bouquet a = new Bouquet(flowers);
        System.out.println(a.findMinExpiryDays());
        System.out.printf("%.2f", a.calculateCostBouquet(10));

    }

}
