public class XiaomiPhone extends Phone{

    public XiaomiPhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public XiaomiPhone(String number, String model) {
        super(number, model);
    }

    public XiaomiPhone() {
        super();
    }

    @Override
    public void info() {
        System.out.printf("Number: %s \tModel: %s \tWeight: %d\n", this.getNumber(), this.model, this.weight);
    }
}

