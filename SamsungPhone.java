public class SamsungPhone extends Phone{

    public SamsungPhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public SamsungPhone(String number, String model) {
        super(number, model);
    }

    public SamsungPhone() {
        super();
    }

    @Override
    public void info() {
        System.out.printf("Number: %s \tModel: %s \tWeight: %d\n", this.getNumber(), this.model, this.weight);
    }
}