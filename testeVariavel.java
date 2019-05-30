import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteAula {

	public static void main(String[] args) {
             byte opcao = 0;	   
			 double salario = 0;
			JOptionPane entrada = new JOptionPane();
			try {
			 opcao = Byte.parseByte(entrada.showInputDialog("Informe a sua opção: "
					+ "\n 1 - Comversão implicita"
					+ "\n 2 - Comversão explicita"
					+ "\n 3 - Comversão de Estouro"
		            + "\n 4 - Comversão divisão"
					+ "\n 5 - Nome sobrenome"
					+ "\n 6 - Nome sabrenome com (split)"
					+ "\n 7 - Promocao int"
					+ "\n 8 - Promocao Short"
					+"\n  9 - Calculo IR"));
			 
			 switch (opcao) {
				case 1: conversaoImplicita();
				break; 
				case 2: conversaoExplicita();
				break;
				case 3: estouroDireto();
				break;
				case 4: divisao();
				break;
				case 5: nomeSobrenome();
				break;
				case 6: nomeSobrenomeSplit();
				break;
				case 7: PromocaoInt();
				break;
				case 8: PromocaoShort();
				break;
				case 9: CalculoIR();
				break;
				default: Mensagem("Valor digitado precisa estar entre 1 e 9!!");
					//(outra forma)System.out.println("Valor digitado precisa estar entre 1 e 4!!");
				break;
				}
			 
			
		}
			catch(NumberFormatException erro){
				Mensagem("Erro de processamento");
			}
			catch(Exception erro) {
				Mensagem("Entrada invalida");
			}
			
			
			
		}
	    //metodo para substituir a entrada do nome
	    private static String EntradaDados(String nome) {
	    	
	    	return JOptionPane.showInputDialog("Informe o nome: ");
	    	
	    }
	   
		private static void nomeSobrenomeSplit() {
			String nome = EntradaDados (null);
	        	        
	        String nomeDividido[] = nome.split(" ");
	        int indiceSobrenome = nomeDividido.length-1;
	        
	        Mensagem(nomeDividido[0]+"."+ nomeDividido[indiceSobrenome]);
		}
			
		
		private static void nomeSobrenome() {

        String nome = EntradaDados (null);
        int posicaoNomeFinal = nome.indexOf(' ');
        int ultimoNome = nome.lastIndexOf(' ')+1;
        
        Mensagem(nome.substring(0,posicaoNomeFinal)
         + "." + nome.substring(ultimoNome));
		
	}
		public static void conversaoImplicita() {
			byte num1 = 10;
			short num2 = num1;
			Mensagem("num2: " + num2);
		}
		public static void conversaoExplicita() {
			short num2 = 20;
			byte num1 = (byte)num2;
			Mensagem("num1: " + num1);
		}
		
		public static void estouroDireto() {
			short num1 = (byte) 126;
		    Mensagem("Num1: " + num1);
		}
		public static void divisao() {
			double num1 = 5.0 / 2;
			Mensagem("num1: " + num1);
		}
		//metodo que substitui os comandos de mensagem
		public static void Mensagem(String texto) {
			JOptionPane.showMessageDialog(null, texto);
		}
		public static void PromocaoInt() {
			int num1 = 55555;
			long num2 = 66666;
			long num3;
			num3 = num1 * num2;
			Mensagem("num3: " + num3);
			Mensagem(String.valueOf(num3));
			//showMessageDialog object tambem funciona 
		}
		public static void PromocaoShort() {
			/*todas as operacoes onde os numeros 
			sao tamanho byte ou short o java converte para inteiro*/
		   short a, b;
		   int c;
		   a= 10;
		   b= 20;
		   
		   c= a + b;
		   
		   Mensagem("c = " + c);
			
		}
	  static void CalculoIR () {
		JOptionPane entrada = new JOptionPane();
		double salario = Double.parseDouble(entrada.showInputDialog("Digite seu salario"));
		if (salario < 1000) {Mensagem("Valor 0");}
		if (salario < 2000) {Mensagem ("Valor"+(salario * 0.05));}
		if (salario < 3000) {Mensagem("valor"+(salario * 0.1));}

			
			}
	}


