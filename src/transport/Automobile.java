package transport;

public class Automobile {
    private String brand;
    private String model;
    public double engineVolume;
    public String color;
    private int year;
    private String country;

    public String transmission;

    private String bodyType;

    public String registrationNumber;

    private int numberSeats;

    public boolean summerTires;

    public boolean winterTires;


    public Automobile(String brand, String model, double engineVolume, String color, int year, String country) {
        if(brand == null || brand == "") {
            brand = "default";
        }

        if(model == null || model == "") {
            model = "default";
        }

        if(country == null || country == "") {
            country = "default";
        }

        if(engineVolume <= 0) {
            engineVolume = 1.5;
        }

        if(year <= 0) {
            year = 2000;
        }

        if(color == null || color == "") {
            color = "белый";
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }



    @Override
    public String toString() {
        return brand + "," + year + " год выпуска," + "сборка в " + country + "," +  color + " цвет кузова," +  " объем двигателя - " + engineVolume + " л.";
    }
}
