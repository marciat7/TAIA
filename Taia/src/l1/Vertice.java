package l1;

import java.util.Vector;

public class Vertice {
	
	int id, grau;
	Vector<Aresta> arestas;
	
	
	
	public Vertice(int id) {
		this.id = id;
		arestas = new Vector<Aresta>();
		this.grau = 1;
	}
	

	public void addAresta(Aresta a) {
		arestas.add(a);
	}
	
	public void addGrau() {
		this.grau++;
	}
	

}
