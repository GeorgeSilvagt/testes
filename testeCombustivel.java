import javax.swing.JOptionPane;

aula pública Exercicio2_5 {

public static void main(String[] args) {
	JOptionPane entrada = new JOptionPane();
	opcao();
    
 }
public static void opcao() {
	 try {
		    int opcaoCombustivel = Integer.parseInt(JOptionPane.showInputDialog("informe o tipo de combustivel 1-gasolina , 2-alcool"));
		    int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a capacidade do tanque"));
		    switch(opcaoCombustivel) {
		    case 1: mensagem("Valor: R$"+ gasolina(capacidade));
		    break;
		    case 2:mensagem("Valor: R$"+alcool(capacidade));
		    break;
		    default: JOptionPane.showMessageDialog(null,"Somente 1 e 2!!!");
		    opcao();
		    	}
		      }catch(Exception erro) {
				mensagem("Entrada invalida.");
				opcao();
			}
	
}
public static double gasolina(int capacidade) {
	return capacidade * 1.80;
}
public static double alcool(int capacidade) {
	return capacidade * 1.00;
}
public static void mensagem(String texto) {
	JOptionPane.showMessageDialog(null,texto);
}
