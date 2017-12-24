import org.junit.*;

import static org.junit.Assert.assertEquals;

public class HangmanTest {

    @Test
    public void when_new_game() {
        Hangman game = new Hangman("");
        assertEquals(Hangman.Status.Started,game.getStatus());
        assertEquals ("_",game.getAnswer());
        assertEquals ("",game.getTried());
        assertEquals (0,game.getTries());
    }
}