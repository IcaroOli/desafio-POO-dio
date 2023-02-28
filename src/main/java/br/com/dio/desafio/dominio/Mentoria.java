package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter @Setter @ToString
public class Mentoria extends Conteudo{

     private LocalDate dataMentoria;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 10d;
    }
}
