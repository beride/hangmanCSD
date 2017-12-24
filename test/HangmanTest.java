import org.junit.*;

import static org.junit.Assert.assertEquals;

public class HangmanTest {

    @Test
    public void when_new_game_A() {
        Hangman game = new Hangman("A",3);
        assertEquals(Hangman.Status.Started, game.getStatus());
        assertEquals ("_", game.getAnswer());
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
    @Test
    public void given_new_game_A_when_guess_B_B_then_end() {
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
        assertEquals ("B", game.getTried ());
        assertEquals (Hangman.Status.End, game.getStatus());

    }
    @Test
    public void given_new_game_ABC_when_guess__then_end() {
        Hangman game = new Hangman("ABC",3);
        assertEquals(Hangman.Status.Started, game.getStatus());
        assertEquals ("___",game.getAnswer ());
    }
    @Test
    public void given_new_game_ABC_when_guess_C_then_end() {
        Hangman game = new Hangman("ABC",3);
        assertEquals(Hangman.Status.Started, game.getStatus());
        game.guess ('C');
        assertEquals ("__C",game.getAnswer ());
    }

    @Test
    public void given_new_game_ABC_when_guess_C_B_A_then_end() {
        Hangman game = new Hangman("ABC",3);
        assertEquals(Hangman.Status.Started, game.getStatus());
        game.guess ('C');
        game.guess ('B');
        game.guess ('A');
        assertEquals ("ABC",game.getAnswer ());
        assertEquals(Hangman.Status.Won, game.getStatus());

    }
    @Test
    public void given_new_game_ABC_when_guess_C_B_D_then_end() {
        Hangman game = new Hangman("ABC",3);
        assertEquals(Hangman.Status.Started, game.getStatus());
        game.guess ('C');
        game.guess ('B');
        game.guess ('D');
        game.guess ('O');
        game.guess ('I');
        assertEquals ("_BC",game.getAnswer ());
        assertEquals(Hangman.Status.End, game.getStatus());
    }

    @Test
    public void given_new_game_ABC_A_when_guess_C_B_D_then_Won() {
        Hangman game = new Hangman("ABC",3);
        game.setHint("A");
        assertEquals ("A__",game.getAnswer ());
        assertEquals(Hangman.Status.Started, game.getStatus());
        game.guess ('C');
        game.guess ('B');
        assertEquals ("ABC",game.getAnswer ());
        assertEquals(Hangman.Status.Won, game.getStatus());
    }
    @Test
    public void given_new_game_ABCDEFG_AE_when_guess_C_B_D_F_G_then_Won() {
        Hangman game = new Hangman("ABCDEFG",3);
        game.setHint("AE");
        assertEquals ("A___E__",game.getAnswer ());
        assertEquals(Hangman.Status.Started, game.getStatus());
        game.guess ('C');
        game.guess ('B');
        assertEquals ("ABC_E__",game.getAnswer ());
        assertEquals(Hangman.Status.Started, game.getStatus());
        game.guess ('D');
        game.guess ('F');
        game.guess ('G');
        assertEquals ("ABCDEFG",game.getAnswer ());
        assertEquals(Hangman.Status.Won, game.getStatus());
    }

    @Test
    public void given_new_game_ABCDEFG_AE_when_guess_C_B_D_F_HQL_then_End() {
        Hangman game = new Hangman("ABCDEFG",3);
        game.setHint("AEIOU");
        assertEquals ("A___E__",game.getAnswer ());
        assertEquals(Hangman.Status.Started, game.getStatus());
        game.guess ('C');
        game.guess ('B');
        assertEquals ("ABC_E__",game.getAnswer ());
        assertEquals(Hangman.Status.Started, game.getStatus());
        game.guess ('D');
        game.guess ('F');
        game.guess ('H');
        game.guess ('Q');
        game.guess ('L');
        assertEquals ("ABCDEF_",game.getAnswer ());
        assertEquals(Hangman.Status.End, game.getStatus());
    }
}