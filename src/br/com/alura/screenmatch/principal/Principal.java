package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculadora.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculadora.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // Filme

        Filme oauto = new Filme("O Auto da Compadecida", 2002);
        oauto.setDuracaoEmMinutos(140);
        oauto.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + oauto.getDuracaoEmMinutos());
        oauto.avalia(7);
        oauto.avalia(6.6);
        oauto.avalia(9);
        System.out.println(oauto.pegaMedia());
        System.out.println("Total de Avaliações \n" + oauto.getTotalDeAvaliacoes());


        //* CALCULADORA CRIANDO

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        //*Filme Para a calculadora

        Filme starWarsEPI = new Filme("Star Wars Episódio I - A ameaça Fantasma", 1999);
        starWarsEPI.setDuracaoEmMinutos(136); //* Dado usado pela Calculadora
        starWarsEPI.exibeFichaTecnica();
        starWarsEPI.avalia(10);
        System.out.println(calculadora.getTempoTotal());

        //* Outro Filme para a Calculadora

        Filme clubeDaLuta = new Filme("Clube da Luta", 1999);
        clubeDaLuta.setDuracaoEmMinutos(139); //* Dado usado pela Calculadora
        clubeDaLuta.avalia(10);
        clubeDaLuta.exibeFichaTecnica();

        //* Serie para a Calcualdora

            Serie suits = new Serie("Suits",2011);
            suits.setTemporadas(9);
            suits.setMinutosPorEpisodio(50);
            suits.setTotalEpisodios(136);
            suits.setEpisodiosPorTemporada(suits.getEpisodiosPorTemporada());
            suits.exibeFichaTecnica();
            System.out.println("Episodios por Temporada: " + suits.getEpisodiosPorTemporada() + "\n");

        //* Calculadora Somando

        calculadora.inclui(starWarsEPI);
        calculadora.inclui(clubeDaLuta);
        calculadora.inclui(suits);
        System.out.println("Tempo para Maratonar " + calculadora.getTempoTotal() + " minutos \n");

        //* Série

        Serie himym = new Serie("How i meet you Mother", 2005);
        himym.setTemporadas(9);
        himym.setEpisodiosPorTemporada(23);
        himym.setMinutosPorEpisodio(40);
        himym.exibeFichaTecnica();
        //System.out.println("Duração em minutos para maratonar: " + himym.getDuracaoEmMinutos());


        // Usando Metodo Classificavel

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();


        Episodio episodio = new Episodio();
        episodio.setNome("Episodio");
        episodio.setSerie(himym.getNome());
        episodio.setNumero(2);
        episodio.setTotalVizualizacoes(300);
        filtro.filtra(episodio);


//        System.out.println("\n \nLista \n");
//        ArrayList<Titulo> lista = new ArrayList<>();
//        lista.add(starWarsEPI);
//        lista.add(clubeDaLuta);
//        lista.add(oauto);
//        lista.add(himym);
////        lista.forEach(System.out::println);
//        for(Titulo item: lista) {
//            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
//                System.out.println(item);
//            } else {
//                System.out.println(item.toString());
//            }

//            Filme filme = (Filme) item;
//            System.out.println(item);
        }






//        System.out.println("\n--------------");
//        System.out.println("Tamanho da lista " + lista.size() + "\n");
//        System.out.println("Primeiro Filme: " + lista.get(0).toString());
//        System.out.println(lista.toString());

//        ArrayList<Serie> listaDeSeries = new ArrayList<>();
//        listaDeSeries.add(suits);
//        listaDeSeries.add(himym);
//        System.out.println("---------------");
//        System.out.println(listaDeSeries.toString());


    }

