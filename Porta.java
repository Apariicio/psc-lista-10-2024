public class Porta {
    public String material;
    public double altura;
    public double largura;
    public String cor;

    public Porta(String material, double altura, double largura, String cor){
        this.material=material;
        this.altura=altura;
        this.largura=largura;
        this.cor=cor;

    }public String getMaterial(){
        return material;
    }public void setMaterial(String material){
        this.material=material;
    }public double getAltura(){
        return altura;
    }public void setAltura(double altura){
        this.altura=altura;
    }public double getLargura(){
        return largura;
    }public void setLargura(double largura){
        this.largura=largura;
    }public String getCor(){
        return cor;
    }public void setCor(String cor){
        this.cor=cor;
    }

    public String abrir(){
        return "abertura silenciosa e leve.";
    }public String fechar(){
        return "macia e leve para fechar.";
    }public String trancar(){
        return "Com uma tranca segura";
    }
    
}
