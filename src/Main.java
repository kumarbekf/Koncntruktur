public class Main {
    public static void main(String[] args) {
        System.out.println("|~~~~~~~~|");
        System.out.println("| МАШИНА |");
        System.out.println("|~~~~~~~~|");
        Car car = new Car("| Makvin |","|   Red  |");
        System.out.println(car.getAty());
        System.out.println(car.getTusu());
        System.out.println("|~~~~~~~~|");
        System.out.println("|   УЙ   |");
        System.out.println("|~~~~~~~~|");
        House house = new House("|2 etaj  |","|3 room  | ");
        System.out.println(house.getHouse());
        System.out.println(house.getUi());
        System.out.println("|~~~~~~~~|");
        System.out.println("| ТЕЛЕФОН|");
        System.out.println("|~~~~~~~~|");
        Phone phone = new Phone("|Redmi 7A|","|  Black |");
        System.out.println(phone.getAty());
        System.out.println(phone.getTusu());
        System.out.println("|~~~~~~~~|");
       User user = new User(house,car,phone);
        System.out.println("Машинанын Аты :"+user.getCar().getAty());
        System.out.println("Уйдун Канча этаж :"+user.getHouse().getHouse());
        System.out.println("Телефотдун Аты :"+user.getPhone().getAty());

    }
}