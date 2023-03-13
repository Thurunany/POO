import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exercicio01 {
	 /* 
	 Faça um programa que peça ao usuário 10 números e mostre posteriormente
	 quantos são pares e a soma deles, bem como quantos são ímpares e a soma deles.
	 */
	
	public static void main(String[] args) {
		
    ArrayList<Integer> lista = new ArrayList<>();
	int par = 0, impar = 0, qntpar = 0, qntimpar = 0;
    
    for(int i = 0; i < 10; i++) {
    	lista.add(Integer.parseInt(JOptionPane.showInputDialog("Quais são seus valores?")));
    }
    
    for(int i : lista) {
    	if(lista.get(i) % 2 == 0) {
    	par += i;
    	qntpar++;
    	}
    	else {
    		impar += i;
    		qntimpar++;
    	}
    }
	JOptionPane.showMessageDialog(null, "Soma Par: "+ par + " Quantidade Par: "+ qntpar + "  Soma Impar: "+ impar+  "  Quantidade ImPar: "+ qntimpar);
}
}