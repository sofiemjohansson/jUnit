package junit1;



	import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
	import static org.junit.jupiter.api.Assumptions.assumeTrue;

	import org.junit.jupiter.api.AfterAll;
	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Disabled;
	import org.junit.jupiter.api.Test;

	 class lo {

	    @BeforeAll
	    static void initAll() {
	    }

	    @BeforeEach
	    void init() {
	    }

	    @Test
	    void succeedingTest() {
	    	calculator one=new calculator();
	    	
	    	int value= one.add(5, 10);
	    	assertEquals(15, value); // Kollar om värdet är samma som inmatat.
	    }

	    @Test
	    void failingTest() {
	        
	    calculator one=new calculator();
	    	
	    	int value= one.add(5, 10);
	    	assertEquals(20, value); // Assert. assertEquals() methods checks that the two objects are equals or not. If they are not, 
	    	//an AssertionError without a message is thrown.
	    	//Incase if both expected and actual values are null, then this method returns equal.
	    }
@Test
	    void booleantest() {
	        
		    calculator one=new calculator();
		    	
		    	boolean value= one.equalnumber(5, 10);
		    	assertFalse(value); // ssertFalse is basically a function that can be used to check if a specific logic
		    	//or process will return a false statement.
		    	
}
	    @Test
	    @Disabled("for demonstration purposes")
	  //  void skippedTest() {
	        // not executed
	 //   }

	//    @Test
	//    void abortedTest() {
	//        assumeTrue("abc".contains("Z"));
	//("test should have been aborted");
	//    }

	    @AfterEach
	    void tearDown() {
	    }

	    @AfterAll
	    static void tearDownAll() {
	    }

	}
	 
	 //in the Java computer programming language, an annotation is a form of syntactic metadata that can be added to Java source code.
	 //Classes, methods, variables, parameters and Java packages may be annotated. 
	// Like Javadoc tags, Java annotations can be read from source files.
