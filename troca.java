import javax.swing.JOptionPane;

public class Exercicio12 {
	public static void main(String[]args) {
		JOptionPane entrada = new JOptionPane();
		
		float A, B, C, D; 
			A=2;
			B=4;
			C= (A+B)*B;
			D=C*B/(A*A);
			A=D/(C+B);
			B=B+A;
		entrada.showMessageDialog(null,"A variavel A vale: "+A+"\nA variavel B vale: "+B+
		"\nA variavel C vale: "+C+
		"\nA variavel D vale: "+D);

	}

}
