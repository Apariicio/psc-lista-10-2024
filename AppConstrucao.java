public class AppConstrucao {
    public static void main(String[] args) {
        Porta porta = new Porta("Madeira", 2.30, 0.90, "Wisk");
        System.out.println("***PORTA***");
        System.out.println("Uma porta de " + porta.getMaterial() + " de cor " + porta.getCor() + ".");
        System.out.println("Essa porta possui " + porta.getAltura() + " metros de altura e " + porta.getLargura() + " centimetros de largura.");
        System.out.println("Posui tambem uma " + porta.abrir() + " E é bem " + porta.fechar());
        System.out.println(porta.trancar() + " o morador pode ficar tranquilo e sossegado.");
        System.out.println("----------------------------------------------------------------------");
        System.out.println();        
        
        Janela janela = new Janela("madeira", "total dos dois lados", "branco", 1.10, 1.0);
        System.out.println("***JANELA***");
        System.out.println("Com o material de: " + janela.getMaterial() + ", de cor: " + janela.getCor());
        System.out.println("Possui uma abertura " + janela.getAbertura());
        System.out.println("Com: " + janela.getAltura() + " de altura e " + janela.getLargura() + " de largura.");
        System.out.println("Possui tambem uma " + janela.abrir() + " e é " + janela.fechar());
        System.out.println(janela.trancar());

    }
    
}
