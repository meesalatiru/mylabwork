/**
 *
 */
package net.sf.ejcrm.business;

import net.sf.ejcrm.business.EjcrmService;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ricardo
 *
 */
public class EjcrmServiceTest {

	private static ApplicationContext applicationContext;
	private EjcrmService ejcrmService;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(
				"net/sf/ejcrm/business/public.xml");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ejcrmService = (EjcrmService) applicationContext
				.getBean("ejcrmService");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("Test Done");
	}

	/**
	 * Test method for
	 * {@link net.sf.ejcrm.business.EjcrmServiceImpl#getLicense()}.
	 */
	@Test
	public void testGetLicense() {
		System.out.println("testGetLicense start...->"
				+ ejcrmService.getLicense());
		ejcrmService.getLicense().equals("GPL");
		if (!ejcrmService.getLicense().equals("GPL"))
			throw new RuntimeException("Test Failed");
		System.out.println("getLicense Success");
	}

	/**
	 * Test method for
	 * {@link net.sf.ejcrm.business.EjcrmServiceImpl#getVersion()}.
	 */
	@Test
	public void testGetVersion() {
		System.out.println("testGetVersion start...->"
				+ ejcrmService.getVersion());
		if (!ejcrmService.getVersion().equals("1.0"))
			throw new RuntimeException("Test Failed");
		System.out.println("testGetVersion Success");
	}
}
