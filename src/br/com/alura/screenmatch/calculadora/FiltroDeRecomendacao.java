package br.com.alura.screenmatch.calculadora;

public class FiltroDeRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no Momento");
        } else {
            System.out.println("Coloque na sua lista para ver depois");
        }
    }
}
