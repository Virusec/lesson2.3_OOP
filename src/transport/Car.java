package transport;

import java.time.LocalDate;

public class Car {

    public static class Insurance {
        private final LocalDate expirationDate;
        private final double cost;
        private final String number;

        public Insurance() {
            this(null, 0, null);
        }

        public Insurance(LocalDate expirationDate, double cost, String number) {
            if (expirationDate == null) {
                this.expirationDate = LocalDate.now().plusDays(365);
            } else {
                this.expirationDate = expirationDate;
            }

            if (cost < 0) {
                this.cost = 0;
            } else {
                this.cost = cost;
            }

            if (number == null) {
                this.number = "111_111_111";
            } else {
                this.number = number;
            }
        }

        public LocalDate getExpirationDate() {
            return expirationDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkInsuranceDate() {
            if (LocalDate.now().isAfter(expirationDate)) {
                System.out.println("Срочно ехать оформлять новую страховку");
            }
        }

        public void checkNumberOfInsurance() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
                return;
            }
            char[] chars = number.toCharArray();
            int a = 0;
            for (int i = 0; i < number.length(); i++) {
                if (!(Character.isDigit(chars[i]))) {
                    a++;
                }
            }
            if (a > 0) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

    public static class Key {

        private final String remoteEngineStart;
        private final String keylessAccess;

        public Key() {
            this("Не установлено", "Не установлено");
        }

        public Key(String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart == null || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = "Не установлено";
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }

            if (keylessAccess == null || keylessAccess.isBlank()) {
                this.keylessAccess = "Не установлено";
            } else {
                this.keylessAccess = keylessAccess;
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Удаленный запуск - " + remoteEngineStart +
                    ", безключевой доступ - " + keylessAccess + ".";
        }
    }

    private final String brand;
    private final String model;
    private String color;
    private final String productionCountry;
    private Double engineVolume;
    private final Integer productionYear;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private String tires;
    private Key key;
    private Insurance insurance;

    public Car(String brand,
               String model,
               String color,
               String productionCountry,
               Double engineVolume,
               Integer productionYear,
               String transmission,
               String bodyType,
               String registrationNumber,
               int seats,
               String tires,
               Key key,
               Insurance insurance) {

        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (engineVolume == null) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (productionYear == null) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (seats < 0) {
            this.seats = 4;
        } else {
            this.seats = seats;
        }

        if (tires == null || tires.isBlank()) {
            this.tires = "Лето";
        } else {
            this.tires = tires;
        }

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

        if (insurance == null) {
            this.insurance = new Insurance();
        }else {
            this.insurance = insurance;
        }
    }

    public Car(String brand,
               String model,
               String color,
               String productionCountry,
               Double engineVolume,
               Integer productionYear,
               String tires) {
        this(brand,
                model,
                color,
                productionCountry,
                engineVolume,
                productionYear,
                tires,
                "Cедан",
                "X000xx000",
                4,
                "Ручная",
                new Key(),
                new Insurance());

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "Ручная";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || !(registrationNumber.matches("[А-Я]\\d\\d\\d[А-Я][А-Я]\\d\\d\\d"))) {
            System.out.println("Не корректный номер");
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void changeTires() {
        if (tires.equals("Лето")) {
            setTires("Зима");
        } else {
            setTires("Лето");
        }
    }
}
