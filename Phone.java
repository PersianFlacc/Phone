public class Phone {

    String number;
    String model;
    int weight;

    public Phone(String name, String model, int weight) {
        this.number = name;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String n, String m) {
        this.number = n;
        this.model = m;
    }

    public Phone() {
        this("xxx", "xxx", 0);
    }

    void printInfo() {
        System.out.printf("Number: %s \tModel: %s \tWeight: %d\n", number, model, weight);
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }
}
