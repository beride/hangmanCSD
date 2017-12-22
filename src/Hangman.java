public class Hangman {

    public enum status{
        Started,
        End
    }
    public Hangman (String a) {

    }

    public status getStatus() {
        return status.Started;
    }
}