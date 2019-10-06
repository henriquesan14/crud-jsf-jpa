package br.com.appfilme.dao;

import java.util.List;

import br.com.appfilme.models.Filme;

public interface FilmeDao {
	List<Filme> getAll();
	void save(Filme filme);
	void remove(Long id);

}
