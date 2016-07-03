package ar.edu.unlam.tp5;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Cliente> {
	
		@Override
		public int compare(Cliente cliente, Cliente cliente2) {
			return cliente.getEdad() - cliente2.getEdad();
		}
}
