package br.com.alura.screenmatch.modelos;


import br.com.alura.screenmatch.Excessao.ErroDeConversaoDeAnoException;


public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOMDB meuTituloOMBDB) throws ErroDeConversaoDeAnoException {
        this.nome = meuTituloOMBDB.title();
        if (meuTituloOMBDB.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não conseguiu converter o ano");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOMBDB.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOMBDB.runtime().substring(0,2));
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFichaTecnica(){
        System.out.println("\n" + nome);
        System.out.println("Ano de Lançamento - " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(" + "Titulo: "+ getNome() +
                " - Ano de Lançamento: " + getAnoDeLancamento()
                + " - Duração em Minutos: " + getDuracaoEmMinutos() + ") PRÓXIMO" ;
    }
}
