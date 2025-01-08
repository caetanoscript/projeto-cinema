package util;

import java.util.ArrayList;
import java.util.List;

public class Sessao {

	private Filme filme;
	private String horario;
	private Integer totalAssentos;
	private List<Integer> assentosreservados;

	public Sessao(Filme filme, String horario, Integer totalAssentos) {
		this.filme = filme;
		this.horario = horario;
		this.totalAssentos = totalAssentos;
		this.assentosreservados = new ArrayList<>();
	}

	public Sessao() {

		this.assentosreservados = new ArrayList<>();
	}

	public Filme getFilme() {
		return filme;
	}

	public String getHorario() {
		return horario;
	}

	public Integer getTotalAssentos() {
		return totalAssentos;
	}

	public List<Integer> getAssentosreservados() {
		return assentosreservados;
	}

	public void reservarAssento(int numero) {
		if (numero <= totalAssentos) {
			if (assentosreservados.contains(numero)) {
				System.out.println("esse assento ja esta reservado: ");
			} else {
				assentosreservados.add(numero);

			}
		} else {
			System.out.println("esse assento não está disponivel nessa sessão");
		}

	}

	public void cancelarAssento(int numero) {
		if (assentosreservados.contains(numero)) {
			assentosreservados.remove(numero);
		} else {
			System.out.println("esse assento não esta reservado: ");
		}
	}

	public String assentosOcupados() {
	    if (assentosreservados.isEmpty()) {
	        return "Nenhum assento reservado.";
	    }
	    return assentosreservados.toString();
	}

	@Override
	public String toString() {
		return "Sessao filme:" + filme + ", horario:" + horario + ", totalAssentos:" + totalAssentos
				+ ", assentosreservados:" + assentosOcupados();
	}

}
