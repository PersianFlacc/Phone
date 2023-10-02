public abstract class Phone {

    public String number;
    public String model;
    public int weight;

    public Phone() {
        this("xxx", "xxx", 0);
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }

    public abstract void info();
}
