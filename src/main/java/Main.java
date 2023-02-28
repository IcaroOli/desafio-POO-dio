import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoA = new Curso();
        cursoA.setTitulo("POO com Java");
        cursoA.setDescricao("Curso relacionado a programação orientada a objetos utilizando a linguagem de programação Java.");
        cursoA.setCargaHoraria(4);

        Curso cursoB = new Curso();
        cursoB.setTitulo("Testes Unitários com JUnit");
        cursoB.setDescricao("Curso relacionado a testes unitários na linguagem Java utilizando JUnit com objetivo de entender o motivo de testes e como utilizar a ferramenta.");
        cursoB.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria sobre a linguagem de programação Java.");
        mentoria.setDataMentoria(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Banco PAN Java Developer");
        bootcamp.setDescricao("O primeiro programa do Banco PAN em parceria com a DIO chega com uma trilha completa em Java Spring Boot e 5 mil bolsas de estudo disponíveis. É indicado para pessoas de baixa renda e de grupos sub-representados que estão em busca de sua primeira formação no universo da tecnologia, entretanto, qualquer pessoa interessada pode participar.");
        bootcamp.getConteudos().add(cursoA);
        bootcamp.getConteudos().add(cursoB);
        bootcamp.getConteudos().add(mentoria);

        Dev devEden = new Dev();
        devEden.setNome("Eden");
        devEden.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos de Icaro: " + devEden.getConteudosInscritos());
        devEden.avancar();
        devEden.avancar();
        devEden.avancar();
        System.out.println("Conteúdos Concluídos de Icaro: " + devEden.getConteudosConcluidos());
        System.out.println("XP: " + devEden.calcularTotalXP());

        System.out.println(" _____________________________________________________");


        Dev devIcaro = new Dev();
        devIcaro.setNome("Icaro");
        devIcaro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Icaro: " + devIcaro.getConteudosInscritos());
        devIcaro.avancar();
        System.out.println("Conteúdos Concluídos de Icaro: " + devIcaro.getConteudosConcluidos());
        System.out.println("XP: " + devIcaro.calcularTotalXP());


    }
}
