public class ClinicaMed {
	private String[] nmMedico;
	private String[] bairro;
	private int[] numReg;
	
	public ClinicaMed(){
		nmMedico = new String[4];
		bairro = new String[4];
		numReg = new int[4];		
	}
	
	public String getNmMedico(int i) {
		return nmMedico[i];
	}
	public void setNmMedico(String nmMedico,int i) {
		this.nmMedico[i] = nmMedico;
	}
	public String getBairro(int i) {
		return bairro[i];
	}
	public void setBairro(String bairro, int i) {
		this.bairro[i] = bairro;
	}
	public int getNumReg(int i) {
		return numReg[i];
	}
	public void setNumReg(int numReg, int i) {
		this.numReg[i] = numReg;
	}
	
	public String mostraMedicos(int x) {
		switch(x) {
		case 1: 
			return "Seu médico é o Dr. " + getNmMedico(0) + " CRO = " + getNumReg(0) + ". Ele atende no bairro: " + getBairro(0);
		case 2:
			return "Seu médico é o Dr. " + getNmMedico(1) + " CRO = " + getNumReg(1) + ". Ele atende no bairro: " + getBairro(1);
		case 3:
			return "Seu médico é o Dr. " + getNmMedico(2) + " CRO = " + getNumReg(2) + ". Ele atende no bairro: " + getBairro(2);
		case 4:
			return "Seu médico é o Dr. " + getNmMedico(3) + " CRO = " + getNumReg(3) + ". Ele atende no bairro: " + getBairro(3);
		default:
			return "opção inválida!";
		}
	}

}
	
