public class AppCoisasEscolares {
    public static void main(String[] args) {        
        Mochila mochila = new Mochila("Companys. ", "Laranja Camaleão", 5);
        System.out.println("***MOCHILA***");
        System.out.println(mochila.getMarca() + "Uma marca de mochila perfeita " + "de cor " + mochila.cor);
        System.out.println("Essa mochila possui: " + mochila.getQntComp() + " compartimentos");
        System.out.println("Uma das principais ações é: " + mochila.abrir());
        System.out.println("Com certeza serve também para: " + mochila.fechar());
        System.out.println("Outra ação é: " + mochila.ajustarAlca());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
        
        Tesoura tesoura = new Tesoura("Stainless Steel", 21.0, "Arredondado", "Vermelho");
        System.out.println("***TESOURA***");
        System.out.println("É uma tesoura otima da marca " + tesoura.getMarca() + "... Com " + tesoura.getCompr() + " centímetros de comprimento.");
        System.out.println("Possui a ponta " + tesoura.getTipoPonta() + " e o cabo de cor " + tesoura.getCor());
        System.out.println("Essa tesoura tem uma excelente amolação para: " + tesoura.cortar());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
        
        Oculos oculos = new Oculos("Mormaii", "De sol", "Quadrado e polarizado", "Vermelho");
        System.out.println("***ÓCULOS***");
        System.out.println("Um lindo oculos da marca: " + oculos.getMarca() + "\nModelo: " + oculos.getModelo());
        System.out.println("Possui a lente: " + oculos.getTipoLente() + " de cor " + oculos.getCor());
        System.out.println("Um maravilhoso oculos que " + oculos.ajustar());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println();
        
        Bola bola = new Bola("Penalty", "PU macio", "Azul", 450);
        System.out.println("***BOLA***");
        System.out.println("Uma excelente bola da marca: " + bola.getMarca() + "\nCom um otimo revestimento de: " + bola.getMaterial());
        System.out.println("Possui a cora: " + bola.getCor() + "\nTem o peso de: " + bola.getPeso() + " gramas.");
        System.out.println("Leve e eficiente para " + bola.chutar() + " e " + bola.tacar());
        System.out.println("---------------------------------------------------------------------------------");
        

    }    
}