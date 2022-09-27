package atividade16092022_.entities;

import java.util.ArrayList;
import java.util.List;

public class Proprietario extends Pessoa{
	private Pessoa pai;
	private Pessoa mae;
	private List<Carro> listaCarros = new ArrayList<>();
	
	public Proprietario(String nome, String sobrenome, String cpf, Pessoa pai, Pessoa mae) {
		super(nome, sobrenome, cpf);
		this.pai = pai;
		this.mae = mae;
	}
	
	public Pessoa getPai() {
		return pai;
	}
	
	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	public Pessoa getMae() {
		return mae;
	}
	
	public void setMae(Pessoa mae) {
		this.mae = mae;
	}
	
	public void comprarCarro(Carro carro) {
		System.out.println(this.getNome() + " acaba de comprar um " + carro.getFabricante() + " " + carro.getModelo() + " " + carro.getAnoFabricacao());
		if(carro.getProprietario()==null) {
			listaCarros.add(carro);
			carro.setProprietario(this);
		}
		return;
	}
	
	/*Método privado, pois so o metodo transfereCarroNovoProprietario() pode chamar este.
	 * Todo carro precisa de um proprietário cadastrado e o método transfereCarroNovoProprietario() realiza esta transferencia.
	 */
	private void venderCarro(Carro carro) {
		if(listaCarros.contains(carro)) {
			listaCarros.remove(carro);
		}
		return;
	}
	
	public void transfereCarroNovoProprietario(Carro carro, Proprietario novoProprietario) {
		if(this.listaCarros.contains(carro)) {
			this.venderCarro(carro);
			novoProprietario.listaCarros.add(carro);
			carro.setProprietario(novoProprietario);
		}
		return;
	}
	
	public void dirigiuOCarro(Carro carro) {
		carro.adicionarQuemJaDirigiuOCarro(this);
	}
	
	public void exibeListaDeCarros() {
		System.out.println();
		System.out.println("Automoveis cadastrados no nome de " + this.getNome() + " " + this.getSobrenome() + ":");
		for (Carro carro : listaCarros) {
			System.out.println(carro);
		}
	}
	
	@Override
	public String toString() {
		return "Nome: "
				+ this.getNome() + " " + this.getSobrenome()
				+ "	|	CPF: "
				+ this.getCpf()
				+ "	|	Nome do pai: "
				+ this.pai.getNome() + " " + this.pai.getSobrenome()
				+ "	|	Nome da mae: "
				+ this.mae.getNome() + " " + this.mae.getSobrenome();
	}
}
