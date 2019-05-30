import javax.swing.JOptionPane;

public class Exercicio11 {
 public static void main(String[]args) {
	 JOptionPane entrada = new JOptionPane();
    double larguraP = Double.parseDouble(entrada.showInputDialog("Digite a lagura da parede"));
    double larguraT = Double.parseDouble(entrada.showInputDialog("Digite a largura do tijolo"));
    double quantTijLarg = calculo(larguraP, larguraT); 
    
    double comprimentoP = Double.parseDouble(entrada.showInputDialog("Digite a comprimento da parede"));
    double comprimentoT = Double.parseDouble(entrada.showInputDialog("Digite a comprimento do tijolo"));
    double quantTijCompri = calculo(comprimentoP, comprimentoT);
    
    
    JOptionPane.showMessageDialog(null, "A quantida de tijolos necessaria e: "+mult(quantTijLarg, quantTijCompri));
 }
  static double calculo(double parede, double tijolo) {
	double result = parede / tijolo;
	return result;
 }
  static double mult (double larg, double compri) {
	 double result = larg * compri;
	 return result;
  }
}
	

