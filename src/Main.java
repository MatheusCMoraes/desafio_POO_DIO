import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Bootcamp bootcamp = new Bootcamp();
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrção curso Java");
		curso1.setCargaHoraria(50);
		
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição curso js");
		curso2.setCargaHoraria(50);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		
		bootcamp.setNome("Bootcamp Java Developer  ");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos());
		System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("Conteudos Concluidos Joao" + devJoao.getConteudosConcluidos());
		System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("XP: " + devJoao.calcularTotalXp());
		
		
		
		
		
	}

}
