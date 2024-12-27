package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {



    public static void main(String[] args) {

        Filme meuFilme = new Filme("Poderoso Chefão", 1970);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar", 2002);
        outroFilme.avalia(8);
        var filmeDoPaulo = new Filme("Filme do Paulo", 1990);
        filmeDoPaulo.avalia(6);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(7);
        lost.setTemporadas(7);

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);
        for (Titulo item: lista) {
//            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 4) {
//                System.out.println("Classificação" + filme.getClassificacao());
            }

//            Filme filme = (Filme) item;
        }
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
