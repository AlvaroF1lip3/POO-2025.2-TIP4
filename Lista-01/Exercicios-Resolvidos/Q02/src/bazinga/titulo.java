package bazinga;

import javax.swing.JOptionPane;

public class titulo {
	public static void main(String[] args){
		
		String nome;
		double media = 0;
		
		JOptionPane.showMessageDialog(null, "Aprendendo o scambal");
		
		nome = JOptionPane.showInputDialog("Digite sua Media: ");
				
		media = Double.parseDouble(JOptionPane.showInputDialog("Digite sua media: "));
		
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "- Media: " + media);
		
	}
}
