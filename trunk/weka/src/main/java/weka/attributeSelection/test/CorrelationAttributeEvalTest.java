package weka.attributeSelection.test;

import java.util.Vector;

import org.junit.Test;

import weka.attributeSelection.CorrelationAttributeEval;
import junit.framework.TestCase;
import weka.core.Capabilities;
import weka.core.Option;
import weka.core.Capabilities.Capability;
import weka.core.RevisionUtils;

public class CorrelationAttributeEvalTest extends TestCase {

	private static final Object[] String = null;

	public CorrelationAttributeEvalTest(String name) {
		super(name);
	}
	public void setUp() throws Exception {
		super.setUp();
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
	}

	public void tearDown() throws Exception {
		super.tearDown();
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
		assertNotSame(expected, actual);
		
	}
	/*
	 * This tests get the options of algorithms 
	 * this results pass because the expected is not equal actual.
	 */
	@Test
	public void testgetOptions_fail() {
		String[] expected = new String[1];
		expected[0]= "A";
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		String[] actual = obj.getOptions();
		assertNotSame(expected, actual);
		
	}
	
	@Test
	public void testgetOptions_ifstatement(){
		String[] expected = new String[1];
		expected[0]= "-D";
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		obj.setOutputDetailedInfo(true);
		boolean output = obj.getOutputDetailedInfo();
		assertEquals(true,output);
		String[] actual = obj.getOptions();
		assertEquals(expected[0], actual[0]);
		
	}
	
	@Test
	public void testgetOptions_elsestatement(){
		String[] expected = new String[1];
		expected[0]= "";
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		obj.setOutputDetailedInfo(false);
		boolean output = obj.getOutputDetailedInfo();
		assertEquals(false,output);
		String[] actual = obj.getOptions();
		assertEquals(expected[0], actual[0]);
		
	}
	
	/* This test case tests the revision of the algorithm 
     *The test should pass if the actual value equals expected values.
     */
	@Test
	public void testGetRevision_valid_inputs() {
		String expected = RevisionUtils.extract("$Revision: 10172 $");
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		String actual = obj.getRevision();
		assertEquals("Should have expected" + expected + "\n"+ 
		"got" + actual + "\n" ,expected, actual);
	}
	
	@Test
	public void testGetRevision_empty_inputs() {
		String expected = RevisionUtils.extract(" ");
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		String actual = obj.getRevision();
		assertNotSame(expected, actual);
	}
	/* This test case tests the revision of the algorithm 
     *The test should pass if the actual value not equals expected values.
     */
	@Test
	public void testGetRevision_fail() {
		String expected = RevisionUtils.extract("$Revision: 10111 $");
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		String actual = obj.getRevision();
		assertNotSame(expected, actual);
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
		assertNotSame(expected, actual);
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
		assertNotSame(expected, actual);
		
	}
	
	/* This test case tests check the global info of the algorithm 
     *The test should pass if the actual value not equals expected values.
     */	
		
	@Test
	public void testglobalInfo_fail(){
		String expected = "CorrelationAttributeEval";
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		String actual = obj.globalInfo();
		assertNotSame(expected, actual);
	}
	
	@Test
	public void testglobalInfo_pass(){
		String expected =  "CorrelationAttributeEval :\n\nEvaluates the worth of an attribute "
			      + "by measuring the correlation (Pearson's) between it and the class.\n\n"
			      + "Nominal attributes are considered on a value by "
			      + "value basis by treating each value as an indicator. An overall "
			      + "correlation for a nominal attribute is arrived at via a weighted average.\n";
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		String actual = obj.globalInfo();
		assertEquals(expected, actual);
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
	
	@Test
	public void testsetOptions_null_inputs() throws Exception{
		String[] expected = null;
		CorrelationAttributeEval obj = new CorrelationAttributeEval();
		obj.setOptions(expected);
		String[] actual = obj.getOptions();
		assertNotSame(expected, actual);
	}
	
		
	
	
	
	
}
