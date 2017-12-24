import com.sun.xml.internal.ws.api.message.Packet;

public class Hangman {

    private Status status;
    private String answer;
    private String tried;
    private int tries;

    public Hangman (String a, int times) {

        answer = a;
        tries = times;
        tried = "";
        status = Status.Started;
    }


    public String getAnswer() {
        if(status == Status.Won)
        return answer;
        else return answer.replaceAll (".", "_");
    }

    public String getTried() {
        return tried;
    }

    public int getTries() {
        return tries;
    }

    public void guess(char a) {
        if (tried.indexOf (a) < 0)
        tried += a;

        if(answer.indexOf (a) >= 0) {
            status = Status.Won;
        }
        else{
            tries --;
            if (tries <= 0)
            status = Status.End;
        }
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