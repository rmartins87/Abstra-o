import javax.swing.JOptionPane;

public class Teste {;
	public static void main(String[] args) {
		String z;
		int x;
		ClinicaMed c1 = new ClinicaMed();

		c1.setNmMedico("Carlos",0);
		c1.setBairro("Macuco",0);
		c1.setNumReg(123456,0);
		c1.setNmMedico("Ana",1);
		c1.setBairro("Boqueirão",1);
		c1.setNumReg(123456,1);
		c1.setNmMedico("Lucia",2);
		c1.setBairro("Embaré",2);
		c1.setNumReg(123456,2);
		c1.setNmMedico("João",3);
		c1.setBairro("Gonzaga",3);
		c1.setNumReg(123456,3);
		
		z = JOptionPane.showInputDialog("Digite o numero da especialidade: \n1-Ortopedia \n2-Oftalmologia \n3-Pediatria \n4-Dermatologista");
		x = Integer.parseInt(z);

		JOptionPane.showMessageDialog(null, c1.mostraMedicos(x), "", JOptionPane.PLAIN_MESSAGE);
		
	}

}
 