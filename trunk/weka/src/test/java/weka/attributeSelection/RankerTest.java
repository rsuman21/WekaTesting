package weka.attributeSelection.test;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import weka.attributeSelection.ASEvaluation;
import weka.attributeSelection.AttributeEvaluator;
import weka.attributeSelection.AttributeSelection;
import weka.attributeSelection.Ranker;
import weka.core.Instances;
import weka.core.Option;
import weka.core.Utils;

public class RankerTest<E> {

	public RankerTest() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void globalInfoTest() {
		Ranker actual = new Ranker();
		String expected = "Ranker : \n\nRanks attributes by their individual evaluations. "
			      + "Use in conjunction with attribute evaluators (ReliefF, GainRatio, "
			      + "Entropy etc).\n";
		assertEquals(expected, actual.globalInfo());
	}
	
	//This test is to pass because the input should be the same as the output.
	@Test
	public void numToSelectTipTextTest_pass(){
		Ranker rankTest = new Ranker();
		String actual = rankTest.numToSelectTipText();
		String expected = "Specify the number of attributes to retain. The default value "
			      + "(-1) indicates that all attributes are to be retained. Use either "
			      + "this option or a threshold to reduce the attribute set.";
		assertEquals(expected, actual);
		
	}
	//This test should pass because the input is different but so will the output. 
	//So they are not equal to each other. 
	@Test
	public void numToSelectTipTextTest_fail(){
		Ranker rankTest = new Ranker();
		String actual = rankTest.numToSelectTipText();
		String expected = "Specify the number of attributes to retain. The default value ";
		System.out.println(actual);
		assertNotSame(expected , actual);
		
	}
	
	//This test should pass because we inputing a positive integer and the output should be the same.
	//So the expected and actual should be same. 
	@Test
	public void getNumToSelectTest_pass(){
		Ranker test = new Ranker();
		test.setNumToSelect(34);
		int yell = test.getNumToSelect();
		int expected = 34;
		System.out.println(yell);
		assertEquals(expected, yell);
	}
	
	//This test should pass since we are inputting a negative number and the output should be just the same.
	//So expected should be the same as the input. 
	@Test
	public void getNumToSelectTest_fail(){
		Ranker test = new Ranker();
		test.setNumToSelect(-4);
		int yell = test.getNumToSelect();
		int expected = -4;
		System.out.println(yell);
		assertEquals(expected, yell);
	}
	
	//This test should pass because we are inputting a positive number.
	//The expected should equal the actual.
	@Test
	public void getCalculatedNumToSelectTest_pass(){
		Ranker test = new Ranker();
		test.setNumToSelect(98);
		int expected = 98;
		int actual = test.getCalculatedNumToSelect();
		System.out.println(actual);
		assertEquals(expected, actual);
	}

	//This test should pass because we are inputting a negative integer, and the function sets its variable to the input.
	//Though the expected will not be same as the actual output, because inside the get function, it checks if the input is positive.
	//if it isn't, then it create an error. 
	@Test
	public void getCalculatedNumToSelectTest_fail(){
		Ranker test = new Ranker();
		test.setNumToSelect(-98);
		int expected = -98;
		int actual = test.getCalculatedNumToSelect();
		System.out.println(actual);
		assertNotSame(expected , actual);
	}
	
	//This test should pass since we are inputting nothing, we are just calling the function.
	//So the expected should equal the actual. 
	@Test
	public void thresholdTipTextTest_pass(){
		Ranker test = new Ranker();
		String expected = "Set threshold by which attributes can be discarded. Default value "
			      + "results in no attributes being discarded. Use either this option or "
			      + "numToSelect to reduce the attribute set.";
		String actual = test.thresholdTipText();
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	//This test should pass because we are not inputting anything into the function.
	//So the expected will not equal the actual.
	@Test
	public void thresholdTipTextTest_fail(){
		Ranker test = new Ranker();
		String expected = "Set threshold by which attributes can be discarded. Default value ";
		String actual = test.thresholdTipText();
		System.out.println(actual);
		assertNotSame(expected ,actual);
	}
	
	//This test should pass because we are inputting a positive double number.
	//The expected should equal the actual because it just sets the variable as the input number. 
	//So the output should be the same as the input. 
	@Test
	public void getThresholdTest_pass(){
		Ranker test = new Ranker();
		double expected = 45.99898998989899;
		test.setThreshold(45.99898998989899);
		double actual = test.getThreshold();
		System.out.println(actual);
		assertTrue(expected == actual);
		
	}
	
	//This test should pass because we are inputting a positive double number.
	//The expected should equal the actual because it just sets the variable as the input number.
	//So the output should be the same as the input. 
	@Test
	public void getThresholdTest_fail(){
		Ranker test = new Ranker();
		double expected = -45.99898998989899;
		test.setThreshold(-45.99898998989899);
		double actual = test.getThreshold();
		System.out.println(actual);
		assertTrue(expected == actual);
		
	}
	
	//This test should pass because we inputting a boolean, and the function sets its variable to the input.
	//and then returns that same variable in the get function. 
	//So the expected should be the same as the actual output. 
	@Test
	public void getGenerateRankingTest_pass(){
		Ranker test = new Ranker();
		test.setGenerateRanking(true);
		boolean expected = true;
		boolean actual = test.getGenerateRanking();
		assertEquals(expected, actual);
	}
	
	//This test should pass because we are inputting a boolean into the set function.
	//but the expected will not be the same as the actual because the set function is a dummy function, so it does nothing.
	//The get function will always return true, so thats why the above test passes too. 
	@Test
	public void getGenerateRankingTest_fail(){
		Ranker test = new Ranker();
		test.setGenerateRanking(false);
		boolean expected = false;
		boolean actual = test.getGenerateRanking();
		System.out.println(actual);
		assertNotSame(expected , actual);
	}
	
	//This test should pass since we are inputting nothing, we are just calling the function.
	//So the expected should equal the actual. 
	@Test
	public void startSetTipTextTest_pass(){
		Ranker test = new Ranker();
		String expected = "Specify a set of attributes to ignore. "
			      + " When generating the ranking, Ranker will not evaluate the attributes "
			      + " in this list. " + "This is specified as a comma "
			      + "seperated list off attribute indexes starting at 1. It can include "
			      + "ranges. Eg. 1,2,5-9,17.";
		String actual = test.startSetTipText();
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	//This test should pass because we are not inputting anything into the function.
	//So the expected will not equal the actual.
	@Test
	public void startSetTipTextTest2_fail(){
		Ranker test = new Ranker();
		String expected = "Specify a set of attributes to ignore. ";
		String actual = test.startSetTipText();
		System.out.println(actual);
		assertNotSame(expected , actual);
	}
	
	//This test should pass since we are inputting nothing, we are just calling the function.
	//So the expected should equal the actual. 
	@Test
	public void getRevisionTest_pass() {
		AttributeSelection m = new AttributeSelection();
		String actual = m.getRevision();
		String expected = "10172";
		System.out.println(actual);
		assertEquals(actual , expected);
	} 
	
	//This test should pass because we are not inputting anything into the function.
	//So the expected will not equal the actual.
	@Test
	public void getRevisionTest_fail() {
		AttributeSelection m = new AttributeSelection();
		String actual = m.getRevision();
		String expected = "10";
		System.out.println(actual);
		assertNotSame(actual , expected);
	} 
	
	//This test basically tests if the values in the list are the same ones that are tested. 
	//So we are basically testing against certain strings to see if the test will pass or not. 
	@SuppressWarnings("unchecked")
	@Test
	public void listOptions(){
		Ranker actual = new Ranker();
		Vector<E> options = new Vector<E>();
		Option m = new Option("\tSpecify a starting set of attributes.\n"
			      + "\tEg. 1,3,5-7.\n" + "\tAny starting attributes specified are\n"
			      + "\tignored during the ranking.", "P", 1, "-P <start set>");
		options.addElement( (E) new Option("\tSpecify a starting set of attributes.\n"
			      + "\tEg. 1,3,5-7.\n" + "\tAny starting attributes specified are\n"
			      + "\tignored during the ranking.", "P", 1, "-P <start set>"));
		options.addElement((E) new Option("\tSpecify a theshold by which attributes\n"
		        + "\tmay be discarded from the ranking.", "T", 1, "-T <threshold>"));
		options.addElement((E)new Option("\tSpecify number of attributes to select",
			      "N", 1, "-N <num to select>"));
		assertNotSame(options.elements() , actual.listOptions());
	}
	
	//This test basically tests if the values in the list are the same ones that are tested. 
		//So we are basically testing against certain strings to see if the test will pass or not. 
	public void listOptionsTest2(){
		Ranker actual = new Ranker();
		Vector<E> options = new Vector<E>();
		Option m = new Option("\tSpecify a starting set of attributes.\n"
			      + "\tEg. 1,3,5-7.\n" + "\tAny starting attributes specified are\n"
			      + "\tignored during the ranking.", "P", 1, "-P <start set>");
		options.addElement( (E) new Option("\tSpecify a starting set of attributes.\n"
			      + "\tEg. 1,3,5-7.\n" + "\tAny starting attributes specified are\n"
			      + "\tignored during the ranking.", "P", 1, "-P <start set>"));
		options.addElement((E) new Option("\tSpecify a theshold by which attributes\n"
		        + "\tmay be discarded from the ranking.", "T", 1, "-T <threshold>"));
		options.addElement((E)new Option("\tSpecify number of attributes to select",
			      "N", 1, "-N <num to select>"));
		assertSame(options.elements() , actual.listOptions());
	}
	
	//This test sees if it sets the options (values) in the array.
	//So it is being tested if the options that are being set are the same ones that if we were manually putting them.
	@Test
	public void setOptionsTest() throws Exception{
		Ranker actual = new Ranker();
		String [] options = {"P","K","M"};
		System.out.println(options[0]);
		
		String optionString;
		optionString = Utils.getOption('P', options);
		
		//This if statement is not working!!! WHY?????
		if (optionString.length() != 0) {
			actual.setStartSet(optionString);
		}
		System.out.println("This is the test for setOptionsTest: " + actual.getStartSet());
		String [] actualm = actual.getOptions();
		assertEquals(options.toString() , actualm[0]);
	}
	
	//Get options test basically gets the option that were set in the setOptions function. 
	//This test is only testing if it gets the same options as that were set. 
	@Test
	public void getOptionsTest1(){
		Ranker actual = new Ranker();
		Ranker m = new Ranker();
		Vector<String> options = new Vector<String>();
		
		if(! actual.getStartSet().equals("")){
			 options.add("-P");
		}
	
		//actual.setNumToSelect(4);
		//actual.setThreshold(76.98);
		
		options.add("-T");
	    options.add("" + actual.getThreshold());

	    options.add("-N");
	    options.add("" + actual.getNumToSelect());
	    System.out.println("The options" +options.elementAt(0));
	    String [] l = m.getOptions();
	    assertSame(options.elementAt(0), l[0]);
	}
	
	//Get options test basically gets the option that were set in the setOptions function. 
	//This test is only testing if it gets the same options as that were set. 
	@Test
	public void getOptionsTest2(){
		Ranker actual = new Ranker();
		Ranker m = new Ranker();
		Vector<String> options = new Vector<String>();
		actual.getStartSet().equals("-P");
		if(!actual.getStartSet().equals("-P")){
			options.add("-P");
		}
		
		//actual.setNumToSelect(4);
		//actual.setThreshold(76.98);
		
		options.add("-T");
	    options.add("" + actual.getThreshold());

	    options.add("-N");
	    options.add("" + actual.getNumToSelect());
	    System.out.println("The options" +options.elementAt(0));
	    String [] l = actual.getOptions();
	    assertNotSame(options.elementAt(0), l[0]);
	}
	
	//The search test is basically testing if the item that was sent was searched for in the database. 
	@Test
	public void searchTest() throws Exception{
		Ranker actual = new Ranker();
		ASEvaluation ASEval = null;
		Instances data = null;
		
		if (!(ASEval instanceof AttributeEvaluator)) {
		      throw new Exception(ASEval.getClass().getName() + " is not a"
		        + "Attribute evaluator!");
		    }
		//assertEquals(actual.search(ASEval, data),ASEval.getClass().getName() + " is not a " + "Attribute evaluator!" );
	}
	
	//This function ranks attributes according to what values are in an array. 
	@Test
	public void rankedAttributesTest() throws Exception{
//		Ranker actual = new Ranker();
//		
//		String expected = "Search must be performed before a ranked "
//		        + "attribute list can be obtained";
//		assertEquals(expected, actual.rankedAttributes());
	}
	
	//This test just sets the variable to start. 
	//So we are testing if it does that. 
	@Test
	public void setStartSetTest() throws Exception{
		Ranker actual = new Ranker();
		actual.setStartSet("Start");
		String expected = "Start";
		assertEquals(expected, actual.getStartSet());
	}
	
	@Test
	public void generateRankingTipTextTest1(){
		Ranker actual = new Ranker();
		
		String expected = "A constant option. Ranker is only capable of generating "
			      + " attribute rankings.";
		assertEquals(expected, actual.generateRankingTipText());
	}
	
	@Test
	public void generateRankingTipTextTest2(){
		Ranker actual = new Ranker();
		
		String expected = "A constant option.";
		assertNotSame(expected, actual);
	}
}