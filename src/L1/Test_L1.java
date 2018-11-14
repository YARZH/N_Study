package L1;

public class Test_L1 {

	public static void main(String[] args) {
		Test_L1 a = new Test_L1();
		a.testL1e1();
		a.тест();
		ТестРус тестРус = new ТестРус();
		int умнож = тестРус.тестМет(тестРус.перем1);
		System.out.println(умнож);
		тестРус.\u0280\u0950();
		a.typeCast();
	}
	
	void testL1e1() {
		int \u0046\u0047=1;
		System.out.println(\u0046\u0047);
	}
	
	void тест() {
		System.out.println("Тест 1");
		char символ = 'ж';
		System.out.println(символ);
	}
	
	void typeCast() {
		byte b1 = 10, b2;
		short s1 = 32000, s2;
		int i1 = 1999999999, i2;
		long l1 = 445l, l2;
		float f1 = 34.5e36f, f2;
		double d1 = 34.5e306, d2;
		char c1 = 'r', c2;
		s2 = b1;
		System.out.println(s2);
		i2 = s1;
		System.out.println(i2);
		l2 = i1;
		System.out.println(l2);
		f2 = l1;
		System.out.println(f2);
		d2 = i1;
		System.out.println(d2);
		i2 = c1;
		System.out.println(i2);
		f2 = i1;
		System.out.println(f2);
		d2 = l1;
		System.out.println(d2);
		s2 = (short) i1;
		System.out.println(s2);
		i2 = (int) l1;
		System.out.println(i2);
		l2 = (long) f1;
		System.out.println(l2);
		f2 = (float) d1;
		System.out.println(f2);
		b2 = (byte) s1;
		System.out.println(b2);
		c2 = (char) i1;
		System.out.println(c2);
	}

}

class ТестРус {
	int перем1 = 10;
	int тестМет (int вхПерем) {
		int выхПерем = вхПерем * 5;
		return выхПерем;		
	}
	
	void \u0280\u0950() {
		System.out.println("\u0280\u0950");
	}
}