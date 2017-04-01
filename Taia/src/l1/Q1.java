package l1;

import java.util.Vector;

public class Q1 {

	public static void main(String[] args) {
		
		Arquivo arquivo = new Arquivo("saida.csv");
		Arquivo arquivo2 = new Arquivo("sem escala.csv");
	
		Vector<Aresta> arestas = new Vector<Aresta>();
		Vector<Aresta> arestas2 = new Vector<Aresta>();
		Vertice[] vertices = new Vertice[200];
		
		for (int i = 0; i < vertices.length; i++) {
			vertices[i] = new Vertice(i);
			int tgt = (int) (Math.random() * i);
			int tgt2 = (int) (Math.random() * i);
			if (Math.random() * vertices[tgt].grau > 0.5) {
				arestas2.add(new Aresta(i, tgt));
			}
			if (Math.random() * vertices[tgt2].grau > 0.5) {
				arestas2.add(new Aresta(i, tgt2));
			}
		}
		arquivo2.escrever("Source;Target;Type");
		for (int i = 0; i < arestas2.size(); i++) {
			System.out.println(arestas2.size());
			arquivo2.escrever("\n"+ arestas2.get(i).v1+";" + arestas2.get(i).v2 + ";undirected");
			
		}
		/*
		for (int i = 0; i < 200; i++) {
			arestas.add(new Aresta((int)(Math.random()*200),(int)(Math.random()*200)));
		}
		
		
		arquivo.escrever("Source;Target;Type");
		for (int i = 0; i < arestas.size(); i++) {
			arquivo.escrever("\n"+ arestas.get(i).v1+";" + arestas.get(i).v2 + ";undirected");			
			
			
		}	
		
		*/
		
		arquivo.fechar();
		arquivo2.fechar();

	}

}
