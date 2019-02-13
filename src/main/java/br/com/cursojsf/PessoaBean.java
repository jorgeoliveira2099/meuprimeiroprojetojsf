package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

import com.sun.faces.taglib.html_basic.CommandButtonTag;


@ViewScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {

	private String nome;
	
	private List<String> listNomes = new ArrayList<String>();
	private HtmlCommandButton commandButton;
	
	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}

	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}

	public List<String> getListNomes() {
		return listNomes;
	}
	
	public void setListNomes(List<String> listNomes) {
		this.listNomes = listNomes;
	}
	
	public String addNome() {
		listNomes.add(this.nome);
		
		if (listNomes.size() > 3) {
			commandButton.setDisabled(true);
			return "paginanavegada?faces-redirect=true";
		}
		
		return ""; 
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
