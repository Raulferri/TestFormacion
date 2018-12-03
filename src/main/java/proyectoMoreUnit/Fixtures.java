package proyectoMoreUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Fixtures 
{
	@Before
	public void setUp()
	{
		System.out.println("Antes de cada test\n");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Despues de cada test\n");
	}
	
	@BeforeClass
	public static void setUpClass()
	{
		System.out.println("Al cargar la clase, antes de todos los test - Abrir BBDD\n");
	}
	
	@AfterClass
	public static void tearDownClass()
	{
		System.out.println("Al finalizar todos los test - Cerrar BBDD\n");
	}
	
	@Test
	public void primerTest()
	{
		System.out.println("Primer Test");
	}
	
	@Test
	public void segundoTest()
	{
		System.out.println("Segundo Test");
	}
	
	@Test
	public void tercerTest()
	{
		System.out.println("Tercer Test");
	}
	
}
