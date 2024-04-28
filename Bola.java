public class Bola {
    public String marca;
    public String material;
    public String cor;
    public int peso;

    public Bola(String marca, String material,String cor,int peso){
        this.marca=marca;
        this.material=material;
        this.cor=cor;
        this.peso=peso;
    }public String getMarca(){
        return marca;
    }public void setMarca(String marca){
        this.marca=marca;
    }public String getMaterial(){
        return material;
    }public void setMaterial(String material){
        this.material=material;
    }public String getCor(){
        return cor;
    }public void setCor(String cor){
        this.cor=cor;
    }public int getPeso(){
        return peso;
    }public void setTamanho(int peso){
        this.peso=peso;
    }
    public String chutar(){
        return "chutar";
    }
    public String tacar(){
        return "lançar";
    }
    
}
