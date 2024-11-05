import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Bootcamp de java
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        //Bootcamp de desenvolvimento WEB
        Curso curso3 = new Curso();
        curso3.setTitulo("curso HTML");
        curso3.setDescricao("descrição curso  de HTML");
        curso3.setCargaHoraria(5);

        Curso curso4 = new Curso();
        curso4.setTitulo("curso PHP");
        curso4.setDescricao("descrição curso PHP");
        curso4.setCargaHoraria(9);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de desenvolvimento WEB");
        mentoria2.setDescricao("descrição mentoria de desenvolvimento WEB");
        mentoria2.setData(LocalDate.now());

        //Bootcamp de C
        Curso curso5 = new Curso();
        curso5.setTitulo("curso introdução ao C");
        curso5.setDescricao("descrição curso de introducão ao C");
        curso5.setCargaHoraria(2);

        Curso curso6 = new Curso();
        curso6.setTitulo("curso C intermediário");
        curso6.setDescricao("descrição curso C intermediário");
        curso6.setCargaHoraria(4);

        Curso curso7 = new Curso();
        curso7.setTitulo("curso C avançado");
        curso7.setDescricao("descrição curso  C avançado");
        curso7.setCargaHoraria(8);

        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("mentoria de C");
        mentoria3.setDescricao("descrição mentoria C");
        mentoria3.setData(LocalDate.now());
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp HTML Developer");
        bootcamp2.setDescricao("Descrição Bootcamp WEB Developer");
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(curso4);
        bootcamp2.getConteudos().add(mentoria2);

        Bootcamp bootcamp3 = new Bootcamp();
        bootcamp3.setNome("Bootcamp C Developer");
        bootcamp3.setDescricao("Descrição Bootcamp C Developer");
        bootcamp3.getConteudos().add(curso5);
        bootcamp3.getConteudos().add(curso6);
        bootcamp3.getConteudos().add(curso7);
        bootcamp3.getConteudos().add(mentoria3);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.inscreverBootcamp(bootcamp2);
        
        System.out.println("======= Dados do Desenvolvedor Camila =======");
        System.out.println("Conteúdos Inscritos:");
        devCamila.getConteudosInscritos().forEach(conteudo -> System.out.println(" - " + conteudo.getTitulo()));
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("\nApós Progredir:");
        System.out.println("Conteúdos Inscritos:");
        devCamila.getConteudosInscritos().forEach(conteudo -> System.out.println(" - " + conteudo.getTitulo()));
        System.out.println("Conteúdos Concluídos:");
        devCamila.getConteudosConcluidos().forEach(conteudo -> System.out.println(" - " + conteudo.getTitulo()));
        System.out.println("XP Total: " + devCamila.calcularTotalXp());
        
        System.out.println("\n===========================================\n");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.inscreverBootcamp(bootcamp3);
        
        System.out.println("======= Dados do Desenvolvedor João =======");
        System.out.println("Conteúdos Inscritos:");
        devJoao.getConteudosInscritos().forEach(conteudo -> System.out.println(" - " + conteudo.getTitulo()));
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("\nApós Progredir:");
        System.out.println("Conteúdos Inscritos:");
        devJoao.getConteudosInscritos().forEach(conteudo -> System.out.println(" - " + conteudo.getTitulo()));
        System.out.println("Conteúdos Concluídos:");
        devJoao.getConteudosConcluidos().forEach(conteudo -> System.out.println(" - " + conteudo.getTitulo()));
        System.out.println("XP Total: " + devJoao.calcularTotalXp());
        
        System.out.println("\n===========================================\n");
    }
}