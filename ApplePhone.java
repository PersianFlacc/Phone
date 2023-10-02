public class ApplePhone extends Phone{

    public ApplePhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public ApplePhone(String number, String model) {
        super(number, model);
    }

    public ApplePhone() {
        super();
    }

    @Override
    public void info() {
        System.out.printf("Number: %s \tModel: %s \tWeight: %d\n", this.getNumber(), this.model, this.weight);
    }
}