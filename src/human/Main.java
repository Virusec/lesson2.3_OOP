package human;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", "Москва", 35, "бренд-менеджер");
        Human anya = new Human("Аня", "Москва", 29, "методист образовательных программ");
        Human katya = new Human("Катя", "Минск", 28, "продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 27, "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 21, "нигде не работает");

        maksim.setTown("");
        maksim.setYearOfBirth(null);
        maksim.printObject();
        anya.printObject();
        katya.printObject();
        artem.printObject();
        vladimir.printObject();
    }
}