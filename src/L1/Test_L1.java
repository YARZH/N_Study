package L1;

import java.util.Iterator;
import java.util.TreeMap;

public class Test_L1 {

	public static void main(String[] args) {
		Test_L1 a = new Test_L1();
		a.testL1e1();		
		a.тест();
		a.typeCast();
		
		ТестРус тестРус = new ТестРус();		
		int умнож = тестРус.тестМет(тестРус.перем1);		
		System.out.println(умнож);
		тестРус.\u0280\u0950();
		
		TreeMap<Integer,String> tm1 = new TreeMap<Integer,String>();
		tm1.put(2, "Misha");
		tm1.put(1, "Senya");
		
		String str = "first try";
		int i = 5000;
		
		ImmutableClassExample ice = new ImmutableClassExample(i, str, tm1);
		
		System.out.println("Lets see whether its copy by field or reference");
		System.out.println(str==ice.getName());
		System.out.println(tm1 == ice.getImmMap());
		
		System.out.println("print the ice values");
		System.out.println("ice id:"+ice.getId());
		System.out.println("ice name:"+ice.getName());
		System.out.println("ice immMap:"+ice.getImmMap());
		
		System.out.println("Change the local variable values");
		i=20;
		str="second try";
		tm1.put(3, "Katya");
		
		System.out.println("print the values again");
		System.out.println("ice id after local variable change:"+ice.getId());
		System.out.println("ice name after local variable change:"+ice.getName());
		System.out.println("ice immMap after local variable change:"+ice.getImmMap());
				
		TreeMap<Integer, String> tmTest = ice.getImmMap();
		tmTest.put(4, "new");
				
		System.out.println("ice immMap after changing variable from accessor methods:"+ice.getImmMap());
		
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
	
	void typeCh() {
		double a = .01;
		
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

final class ImmutableClassExample {
	
	private final int id;
	private final String name;
	private final TreeMap<Integer,String> immMap;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@SuppressWarnings("unchecked")
	public TreeMap<Integer,String> getImmMap() {
		return (TreeMap<Integer,String>) immMap.clone();
	}
	
	public ImmutableClassExample(int id, String name, TreeMap<Integer,String> tm) {
		this.id = id;
		this.name = name;
		TreeMap <Integer,String> tempMap = new TreeMap<Integer,String>();
		int key;
		Iterator<Integer> it = tm.keySet().iterator();
		while(it.hasNext()) {
			key = it.next();
			tempMap.put(key, tm.get(key));
		}
		this.immMap = tempMap;
	}
	
	
}