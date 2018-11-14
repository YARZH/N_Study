package L1;

public class Test_L1 {

	public static void main(String[] args) {
		Test_L1 a = new Test_L1();
		a.testL1e1();
		a.тест();
		ТестРус тестРус = new ТестРус();
		int умнож = тестРус.тестМет(тестРус.перем1);
		System.out.println(умнож);
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

}

class ТестРус {
	int перем1 = 10;
	int тестМет (int вхПерем) {
		int выхПерем = вхПерем * 5;
		return выхПерем;		
	}
}