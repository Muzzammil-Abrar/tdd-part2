package tddPart2;

public class WasRun extends TestCase {
 	boolean wasRun;
	boolean wasSetUp;
	String log;
 
 	public WasRun(String methodName) {
 		super(methodName);
 	}
 
 	public void testMethod() {
 		wasRun = true;
		log = "testMethod ";
 	}
 	
 	public void setUp() {
 		wasRun = false;
		wasSetUp = true;
		log = "setUp ";
	}
	
	public void tearDown() {
		log = "tearDown "; 
 	}
 
 }
