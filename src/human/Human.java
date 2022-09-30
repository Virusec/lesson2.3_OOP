package human;

import java.time.LocalDate;

public class Human {
    String name;
    private String town;
    private Integer yearOfBirth;
    String position;

    public Human(String name, String town, int year, String position) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

        if (year > 0) {
            this.yearOfBirth = LocalDate.now().getYear() - year;
        } else {
            this.yearOfBirth = 0;
            System.out.println(name + " - не корректно указан год рождения.");
        }

        if (position == null) {
            this.position = "Информация не указана";
        } else {
            this.position = position;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        if (yearOfBirth != null && yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
            System.out.println(name + " - не корректно указан год рождения.");
        }
    }

    public void printObject() {
        System.out.println(" Привет! Меня зовут " + name + ". Я из города "
                + town + ". Я родился в "
                + yearOfBirth + " году. Я работаю на должности "
                + position + ". Будем знакомы!");
    }
}
