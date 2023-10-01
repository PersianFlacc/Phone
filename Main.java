public class Main {

    public static void main (String [] args){

        Phone phone1 = new Phone("79157777777", "Iphone 15 Pro Max", 221);
        Phone phone2 = new Phone("79158888888", "Galaxy S23 Ultra");
        Phone phone3 = new Phone();

        System.out.println(phone1.getNumber());
        System.out.println(phone1.model);
        System.out.println(phone1.weight);

        System.out.println("--------------------------");

        System.out.println(phone2.getNumber());
        System.out.println(phone2.model);
        System.out.println(phone2.weight);

        System.out.println("--------------------------");

        System.out.println(phone3.getNumber());
        System.out.println(phone3.model);
        System.out.println(phone3.weight);

        System.out.println("--------------------------");

        phone1.receiveCall("Мама");
        phone2.receiveCall("Папа");
        phone3.receiveCall("Сестра");
    }
}