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
    public void receiveCall() {}

    @Override
    public void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    @Override
    public void info() {
        System.out.printf("Number: %s \tModel: %s \tWeight: %d\n", this.getNumber(), this.model, this.weight);
    }

    @Override
    public ApplePhone clone() throws CloneNotSupportedException {
        return (ApplePhone) super.clone();
    }
}