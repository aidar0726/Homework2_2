public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;


    public Human(int yearOfBirth, String name, String town,String jobTitle) {
        if (yearOfBirth < 0) {
            yearOfBirth = 0;
        }
        this.yearOfBirth = yearOfBirth;
        if (name == null || name == "") {
            name = "Информация недоступна";
        }
        this.name = name;
        if (town == null || town == "") {
            town = "Информация недоступна";
        }
        this.town = town;
        if (jobTitle == null || jobTitle == "") {
            jobTitle = "Информация недоступна";
        }
        this.jobTitle = jobTitle;
    }

    public String getTownHuman() {
        return town;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setTownHuman(String town) {
        if (town == null || town == "") {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }



    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году. Я работаю на должности "+ jobTitle +".Будем знакомы!";
    }


}
