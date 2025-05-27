// What an observer must be able to do: receive an update.
interface Observer {
    void update(String data); // When the subject changes, it calls this method.
}