public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*Flower roza = new Flower("Роза", null, "Голландия", 35.59,3);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15, 5,1);
        Flower pion = new Flower("Пион", null, "Англия", 69.9, 1,1);
        Flower gipsofila = new Flower("Гипсофила", null, "Турция", 19.5, 10);
        System.out.println(roza.toString());
        System.out.println(pion.toString());*/

        Flower bouquet[] = new Flower[]{
                new Flower("Роза", null, "Голландия", 35.59, 1),
                new Flower("Хризантема", null, null, 15, 2, 4)
        };

        printCosBouquet(bouquet);
        System.out.println(checksNumCorrect("y183ru627"));

    }


    public static void printCosBouquet(Flower[] arr) {
        double sum = 0;
        int min = arr[0].lifeSpan;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getCost() * arr[i].getAmount();
            if(arr[i].lifeSpan<min) {
              min =  arr[i].lifeSpan;
            }
        }

        double totalCost = (sum * 10 / 100) + sum;

        System.out.println("Общая стоимость букета " + totalCost + " Срок состояния(дни) - "+ min);
    }


    static  String checksNumCorrect (String Num) {
        String result = "Данные введенны корректно";

        if(Num.length() != 9) {
            return "Некорректно введен номер, необходимо внести номер автомобиля в ввиде - х000хх000";
        }

        for(int i = 0;i < Num.length(); i++) {
            if(i == 0 || i == 4 || i == 5 ) {
                if(Num.charAt(i) >= '0' && Num.charAt(i) <= '9') {
                    return "Некорректно введен номер, необходимо внести буквы вместо x - х000хх000";
                }
            } else {
                if(!(Num.charAt(i) >= '0' && Num.charAt(i) <= '9')) {
                   return "Некорректно введен номер, необходимо внести цифры вместо 0 - х000хх000";
                }
            };
        }

        return "Данные введенны корректно";

    }
}