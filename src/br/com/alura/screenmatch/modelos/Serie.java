package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int totalEpisodios;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public int getTotalEpisodios() {
        return totalEpisodios;
    }

    public void setTotalEpisodios(int totalEpisodios) {
        this.totalEpisodios = totalEpisodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
    public int duracaoEmMinutosPorTemporada() {
        return getDuracaoEmMinutos() / temporadas ;
    }

    public int getEpisodiosPorTemporada() {
        return totalEpisodios / temporadas ;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("\n" + getNome());
        System.out.println("Ano de Lançamento - " + getAnoDeLancamento());
        System.out.println("Total de temporadas: " + getTemporadas());
        System.out.println("Duração Total da série: " + getDuracaoEmMinutos());
        System.out.println("Minutos por Episodio: " + getMinutosPorEpisodio());
        System.out.println("Duração em Minutos por Temporada: " + duracaoEmMinutosPorTemporada());
    }

}
