import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoA = new Curso();
        cursoA.setTitulo("Poo com java");
        cursoA.setDescricao("Curso relacionado a programação orientada a objetos utilizando a linguagem de programação Java ");
        cursoA.setCargaHoraria(4);

        Curso cursoB = new Curso();
        cursoB.setTitulo("Testes Unitários com JUnit");
        cursoB.setDescricao("Curso relacionado a testes unitário na linguagem Java utlizando JUnit com objetivo de entender o motivo de testes e com utlizar a ferramenta ");
        cursoB .setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Mentoria sobre a linguagem de programação Java");
        mentoria.setDataMentoria(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Banco PAN Java Developer");
        bootcamp.setDescricao("O primeiro programa do Banco PAN em parceria com a DIO chega com uma trilha completa em Java Spring Boot e 5 mil bolsas de estudo disponíveis. É indicado para pessoas de baixa renda e de grupos sub representados que estão em busca de sua primeira formação no universo da tecnologia, entretanto, qualquer pessoa interessada pode participar.");


    }
}
