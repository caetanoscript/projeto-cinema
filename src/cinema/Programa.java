package cinema;

import java.util.Locale;
import java.util.Scanner;

import util.Cinema;
import util.Filme;
import util.Sessao;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cinema cinema = new Cinema();
		int escolha = 0;

		cinema.adiconarFilme(new Filme("senhor dos aneis", "magia", 3));
		cinema.adiconarFilme(new Filme("007", "ação", 1));
		cinema.adiconarFilme(new Filme("click", "comedia", 2));
		
		while (escolha != 6) {

			System.out.println("o que você deseja fazer:\n "
					+ "1.cadastrar filme:\n "
					+ "2.cadastrar sessao:\n "
					+ "3.reservar ou cancelar assento:\n "
					+ "4.gerar relatorios:\n "
					+ "5.assentos reservados:\n "
					+ "6.sair.");
			escolha = sc.nextInt();
			sc.nextLine();
			
			switch(escolha) {
			case 1:
				System.out.println("qual o nome do filme:");
				String nome = sc.nextLine();
				System.out.println("qual o genero do filme:");
				String genero = sc.nextLine();
				System.out.println("qual a duração:");
				Integer duracao = sc.nextInt();
				sc.nextLine();
				cinema.adiconarFilme(new Filme(nome, genero, duracao));
				
				break;
			case 2:
				System.out.println("qual nome do filme da sessão: ");
				String nomeF = sc.nextLine();
				System.out.println("qual horario da sessão: ");
				String horario = sc.nextLine();
				System.out.println("qual a quantidade de assentos: ");
				Integer assentos = sc.nextInt();
				Filme filmeESco = cinema.encontrarFilme(nomeF);
				sc.nextLine();
				cinema.criarSessao(new Sessao(filmeESco, horario, assentos));
				break;
			case 3:
				System.out.println("o que você deseja fazer:\n "
						+ "1.reservar assento:\n "
						+ "2.remover reserva:\n "
						+ "3.sair");
				int escolha2 = sc.nextInt();
				sc.nextLine();
				
				switch(escolha2) {
				case 1:
					System.out.println("qual numero do assento deseja reservar: ");
					Integer numeroAc = sc.nextInt();
					sc.nextLine();
					System.out.println("qual horario da sessão: ");
					String horarioSe = sc.nextLine();
					Sessao sessaoEscolhida = cinema.escolherSessao(horarioSe);
					
					sessaoEscolhida.reservarAssento(numeroAc);
					
					break;
				case 2:
					System.out.println("qual numero do assento deseja reservar: ");
					numeroAc = sc.nextInt();
					sc.nextLine();
					System.out.println("qual horario da sessão: ");
					horarioSe = sc.nextLine();
					sessaoEscolhida = cinema.escolherSessao(horarioSe);
					
					sessaoEscolhida.cancelarAssento(numeroAc);;
					break;
				case 3:
					System.out.println("finalizando..");
					break;
				
				}
				break;
			case 4:
				cinema.exibirsessoes();
				cinema.exibirFilmes();
				break;
			case 5:
				System.out.println("qual horario da sessao: ");
				String horarioSe = sc.nextLine();
				Sessao sessaoEscolhida = cinema.escolherSessao(horarioSe);
				if(sessaoEscolhida == null) {
					System.out.println("essa seçao não existe");
				}
				sessaoEscolhida.assentosOcupados();
				break;
			case 6:
				System.out.println("saindo...");
				break;
				
			}
			
			
		}

	}
}
