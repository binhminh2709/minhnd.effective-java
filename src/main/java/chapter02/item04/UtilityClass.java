// Noninstantiable utility class

package chapter02.item04;

public class UtilityClass {
	
	// Suppress default constructor for noninstantiability
	private UtilityClass() {
		throw new AssertionError();
	}
}
