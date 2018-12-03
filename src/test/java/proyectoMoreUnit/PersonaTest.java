//En sopra siempre se utiliza el patron given when then, el cual se pone en preferencias de moreunit
package proyectoMoreUnit;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class PersonaTest 
{
	private Persona persona;
	
	@Before
	public void setUp() throws Exception 
	{
		persona = new Persona("Juan", "Goldaracena");
	}

	@Test
	public void testGetNombre() throws Exception 
	{
		//given

		//when

		//then
		Assert.assertTrue(persona.getNombre().equals("Juan"));//Assert se utiliza para comprobar que funciona el metodo
	}
}
