package exercicio1;

public class Exercicio1 {
	static int totalEleitores = 1000;
	static float percentual = 0;
	
	private static float percentualVotosValidos(){
		int votosValidos = 800;
		
		percentual = (float) votosValidos / totalEleitores;
		percentual *= 100;
		
		return percentual;
	}

	private static float percentualVotosBrancos(){
		int votosBrancos = 150;
		
		percentual = (float) votosBrancos / totalEleitores;
		percentual *= 100;
		
		return percentual;
	}
	
	private static float percentualVotosNulos(){
		int votosNulos = 50;
		
		percentual = (float) votosNulos / totalEleitores;
		percentual *= 100;
		
		return percentual;
	}
	
	public static void main(String[] args) {
		float percentualVotosValidos = 0;
		float percentualVotosBrancos = 0;
		float percentualVotosNulos = 0;
		
		percentualVotosValidos = percentualVotosValidos();
		percentualVotosBrancos = percentualVotosBrancos();
		percentualVotosNulos = percentualVotosNulos();

    	System.out.println("Percentual de votos válidos em relação ao total de eleitores: " + percentualVotosValidos + "%");
    	System.out.println("Percentual de votos em branco em relação ao total de eleitores: " + percentualVotosBrancos + "%");
    	System.out.println("Percentual de votos nulos em relação ao total de eleitores: " + percentualVotosNulos + "%");
    }

}