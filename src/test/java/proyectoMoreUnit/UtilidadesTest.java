package proyectoMoreUnit;

import org.junit.Test;

import org.junit.Assert;

public class UtilidadesTest 
{
	@Test
	public void testConcatenar()
	{
		//instanciar  la clase a probar
		Utilidades utilidades = new Utilidades();
		
		//Ejecutar el metodo a probar
		String resultado = utilidades.concatenar("Hola", "Sopra");
		
		//validaciones
		Assert.assertEquals("Las cadenas son diferentes", "Hola Sopra", resultado);
	}
	
	@Test
	public void testConcatenarFallo()
	{
		//instanciar  la clase a probar
		Utilidades utilidades = new Utilidades();
		
		//Ejecutar el metodo a probar
		String resultado = utilidades.concatenar("Hola", "Sopra");
		
		//validaciones
		Assert.assertEquals("Las cadenas son diferentes", "HolaSopra", resultado);
	}
	
	@Test
	public void testConcatenarError()
	{
		//instanciar  la clase a probar
		Utilidades utilidades = new Utilidades();
		
		//Ejecutar el metodo a probar
		String resultado = utilidades.concatenar(null, "Sopra");
		
		//validaciones
		Assert.assertEquals("Las cadenas son diferentes", "Hola Sopra", resultado);
	}
}
