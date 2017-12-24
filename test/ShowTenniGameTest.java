
import org.junit.Test;

import static org.junit.Assert.*;

public class ShowTenniGameTest {

    @Test
    public void Given_0_0_when_then_Love_All(){
       assertEquals ("Love All", ShowTenniGame.showResult (0,0));
    }
}