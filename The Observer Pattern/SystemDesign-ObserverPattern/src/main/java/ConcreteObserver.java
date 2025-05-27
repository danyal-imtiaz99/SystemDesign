// A specific type of observer that acts on the update.
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String data) {
        System.out.println(name + " received: " + data); // Simply prints the received data
    }
}