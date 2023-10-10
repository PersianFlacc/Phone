class XiaomiPhone extends Phone {

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
    public XiaomiPhone clone() throws CloneNotSupportedException {
        return (XiaomiPhone) super.clone();
    }
}

