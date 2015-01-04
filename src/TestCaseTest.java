package tddPart2;

public class TestCaseTest extends TestCase {
 	WasRun test = null;
 
 	public TestCaseTest(String methodName) {
 		super(methodName);
 	}
	
	public void setUp() {
		test = new WasRun("testMethod");
	}
 
	public void testRunning() {
		test.run();
		System.out.println(test.wasRun);
	}
	
	public void testSetUp() {}
	public void testTemplateMethod() {
		WasRun test = new WasRun("testMethod");
 		test.run();
		System.out.println(test.wasSetUp);
		System.out.println(test.log.equals("setUp testMethod tearDown "));
 	}
 
 	public static void main(String[] args) {
		new TestCaseTest("testRunning").run();
		new TestCaseTest("testSetUp").run();
		new TestCaseTest("testTemplateMethod").run();
 	}
 
 }
