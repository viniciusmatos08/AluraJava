
public class Gerente extends Funcionario implements Autentificavel{
	
	private int senha;
	
	public double getBonificacao() {
		return this.getSalario();
	}
	
	@Override
	public boolean autentica (int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
