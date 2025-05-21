import java.time.LocalDate;
import java.util.List;

public class Aluno {
	private String cpf,nome, sexo;
	private int matricula;
	private LocalDate dataNasciemnto;
	private Endereco endereco; // objeto da classe enderenco
	private List<Contato> contato;

	//Construtor
	//construtor vazio pq esta´usando método setters
	public Aluno (){

	}

	public Aluno(String cpf, String nome, String sexo, int matricula, LocalDate dataNasciemnto, Endereco endereco,
			List<Contato> contato) {
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.matricula = matricula;
		this.dataNasciemnto = dataNasciemnto;
		this.endereco = endereco;
		this.contato = contato;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public LocalDate getDataNasciemnto() {
		return dataNasciemnto;
	}

	public void setDataNasciemnto(LocalDate dataNasciemnto) {
		this.dataNasciemnto = dataNasciemnto;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Contato> getContato() {
		return contato;
	}

	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}

	

	
	
	
}
