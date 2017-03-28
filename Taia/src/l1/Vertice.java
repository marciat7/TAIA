package l1;

import java.util.Vector;

public class Vertice {
	
	int id;
	Vector<Integer> arestas;
	
	
	public Vertice(int id) {
		this.id = id;
		arestas = new Vector<Integer>();
	}
	

	public void addAresta(int id) {
		arestas.add(id);
	}
	

}
