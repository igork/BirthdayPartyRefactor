package scrap.heap.refactor.entries;

import static org.junit.Assert.*;

import org.junit.Test;

public class BalloonColorTest {

	@Test
	public void test() {
		BalloonColor color = BalloonColor.Red;
		BalloonColor yellow = BalloonColor.Yelllow;


        assertEquals("color value should match", "Red",color.getValue());
        assertNotEquals("color value should not match", "RED",color.getValue());
        assertNotEquals("color value should not match", yellow,color);

    	BalloonColor any1 = BalloonColor.getEnum(null);
    	BalloonColor any2 = BalloonColor.getEnum("");
    	
        assertEquals("any color", any1,BalloonColor.Anything);
        assertEquals("any color", any2,BalloonColor.Anything);
        assertEquals("any color", any1.getValue(),BalloonColor.Anything.getValue());

        try {
        	
        	BalloonColor wrong = BalloonColor.getEnum("magenta");

        } catch (IllegalArgumentException e) {

            assertTrue("wrong message", e.getMessage().contains("Wrong BalloonColor value"));

        }
	}

}
