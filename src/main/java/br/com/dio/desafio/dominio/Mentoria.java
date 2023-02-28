package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter @Setter
public class Mentoria extends Conteudo{

     private LocalDate dataMentoria;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 10d;
    }

    public String toString() {
        return "Curso{\n" +
                "titulo='" + getTitulo() + '\'' +
                ",\n descricao='" + getDescricao() + '\'' +
                ",\n cargaHoraria=" + dataMentoria +
                "\n}";
    }
}
