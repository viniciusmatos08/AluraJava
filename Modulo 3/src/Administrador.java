
public class Administrador extends Funcionario implements Autentificavel{
	
	private int senha;


	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

}
