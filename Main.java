public class Main {

    public static void main (String [] args){

        System.out.println("--------------------------");

        SamsungPhone phone1 = new SamsungPhone("111", "S10", 260);
        phone1.info();
        phone1.receiveCall("Мама");

        System.out.println("--------------------------");

        XiaomiPhone phone2 = new XiaomiPhone("222", "Redmi123");
        phone2.info();
        phone2.receiveCall("Папа");

        System.out.println("--------------------------");

        ApplePhone phone3 = new ApplePhone();
        phone3.info();
        phone3.receiveCall("Сестра");
    }
}