package human;

import java.time.LocalDate;

public class Human {
    String name;
    private String town;
    private Integer yearOfBirth;
    String position;

    public Human(String name, String town, int year, String position) {
        if (isNullOrEmptyOrBlank(name)) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        setTown(town);

        if (year > 0) {
            this.yearOfBirth = LocalDate.now().getYear() - year;
        } else {
            this.yearOfBirth = 0;
            System.out.println(name + " - не корректно указан год рождения.");
        }

        if (isNullOrEmptyOrBlank(position)) {
            this.position = "Информация не указана";
        } else {
            this.position = position;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (isNullOrEmptyOrBlank(town)) {
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

    public static boolean isNullOrEmptyOrBlank(String value) {
        return value == null || value.isBlank() || value.isEmpty();
    }
}
