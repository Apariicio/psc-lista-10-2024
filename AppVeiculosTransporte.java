public class AppVeiculosTransporte {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Vulcan", 21, "Preto");
        System.out.println("***BICICLETA***");
        System.out.println("bicicleta da marca " + bicicleta.getMarca() + " modelo: " + bicicleta.getModelo());
        System.out.println("De cor: " + bicicleta.getCor() + " e possui " + bicicleta.getQntMarcha() + " marchas.");
        System.out.println("Otimo para " + bicicleta.pedalar() + "\nPossui um " + bicicleta.parar());
        System.out.println("Tambem tem o " + bicicleta.trocaMarcha());
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println();

        Moto moto = new Moto("Yamaha", "MT-03", "Azul", 321);
        System.out.println("***MOTO***");
        System.out.println("Sua fabricante é a: " + moto.getMarca() + " seu modelo é: " + moto.getModelo());
        System.out.println("Possui: " + moto.getCilindrada() + " cilindradas " + " e sua cor é " + moto.getCor());
        moto.acelerar();
        System.out.println("Com um " + moto.parar() + "\nTambem possui " + moto.trocaMarcha());
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();

        Onibus onibus = new Onibus("Viacao transpardal", 49, "Mercedez", "Azul com verde", "Bairro/centro");
        System.out.println("***ONIBUS***");
        System.out.println("A empresa: " + onibus.getEmpresa() + ", possui o onibus da marca: " + onibus.getFabricante());
        System.out.println("Com capacidade de levar " + onibus.getQntPessoa() + " passageiros.");
        System.out.println("Da cor " + onibus.getCor() + ", que faz a rota: " + onibus.getRota());
        System.out.println("Tem a ação de: " + onibus.embarcar() + " e " + onibus.desembarcar());
        System.out.println("Possui num determinado ponto geografico " + onibus.iniciar());
        onibus.parada();
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println();

        Aviao aviao = new Aviao("Latam", "Airbus 321", "Branco", 220);
        System.out.println("***AVIÃO***");
        System.out.println("A empresa: " + aviao.getEmpresa() + ", possui o modelo de aviao: " + aviao.getModelo());
        System.out.println("De cor: " + aviao.getCor() + ", com capacidade de: " + aviao.getQntPessoa() + " pessoas.");
        System.out.println("Precisa de muita velocidade para " + aviao.decolar());
        aviao.aterrizar();
        System.out.println();
        System.out.println("-------------------FIM-------------------");
        
    }
    
}
