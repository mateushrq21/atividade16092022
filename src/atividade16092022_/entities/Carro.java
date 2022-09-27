package atividade16092022_.entities;

import java.util.ArrayList;
import java.util.List;

public class Carro {
	
	private String fabricante;
	private String modelo;
	private String placa;
	private String anoFabricacao;
	private Proprietario atualProprietario;
	private List<Proprietario> listaDirigiuOCarro = new ArrayList<>();

	public Carro(String fabricante, String modelo, String placa, String anoFabricacao) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Proprietario getProprietario() {
		return atualProprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.atualProprietario = proprietario;
	}
	
	protected void adicionarQuemJaDirigiuOCarro(Proprietario motorista) {
		listaDirigiuOCarro.add(motorista);
	}
	
	public void listaQuemJaDirigiuOCarro() {
		System.out.println();
		if(listaDirigiuOCarro.size()==0) {
			System.out.println("Ninguem dirigiu o " + this.fabricante + " " + this.modelo);
			return;
		}
		System.out.println("Abaixo a lista de pessoas que já dirigiram o " + this.fabricante + " " + this.modelo);
		for (Proprietario proprietario : listaDirigiuOCarro) {
			System.out.println(proprietario.getNome() + " " + proprietario.getSobrenome());
		}
	}
	
	@Override
	public String toString() {
		return this.fabricante
				+ " "
				+ this.modelo
				+ " "
				+ this.anoFabricacao
				+ "	|	Placa: "
				+ this.placa;
	}

	
}
