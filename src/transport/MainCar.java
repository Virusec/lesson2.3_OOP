package transport;

import java.time.LocalDate;
import java.time.Month;

public class MainCar {
    public static void main(String[] args) {
        Car lada = new Car("Lada",
                "Kalina",
                "красный",
                "Россия",
                1.5,
                2019,
                "Ручная",
                "Седан",
                "А001АВ777",
                4,
                "Лето",
                new Car.Key(),
                new Car.Insurance());
        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                "черный",
                "Германия",
                3.0,
                2020,
                "Автомат",
                "Седан",
                "А111НВ750",
                4,
                "Зима", new Car.Key(),
                new Car.Insurance());
        Car bmw = new Car("BMW",
                "Z8",
                "черный",
                "Германия",
                3.0,
                2021,
                "Автомат",
                "Купе",
                "Н111КН777",
                2,
                "Лето", new Car.Key(),
                new Car.Insurance());
        Car kia = new Car("Kia",
                "Sportage 4 поколение",
                "красный",
                "Южная Корея",
                2.4,
                2018,
                "Автомат",
                "Кроссовер",
                "С462КН778",
                5,
                "Зима", new Car.Key(),
                new Car.Insurance());
        Car hyundai = new Car("Hyundai",
                "Avante",
                "оранжевый",
                "Южная Корея",
                1.6,
                2016,
                "Ручная",
                "Универсал",
                "Т612ЕН777",
                5,
                "Зима",
                new Car.Key("Установлено", "Не установлено"),
                new Car.Insurance(LocalDate.now(),
                        10000,
                        "123456789"));

        printCarInfo(lada);
        lada.changeTires();
        lada.setRegistrationNumber("А123МА13");

        Car.Insurance basicInsurance = new Car.Insurance(LocalDate.of(2022, Month.MAY, 10), 2000, "а555aа123");
        basicInsurance.checkInsuranceDate();
        basicInsurance.checkNumberOfInsurance();
        printCarInfo(hyundai);
        hyundai.getInsurance().checkInsuranceDate();
        printCarInfo(lada);
    }

    private static void printCarInfo(Car car) {
        System.out.println("Марка - " + car.getBrand() + ", модель - " +
                car.getModel() +
                ", цвет: " + car.getColor() +
                ", страна производитель: " + car.getProductionCountry() +
                ", объём двигателя: " + car.getEngineVolume() +
                ", год выпуска: " + car.getProductionYear() +
                ", КПП - " + car.getTransmission() +
                ", кузов: " + car.getBodyType() +
                ", рег.номер: " + car.getRegistrationNumber() +
                ", количество мест - " + car.getSeats() +
                ", резина - " + car.getTires() +
                ", " + car.getKey() +
                ", номер страховки: " + car.getInsurance().getNumber() +
                ", цена: " + car.getInsurance().getCost() +
                ", дата окончания: " + car.getInsurance().getExpirationDate() + ".");
    }
}
