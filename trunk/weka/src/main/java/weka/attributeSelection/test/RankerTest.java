package weka.attributeSelection.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import weka.attributeSelection.AttributeSelection;
import weka.attributeSelection.Ranker;

public class RankerTest {

	public RankerTest() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void numToSelectTipTextTest(){
		Ranker rankTest = new Ranker();
		String actual = rankTest.numToSelectTipText();
		String expected = "Specify the number of attributes to retain. The default value "
			      + "(-1) indicates that all attributes are to be retained. Use either "
			      + "this option or a threshold to reduce the attribute set.";
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void getNumToSelectTest(){
		Ranker test = new Ranker();
		test.setNumToSelect(34);
		int yell = test.getNumToSelect();
		int expected = 34;
		assertEquals(expected, yell);
	}
	
	@Test
	public void getCalculatedNumToSelectTest(){
		Ranker test = new Ranker();
		test.setNumToSelect(98);
		int expected = 98;
		int actual = test.getCalculatedNumToSelect();
		assertEquals(expected, actual);
	}
	
	@Test
	public void thresholdTipTextTest(){
		Ranker test = new Ranker();
		String expected = "Set threshold by which attributes can be discarded. Default value "
			      + "results in no attributes being discarded. Use either this option or "
			      + "numToSelect to reduce the attribute set.";
		String actual = test.thresholdTipText();
		assertEquals(expected, actual);
	}
	
	@Test
	public void thresholdTipTextTest2(){
		Ranker test = new Ranker();
		String expected = "Set threshold by which attributes can be discarded. Default value ";
		String actual = test.thresholdTipText();
		assert(expected != actual);
	}
	
	@Test
	public void getThresholdTest(){
		Ranker test = new Ranker();
		double expected = 45.99898998989899;
		test.setThreshold(45.99898998989899);
		double actual = test.getThreshold();
		System.out.println(actual);
		assert(expected == actual);
		
	}
	
	@Test
	public void getGenerateRankingTest(){
		Ranker test = new Ranker();
		test.setGenerateRanking(true);
		boolean expected = true;
		boolean actual = test.getGenerateRanking();
		assertEquals(expected, actual);
	}
	
	@Test
	public void startSetTipTextTest(){
		Ranker test = new Ranker();
		String expected = "Specify a set of attributes to ignore. "
			      + " When generating the ranking, Ranker will not evaluate the attributes "
			      + " in this list. " + "This is specified as a comma "
			      + "seperated list off attribute indexes starting at 1. It can include "
			      + "ranges. Eg. 1,2,5-9,17.";
		String actual = test.startSetTipText();
		assertEquals(expected, actual);
	}
	
	@Test
	public void startSetTipTextTest2(){
		Ranker test = new Ranker();
		String expected = "Specify a set of attributes to ignore. ";
		String actual = test.startSetTipText();
		assert(expected != actual);
	}
	
	@Test
	public void getRevisionTest() {
		AttributeSelection m = new AttributeSelection();
		String actual = m.getRevision();
		String expected = "10172";
		assertEquals(actual , expected);
	} 

}
