package scrap.heap.refactor.entries;

import static org.junit.Assert.*;

import org.junit.Test;

public class BalloonTest {

	@Test
	public void test() {
		
		Balloon balloon = new Balloon(BalloonColor.Red,Material.Latex);
		
		Balloon anyBalloon = new Balloon(null,Material.Latex);
		
		
		assertTrue("toString test", balloon.toString().contains("Balloon ordered"));
		assertTrue("toString test", balloon.toString().contains(BalloonColor.Red.getValue()));
		assertTrue("toString test", balloon.toString().contains(Material.Latex.getValue()));
		
		assertTrue("toString test", anyBalloon.toString().contains(BalloonColor.Anything.getValue()));
		
	}

}
