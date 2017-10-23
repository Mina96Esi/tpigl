package test;
import main.TaillesdiffException;
import main.VectorHelper;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
public class VectorHelperTest {

	@Test
	public void testTrier() {

		int tab1[]={8,5,3};
		int expectedres[]={3,5,8};
		int res[]=VectorHelper.trier(tab1);
		VectorHelper.trier(tab1);	
		Assert.assertArrayEquals(expectedres, res);
		
	}

	@Test
	public void testSommer()  {
		int tab1[]={2,5,8};
		int tab2[]={9,10,11};
		int expectedres[]={11,15,19};
		int res[] = null;
		try {
			res = VectorHelper.sommer(tab1, tab2);
			Assert.assertArrayEquals(expectedres, res);
		} catch (TaillesdiffException e) {
			fail("tailles de tableaux sont diffrentes");
		}		
	}

	@Test
	public void testInverser() {
		
		int tab[]={2,5,8};
		int expectedres[]={8,5,2};
		int res[]=VectorHelper.inverser(tab);
		Assert.assertArrayEquals(expectedres, res);
	}

	@Test
	public void testMinmax() {
		int tab[]={2,5,9,10,15};
		int expectedres[]={2,15};
		int res[]=VectorHelper.minmax(tab);
		Assert.assertArrayEquals(expectedres, res);
	}

	@Test
	public void testMul10() {
		int tab[]={2,5,8};
		int expectedres[]={20,50,80};
		int res[]=VectorHelper.mul10(tab);
		Assert.assertArrayEquals(expectedres, res);
	}

}
