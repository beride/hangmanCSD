import org.junit.*;

import static org.junit.Assert.assertEquals;

public class HangmanTest {

    @Test
    public void when_new_game() {
        Hangman game = new Hangman("");
        assertEquals(Hangman.status.Started,game.getStatus());
    }
}