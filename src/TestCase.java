package tddPart2;

import java.lang.reflect.Method;

public class TestCase {

	String methodName;

	public TestCase(String methodName) {
		this.methodName = methodName;
	}
	
	public void setUp() {
		
	}

	public void run() {
		Class cls = this.getClass();
		try {
			this.setUp();
			Method m = cls.getDeclaredMethod(methodName, null);
			m.invoke(this);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}