import com.sun.xml.internal.ws.api.message.Packet;

public class Hangman {

    public String getAnswer() {
        return "_";
    }

    public String getTried() {
        return "";
    }

    public int getTries() {
        return 0;
    }

    public enum Status{
        Started,
        End
    }
    public Status status;
    public Hangman (String a) {

    }

    public Status getStatus() {
        return Status.Started;
    }
}