package br.com.appfilme.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.appfilme.dao.FilmeDao;
import br.com.appfilme.models.Filme;

@ManagedBean
public class FilmeBean {

	private FilmeDao filmeDao = new FilmeDao();
	private Filme filme;
	private List<Filme> filmes;
	
	@PostConstruct
	public void init() {
		filme = new Filme();
		this.filmes = filmeDao.getAll();
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

	public void getAll(){
		this.filmes = filmeDao.getAll();
	}
	
	public void salvar() {
		filmeDao.save(this.filme);
	}
	
	
	public void excluir(Long id) {
		filmeDao.remove(id);
	}
	
}
