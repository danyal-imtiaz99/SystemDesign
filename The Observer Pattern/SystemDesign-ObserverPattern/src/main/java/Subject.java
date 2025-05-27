// What is being observed. It keeps a list of observers.
import java.util.ArrayList;
import java.util.List;

class Subject {
    private List<Observer> observers = new ArrayList<>(); // Who's listening
    private String state; // The actual data being observed

    public void addObserver(Observer o) {
        observers.add(o); // Add a listener
    }

    public void removeObserver(Observer o) {
        observers.remove(o); // Remove a listener
    }

    // Change state and tell everyone
    public void setState(String newState) {
        this.state = newState;
        notifyObservers(); // Tell all listeners
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(this.state); // Call update on each listener
        }
    }
}