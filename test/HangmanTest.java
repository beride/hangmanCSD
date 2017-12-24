import org.junit.*;

import static org.junit.Assert.assertEquals;

public class HangmanTest {

    @Test
    public void when_new_game_A() {
        Hangman game = new Hangman("A",3);
        assertEquals(Hangman.Status.Started, game.getStatus());
        assertEquals ("A", game.getAnswer());
        assertEquals ("", game.getTried());
        assertEquals (3, game.getTries());
    }
    @Test
    public void given_new_game_A_when_guess_A_then_won() {
        Hangman game = new Hangman("A",3);
        assertEquals(Hangman.Status.Started, game.getStatus());
        game.guess('A');
        assertEquals (Hangman.Status.Won, game.getStatus());
        assertEquals ("A", game.getAnswer ());
        assertEquals ("A", game.getTried ());
        assertEquals (3, game.getTries ());
    }

    @Test
    public void given_new_game_A_when_guess_B_then_end() {
        Hangman game = new Hangman("A",3);
        assertEquals(Hangman.Status.Started, game.getStatus());
        game.guess('B');
        assertEquals(Hangman.Status.Started, game.getStatus());
       // assertEquals ("A", game.getAnswer ());
        assertEquals ("B", game.getTried ());
        assertEquals (2, game.getTries ());
        game.guess('B');
        assertEquals (1, game.getTries ());
        game.guess ('B');
        assertEquals (Hangman.Status.End, game.getStatus());

    }
}