package l1;

public class Q1 {

	public static void main(String[] args) {
		System.out.println("oi");
		
		Arquivo arquivo = new Arquivo("saida.csv");
		
		int[] vertices = new int[200];
		
		for (int i = 0; i < vertices.length; i++) {
			
			arquivo.escrever(""+i+ "\n");
			
		}
		
		arquivo.fechar();

	}

}
