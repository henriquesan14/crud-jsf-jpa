package br.com.appfilme.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.appfilme.dao.FilmeDaoImpl;
import br.com.appfilme.models.Filme;

@ManagedBean
public class FilmeBean {

	private FilmeDaoImpl filmeDao = new FilmeDaoImpl();
	private Filme filme;
	private List<Filme> filmes;
	
	@PostConstruct
	public void init() {
		filme = new Filme();
		getAll();
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	public void selecionaFilme(Filme filme) {
		this.filme = filme;
	}

	public void getAll(){
		this.filmes = filmeDao.getAll();
	}
	
	public void salvar() {
		filmeDao.save(this.filme);
		filme = new Filme();
		getAll();
	}
	
	public void excluir(Long id) {
		filmeDao.remove(id);
		getAll();
	}
	
	public void reset() {
		System.out.println("reset");
		this.filme = new Filme();
	}
	
}
