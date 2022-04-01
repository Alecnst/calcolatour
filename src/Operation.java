import java.math.BigDecimal;

public class Operation {

	public static BigDecimal sum(BigDecimal n1, BigDecimal n2) {
		return n1.add(n2);
	}
	public static BigDecimal sub(BigDecimal n1, BigDecimal n2) {
		return n1.subtract(n2);
	}
	public static BigDecimal mul(BigDecimal n1, BigDecimal n2) {
		return n1.multiply(n2);
	}
	public static BigDecimal div(BigDecimal n1, BigDecimal n2) {
		return n1.divide(n2);
	}
	public static BigDecimal mod(BigDecimal n1, BigDecimal n2) {
		return n1.remainder(n2);
	}
}
