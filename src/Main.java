import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso  curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargahoraria(8);

        Curso  curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do Curso de JS");
        curso2.setCargahoraria(6);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentorai de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDecricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Fulano");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos do Fulano: " + dev1.getConteudosIncritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos do Fulano: " + dev1.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos do Fulano: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        System.out.println("------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Ciclano");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos do Ciclano: " + dev2.getConteudosIncritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos do Ciclano: " + dev2.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos do Ciclano: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());

    }
}
