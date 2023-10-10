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

        System.out.println("--------------------------");

        SamsungPhone Phone = new SamsungPhone("56789", "S99", 100);

        try {
            Phone[] phoneArray = new Phone[10];
            for (int i = 0; i < phoneArray.length; i++) {
                phoneArray[i] = Phone.clone();
            }

            for (Phone phone : phoneArray) {
                System.out.println(phone);
            }
        } catch (CloneNotSupportedException exception) {
            System.out.println("Clonable not supported!");
        }
    }
}