// How to use it.
public class Demo {
    public static void main(String[] args) {
        Subject mySubject = new Subject(); // The thing we're watching

        ConcreteObserver obs1 = new ConcreteObserver("Viewer 1");
        ConcreteObserver obs2 = new ConcreteObserver("Viewer 2");

        mySubject.addObserver(obs1); // Viewer 1 starts watching
        mySubject.addObserver(obs2); // Viewer 2 starts watching

        mySubject.setState("New Article Published!"); // Subject changes, notifies everyone

        mySubject.removeObserver(obs1); // Viewer 1 stops watching

        mySubject.setState("Breaking News!"); // Subject changes again, only Viewer 2 gets it
    }
}