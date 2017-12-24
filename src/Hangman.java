import com.sun.xml.internal.ws.api.message.Packet;

public class Hangman {

    private Status status;
    private String answer;
    private String tried;
    private int tries;

    public Hangman (String a) {

        answer = a;
        tries = 0;
        tried = "";
        status = Status.Started;
    }

    public String getAnswer() {
        return answer;
    }

    public String getTried() {
        return tried;
    }

    public int getTries() {
        return tries;
    }

    public void guess(char a) {
        tried += a;
        tries++;
        if(answer.equals (tried))
        status = Status.Won;
        else
            status = Status.End;
    }

    public enum Status{
        Started,
        Won,
        End;
    }



    public Status getStatus() {
        return status;
    }
}