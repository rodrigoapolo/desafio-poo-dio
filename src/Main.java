import br.com.dio.rodrigoapolo.dominio.Bootcamp;
import br.com.dio.rodrigoapolo.dominio.Curso;
import br.com.dio.rodrigoapolo.dominio.Dev;
import br.com.dio.rodrigoapolo.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(
                "Curso Java","descrição Curso Java",8);

        Curso curso2 = new Curso(
                "Curso JS","descrição  Curso JS",4);

        Mentoria mentoria = new Mentoria(
                "Mentoria de java","descrição Mentoria de java",LocalDate.now());

        Bootcamp bootcamp = new Bootcamp(
                "Bootcamp Java Developer","Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rodrigo:" + devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rodrigo:" + devRodrigo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rodrigo:" + devRodrigo.getConteudosConcluidos());
        System.out.println("XP:" + devRodrigo.calcularTotalXP());

        System.out.println("-------");

        Dev devAna = new Dev("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana:" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana:" + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ana:" + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devAna.calcularTotalXP());
    }
}