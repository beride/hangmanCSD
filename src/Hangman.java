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
        if ("".equals (tried))
            return answer.replaceAll (".", "_");
        else
            return  answer.replaceAll("[^"+tried+"]","_");
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

        if(answer.indexOf (a) < 0) {
            tries --;
        }
    }

    public void setHint(String a) {
        tried = a;
    }

    public enum Status{
        Started,
        Won,
        End;
    }



    public Status getStatus() {
        if (answer.replaceAll (changeRE (), "_").equals (answer))
            return Status.Won;
        if (tries<=0)
            return Status.End;
        return Status.Started;
    }

    private String changeRE() {
        if(!"".equals(tried)) {
            return "[^"+tried+"]";
        }
        return ".";
    }
}