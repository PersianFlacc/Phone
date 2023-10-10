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
    public SamsungPhone clone() throws CloneNotSupportedException {
        return (SamsungPhone) super.clone();
    }
}