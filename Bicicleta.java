public class Bicicleta {
    String marca;
    String modelo;
    int qntMarcha;
    String cor;

    public Bicicleta(String marca, String modelo, int qntMarcha, String cor){
        this.marca=marca;
        this.modelo=modelo;
        this.qntMarcha=qntMarcha;
        this.cor=cor;
    }public String getMarca(){
        return marca;
    }public void setMarca(String marca){
        this.marca=marca;
    }public String getModelo(){
        return modelo;
    }public void setModelo(String modelo){
        this.modelo=modelo;
    }public int getQntMarcha(){
        return qntMarcha;
    }public void setQntMarcha(int qntMarcha){
        this.qntMarcha=qntMarcha;
    }public String getCor(){
        return cor;
    }public void setCor(String cor){
        this.cor=cor;
    }
    public String pedalar(){
        return "pedalar para fortalecer";
    }public String parar(){
        return "sistema de freio muito bom";
    }public String trocaMarcha(){
        return "melhor sistema de câmbio que existe.";
    }

    
}
