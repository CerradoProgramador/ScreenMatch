public class Principal {
    public static void main(String[] args) {
        Filme oauto = new Filme();

        oauto.nome = "O Auto da Compadecida";
        oauto.anoDeLancamento = 2000;
        oauto.duracaoEmMinutos = 104;

        oauto.exibeFichaTecnica();
        oauto.avalia(7);
        oauto.avalia(6.6);
        oauto.avalia(9);
        System.out.println(oauto.pegaMedia());
    }
}
