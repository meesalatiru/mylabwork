/**
 *
 */
package net.sf.ejcrm.integration;

import static org.junit.Assert.fail;

import net.sf.ejcrm.integration.EjcrmDAO;

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
public class EjcrmDAOImplTest {

	private static ApplicationContext applicationContext;
	private EjcrmDAO ejcrmDAO;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(
				"net/sf/ejcrm/integration/public.xml");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ejcrmDAO = (EjcrmDAO) applicationContext
				.getBean("ejcrmDAO");
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
	 * {@link net.sf.ejcrm.integration.EjcrmDAOImpl#getLicense()}.
	 */
	@Test
	public void testGetLicense() {
		System.out.println("testGetLicense start...->"
				+ ejcrmDAO.getLicense());
		ejcrmDAO.getLicense().equals("GPL");
		if (!ejcrmDAO.getLicense().equals("GPL"))
			throw new RuntimeException("Test Failed");
			System.out.println("getLicense Success");
	}

	/**
	 * Test method for
	 * {@link net.sf.ejcrm.integration.EjcrmDAOImpl#getVersion()}.
	 */
	@Test
	public void testGetVersion() {
		System.out.println("testGetVersion start...->"
				+ ejcrmDAO.getVersion());
		if (!ejcrmDAO.getVersion().equals("1.0"))
			throw new RuntimeException("Test Failed");
		System.out.println("testGetVersion Success");
	}
}
