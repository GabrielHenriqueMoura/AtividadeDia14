package Pacote;

public class Professor extends Pessoa {
	private int siape;
	private String AreaConcurso;
	private String nome;
	private String dataNascimento;
	public int getSiape() {
		return siape;
	}
	public void setSiape(int siape) {
		this.siape = siape;
	}
	public String getAreaConcurso() {
		return AreaConcurso;
	}
	public void setAreaConcurso(String areaConcurso) {
		AreaConcurso = areaConcurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	

}
