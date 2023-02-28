package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public String toString() {
        return "Curso{\n" +
                "titulo='" + getTitulo() + '\'' +
                ",\n descricao=" + getDescricao() + '\'' +
                ", \n cargaHoraria=" + cargaHoraria +
                "\n}";
    }
}
