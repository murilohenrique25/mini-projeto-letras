import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("==== Digite um texto ====");
			String entrada = scanner.nextLine();
			String[] textoDividido = entrada.split(" ");
			String textoFinal = new String();
			String textoCortado = new String();
			for (int i = 0; i < textoDividido.length; i++) {
				String valorObtido = textoDividido[i];
				String valorObtidoParaVerificao = textoDividido[0];
				
				int tamanhoValor = valorObtido.length();

				
				if(textoDividido.length > 1 && valorObtidoParaVerificao.length() > 1) {
					
					
					if(tamanhoValor > 1 && tamanhoValor % 2 != 0) {
						
						tamanhoValor = tamanhoValor / 2;
						textoCortado = valorObtido.substring(0,tamanhoValor + 1);
						//System.out.println(valorObtido.substring(0,tamanhoValor + 1));
						textoFinal += textoCortado + " ";
					} else {
						
						tamanhoValor = tamanhoValor / 2;
						textoCortado = valorObtido.substring(0,tamanhoValor);
						//System.out.println(valorObtido.substring(0,tamanhoValor));
						
						textoFinal += textoCortado + " ";
					}
				} else if(textoDividido.length > 1 && valorObtidoParaVerificao.length() == 1) {
					
					textoFinal = entrada;
					
				} else {
					tamanhoValor = tamanhoValor / 2;
					//System.out.println(valorObtido.substring(0,tamanhoValor + 1));
					textoFinal = valorObtido.substring(0,tamanhoValor + 1);
				}
				
			}
			String valorSemEspacoFinal = textoFinal.trim();
			valorSemEspacoFinal +=".";
			System.out.println(valorSemEspacoFinal);
		}
		
	}
}





