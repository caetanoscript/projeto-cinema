package util;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
	Sessao sessao;

	List<Filme> listaDeFilmes = new ArrayList<>();
	List<Sessao> listaDeSessoes = new ArrayList<>();

	public void adiconarFilme(Filme filme) {
		listaDeFilmes.add(filme);
	}

	public void criarSessao(Sessao sessao) {
		listaDeSessoes.add(sessao);
	}

	public void exibirsessoes() {
		for(Sessao s : listaDeSessoes) {
			System.out.println(s);
		}
	}
	
	public void exibirFilmes() {
		for(Filme f : listaDeFilmes) {
			System.out.println(f);
		}
	}
	
	public Filme encontrarFilme(String nomeF) {
		for(Filme f: listaDeFilmes) {
			if (f.getTitulo().equalsIgnoreCase(nomeF)) {
	            return f;
	        }
		}
		return null;
	}

	public Sessao escolherSessao(String horario) {
		for(Sessao s: listaDeSessoes) {
			if (s.getHorario().equals(horario)) {
	            return s;
	        }
		}
		return null;
	}
	
	
}
