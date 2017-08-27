package symmetricdifference;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class SymmetricDifferenceTest {

	@Test
	public void normalAgrumentsPositiveTest() {

		assertEquals(new HashSet<Integer>(Arrays.asList(3, 4, 2, 5, 7, 1, 8)),
				SymmetricDifference.getSymmetricDifference(
						new HashSet<>(Arrays.asList(3, 4, 2, 5, 7, 9)),
						new HashSet<>(Arrays.asList(1, 9, 8))));
		
		assertEquals(new HashSet<Integer>(Arrays.asList(3, 8, 5, 6, 4)),
				SymmetricDifference.getSymmetricDifference(
						new HashSet<>(Arrays.asList(2, 3, 7, 8)),
						new HashSet<>(Arrays.asList(5, 6, 2, 4, 7))));
		
		assertEquals(new HashSet<Integer>(Arrays.asList(-2, 6, -15, 2, -6, 15)),
				SymmetricDifference.getSymmetricDifference(
						new HashSet<>(Arrays.asList(0, -2, 5, 6, -15)),
						new HashSet<>(Arrays.asList(2, 0, 5, -6, 15))));
		
		assertEquals(new HashSet<Integer>(),
				SymmetricDifference.getSymmetricDifference(
						new HashSet<>(Arrays.asList(13, 255, 354, 211, 120)),
						new HashSet<>(Arrays.asList(255, 354, 211, 120, 13))));
		
		assertEquals(new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)),
				SymmetricDifference.getSymmetricDifference(
						new HashSet<>(Arrays.asList(1, 2, 3, 4)),
						new HashSet<>(Arrays.asList(5, 6, 7, 8, 9))));
	}
	
	@Test
	public void normalAgrumentsNegativeTest() {

		assertNotEquals(new HashSet<Integer>(Arrays.asList(3, 5, 7, 1, 8)),
				SymmetricDifference.getSymmetricDifference(
						new HashSet<>(Arrays.asList(3, 4, 2, 5, 7, 9)),
						new HashSet<>(Arrays.asList(1, 9, 8))));
		
		assertNotEquals(new HashSet<Integer>(Arrays.asList(8, 5, 6, 4)),
				SymmetricDifference.getSymmetricDifference(
						new HashSet<>(Arrays.asList(2, 3, 7, 8)),
						new HashSet<>(Arrays.asList(5, 6, 2, 4, 7))));
		
		assertNotEquals(new HashSet<Integer>(Arrays.asList(-2, -15, -6)),
				SymmetricDifference.getSymmetricDifference(
						new HashSet<>(Arrays.asList(0, -2, 5, 6, -15)),
						new HashSet<>(Arrays.asList(2, 0, 5, -6, 15))));
		
		assertNotEquals(new HashSet<Integer>(Arrays.asList(13, 255, 354, 211, 120)),
				SymmetricDifference.getSymmetricDifference(
						new HashSet<>(Arrays.asList(13, 255, 354, 211, 120)),
						new HashSet<>(Arrays.asList(255, 354, 211, 120, 13))));
		
		assertNotEquals(new HashSet<Integer>(),
				SymmetricDifference.getSymmetricDifference(
						new HashSet<>(Arrays.asList(1, 2, 3, 4)),
						new HashSet<>(Arrays.asList(5, 6, 7, 8, 9))));
	}
	
	@Test
	public void passingNull() {
		assertNull(SymmetricDifference.getSymmetricDifference(new HashSet<>(), null));
		assertNull(SymmetricDifference.getSymmetricDifference(null, new HashSet<>()));
		assertNull(SymmetricDifference.getSymmetricDifference(null, null));
	}
	
	@Test
	public void emptySets() {
		assertEquals(new HashSet<>(Arrays.asList(1, 2, 3)), 
				SymmetricDifference.getSymmetricDifference(
						new HashSet<>(Arrays.asList(1, 2, 3)),
						new HashSet<>()));
		
		assertEquals(new HashSet<>(Arrays.asList(1, 2, 3)), 
				SymmetricDifference.getSymmetricDifference(
						new HashSet<>(Arrays.asList(1, 2, 3)),
						new HashSet<>()));
		
		assertEquals(new HashSet<>(), 
				SymmetricDifference.getSymmetricDifference(
						new HashSet<>(),
						new HashSet<>()));
	}
	
}
