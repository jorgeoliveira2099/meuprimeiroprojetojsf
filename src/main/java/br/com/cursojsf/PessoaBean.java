package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ViewScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {

	private String nome;
	
	private List<String> listNomes = new ArrayList<String>();
	
	public List<String> getListNomes() {
		return listNomes;
	}
	
	public void setListNomes(List<String> listNomes) {
		this.listNomes = listNomes;
	}
	
	public String addNome() {
		listNomes.add(this.nome);
		return ""; 
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
