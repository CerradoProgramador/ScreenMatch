import br.com.alura.screenmatch.calculadora.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        // Filme

        Filme oauto = new Filme();

        oauto.setNome("O Auto da Compadecida");
        oauto.setAnoDeLancamento(2002);
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

        Filme starWarsEPI = new Filme();

        starWarsEPI.setNome("Star Wars Episódio I - A ameaça Fantasma");
        starWarsEPI.setDuracaoEmMinutos(136); //* Dado usado pela Calculadora
        starWarsEPI.setAnoDeLancamento(1999);
        starWarsEPI.exibeFichaTecnica();
        System.out.println(calculadora.getTempoTotal());

        //* Outro Filme para a Calculadora

        Filme clubeDaLuta = new Filme();

        clubeDaLuta.setNome("Clube da Luta");
        clubeDaLuta.setDuracaoEmMinutos(139); //* Dado usado pela Calculadora
        clubeDaLuta.setAnoDeLancamento(1999);
        clubeDaLuta.exibeFichaTecnica();

        //* Serie para a Calcualdora

            Serie suits = new Serie();

            suits.setNome("Suits");
            suits.setAnoDeLancamento(2011);
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

        Serie himym = new Serie();

        himym.setNome("How i meet you Mother");
        himym.setAnoDeLancamento(2005);
        himym.setTemporadas(9);
        himym.setEpisodiosPorTemporada(23);
        himym.setMinutosPorEpisodio(40);
        himym.exibeFichaTecnica();
        //System.out.println("Duração em minutos para maratonar: " + himym.getDuracaoEmMinutos());
    }
}
