package ar.edu.unlam.tp5;

import java.util.*;

public class Bar {
	private TreeSet <Cliente> clientes;

	public Bar() {
		clientes = new TreeSet <Cliente>();
	}
	
	public TreeSet<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(TreeSet<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void agregarCliente(Cliente cliente){
		if(cliente != null){
			clientes.add(cliente);
		}
	}
}
