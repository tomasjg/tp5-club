package ar.edu.unlam.tp5;
import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

import ar.edu.unlam.tp5.Bar;
import ar.edu.unlam.tp5.Cliente;

public class TestBar {

	@Test
	public void testAgregarClientesABar(){
		Bar bar = new Bar();
		bar.agregarCliente(new Cliente("Pedro", 25));
		bar.agregarCliente(new Cliente("Carlos", 20));
		bar.agregarCliente(new Cliente("Lara", 24));
		assertEquals(3, bar.getClientes().size(),0.01);
	}
	
	@Test
	public void testAgregarClientesConElMismoNombreABar(){
		Bar bar = new Bar();
		bar.agregarCliente(new Cliente("Pedro", 25));
		bar.agregarCliente(new Cliente("Pedro", 20));	//Se repite el nombre, se sobreescribe
		bar.agregarCliente(new Cliente("Lara", 24));
		assertEquals(2, bar.getClientes().size(),0.01);
	}
	
	@Test
	public void testPresentarClientesOrdenadosAlfabeticamente(){
		Bar bar = new Bar();
		bar.agregarCliente(new Cliente("Pedro", 25));	//Pedro debería ser el tercero
		bar.agregarCliente(new Cliente("Carlos", 20));	//Carlos debería ser el primero
		bar.agregarCliente(new Cliente("Lara", 24));	//Lara debería ser segunda
		assertEquals("Carlos", bar.getClientes().first().getNombre());
		assertEquals("Pedro", bar.getClientes().last().getNombre());
	}
	
	@Test
	public void testCompararClientesIguales(){
		Cliente clienteA = new Cliente("Pedro", 25);	
		Cliente clienteB = new Cliente("Pedro", 25);
		assertEquals(0,clienteA.compareTo(clienteB));
	}
	
	@Test
	public void testCompararClientesDiferentes(){
		Cliente clienteA = new Cliente("Pedro", 25);	
		Cliente clienteB = new Cliente("Carlos", 20);
		assertNotEquals(0,clienteA.compareTo(clienteB));
	}
	
	@Test
	public void testPresentarClientesOrdenadosPorEdad(){		
		ComparadorPorEdad comparadorNuevo = new ComparadorPorEdad();
		Bar bar = new Bar();
		
		bar.agregarCliente(new Cliente("Pedro", 25));	//Pedro debería ser el tercero
		bar.agregarCliente(new Cliente("Carlos", 20));	//Carlos debería ser el primero
		bar.agregarCliente(new Cliente("Lara", 24));	//Lara debería ser segunda
		
		TreeSet <Cliente> clientesOrdenandosPorEdad = new TreeSet <Cliente>(comparadorNuevo);
		clientesOrdenandosPorEdad.addAll(bar.getClientes());
		bar.setClientes(clientesOrdenandosPorEdad);
		
		assertEquals("Carlos", bar.getClientes().first().getNombre());
		assertEquals("Pedro", bar.getClientes().last().getNombre());
	}
	
}
