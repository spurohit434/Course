public class JavaWrapperClass {

	public static void main(String[] args) {

		// Wrapper Classes are the classes which are around the primitive datatypes to
		// provide extra functionality rather than just primitive datatype
		// example converting a string "123" into a integer with value of 123
		// converting a string with value "true" into a boolean value true
		// Byte, Short, Integer, Long, Double, Float, Character, Boolean

		Integer intval1 = new Integer(5);
		Integer intval2 = new Integer("5");

		System.out.println(intval1 == intval2);

		Integer intval3 = Integer.valueOf(13);
		Integer intval4 = Integer.valueOf("13");

		System.out.println(intval3 == intval4);

		Integer intval5 = Integer.valueOf("1101", 2); // (1101)base2 = (13)base10
		System.out.println(intval5);

		System.out.println(intval5 == intval4);

		Boolean b1 = new Boolean("True");
		Boolean b2 = new Boolean("True");
		Boolean b3 = Boolean.valueOf("True");
		Boolean b4 = Boolean.valueOf("True");
		System.out.println(b1 == b2);
		System.out.println(b3 == b4);

		// Auto_Boxing Integer intval5 = 13 this is done in background => Integer
		// intval4 = Integer.valueOf("13");

		// Integer.MAX_VALUE
		// Integer.MIN_VALUE
		// Integer.BYTES
		// Integer.SIZE

	}

}