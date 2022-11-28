public class Flower {
    private String flowerColor;
    private String name;
    private String country;
    private double cost;
    public int lifeSpan;

    private double amount;

    public Flower(String name, String flowerColor, String country, double cost,double amount, int lifeSpan) {
        this.name = name;

        this.amount = amount;

        if (flowerColor == null || flowerColor == "") {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }

        if (country == null || country == "") {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }

        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }

    }

    public Flower(String name,String flowerColor, String country, double cost,double amount) {
        this(name,flowerColor, country, cost,amount, 3);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public double getAmount() {
        return amount;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public void setFlowerColor(String flowerColor) {

        if (flowerColor == null || flowerColor == "") {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public void setCountry(String country) {
        if (country == null || country == "") {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    @Override
    public String toString() {
        return "Название цветка: " + name + ",количество"+amount+ ",цвет:" + flowerColor + ",страна:" + country + ", цена: " + cost + "р. срок состояния:(дни) " + lifeSpan;
    }
}
