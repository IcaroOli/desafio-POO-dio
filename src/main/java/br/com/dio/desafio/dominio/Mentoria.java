package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter @Setter
public class Mentoria extends Conteudo {

     private LocalDate dataMentoria;

    @Override
    public double calcularXp() {
        return 0;
    }
}
