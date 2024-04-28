public class Moto {
    String marca;
    String modelo;
    String cor;
    int cilindrada;

    public Moto(String marca, String modelo, String cor, int cilindrada){
        this.marca=marca;
        this.modelo=modelo;
        this.cor=cor;
        this.cilindrada=cilindrada;
    }public String getMarca(){
        return marca;
    }public void setMarca(String marca){
        this.marca=marca;
    }public String getModelo(){
        return modelo;
    }public void setModelo(String modelo){
        this.modelo=modelo;
    }public String getCor(){
        return cor;
    }public void setCor(String cor){
        this.cor=cor;
    }public int getCilindrada(){
        return cilindrada;
    }public void setCilindrada(int cilindrada){
        this.cilindrada=cilindrada;
    }
    public void acelerar(){
        System.out.println("Um torque incrivel");
    }public String parar(){
        return "sistema de freio abs traseiro";
    }public String trocaMarcha(){
        return "um sistema de embreagem multidisco banhada a oleo.";
    }
}