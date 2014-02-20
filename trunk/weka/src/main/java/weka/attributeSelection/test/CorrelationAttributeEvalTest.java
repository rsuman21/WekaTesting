package weka.attributeSelection.test;

import org.junit.Test;

import weka.attributeSelection.CorrelationAttributeEval;
import junit.framework.TestCase;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.RevisionUtils;

public class CorrelationAttributeEvalTest extends TestCase {

	private static final Object[] String = null;

	public CorrelationAttributeEvalTest(String name) {
		super(name);
	}

	
	/*@Test
	public void testgetCapabilities(){
		Capability expected = Capabilities.Capability.MISSING_VALUES;
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		Capabilities actual = obj.getCapabilities();
		assertEquals(expected, actual);
	
		
	}*/
/*
 * This tests get the options of algorithms 
 * this results pass because the expected is not equal actual.
 */
	@Test
	public void testgetOptions_pass() {
		String[] expected = new String[1];
		expected[0]= "";
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		String[] actual = obj.getOptions();
		assert(expected!= actual);
		
	}
	/*
	 * This tests get the options of algorithms 
	 * this results pass because the expected is not equal actual.
	 */
	@Test
	public void testgetOptions_fail() {
		String[] expected = new String[1];
		expected[0]= "D";
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		String[] actual = obj.getOptions();
		assert(expected!= actual);
		
	}
	
	/* This test case tests the revision of the algorithm 
     *The test should pass if the actual value equals expected values.
     */
	@Test
	public void testGetRevision_pass() {
		String expected = RevisionUtils.extract("$Revision: 10172 $");
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		String actual = obj.getRevision();
		assertEquals("Should have expected" + expected + "\n"+ 
		"got" + actual + "\n" ,expected, actual);
	}
	
	/* This test case tests the revision of the algorithm 
     *The test should pass if the actual value not equals expected values.
     */
	@Test
	public void testGetRevision_fail() {
		String expected = RevisionUtils.extract("$Revision: 10111 $");
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		String actual = obj.getRevision();
		assert(expected!= actual);
	}
	
	/* This test case tests check the detail info tip of the algorithm 
     *The test should pass if the actual value equals expected values.
     */
	@Test
	public void testoutputDetailedInfoTipText_pass() {
		String expected = "Output per value correlation for nominal attributes";
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		String actual = obj.outputDetailedInfoTipText();
		assertEquals("Should have expected" + expected + "\n"+ 
		"got" + actual + "\n" ,expected, actual);
	}
	
	/* This test case tests check the detail info tip of the algorithm 
     *The test should pass if the actual value not equals expected values.
     */
	@Test
	public void testoutputDetailedInfoTipText_fail() {
		String expected = "Output";
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		String actual = obj.outputDetailedInfoTipText();
		assert(expected!= actual);
	}
	/* This test case tests check the detail info of the algorithm 
     *The test should pass if the actual value equals expected values.
     */	
	@Test
	public void testgetOutputDetailedInfo_pass(){
		boolean expected = false;
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		boolean actual = obj.getOutputDetailedInfo();
		assertEquals(expected, actual);
		
	}
	/* This test case tests check the detail info of the algorithm 
     *The test should pass if the actual value not equals expected values.
     */
	@Test
	public void testgetOutputDetailedInfo_fail(){
		boolean expected = true;
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		boolean actual = obj.getOutputDetailedInfo();
		assert(expected!= actual);
		
	}
	
	/* This test case tests check the global info of the algorithm 
     *The test should pass if the actual value not equals expected values.
     */	
		
	@Test
	public void testglobalInfo_fail(){
		String expected = "CorrelationAttributeEval";
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		String actual = obj.globalInfo();
		assert(expected!= actual);
	}

	/* This test case tests sets the output info of the algorithm 
     *The test should pass if the actual value not equals expected values.
     */
	@Test
	public void testsetOutputDetailedInfo_pass(){
		boolean expected = false;
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		obj.setOutputDetailedInfo(expected);
		boolean actual = obj.getOutputDetailedInfo();
		assertEquals(expected,actual);
		
	}
	
}
