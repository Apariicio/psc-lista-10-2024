public class Janela {
    public String material;
    public String abertura;
    public String cor;
    public double altura;
    public double largura;

    public Janela(String mateiral, String abertura, String cor, double altura, double largura){
        this.material=mateiral;
        this.abertura=abertura;
        this.cor=cor;
        this.altura=altura;
        this.largura=largura;
    }public String getMaterial(){
        return material;
    }public void setMaterial(String material){
        this.material=material;
    }public String getAbertura(){
        return abertura;
    }public void setAbertura(String abertura){
        this.abertura=abertura;
    }public String getCor(){
        return cor;
    }public void setCor(String cor){
        this.cor=cor;
    }public double getAltura(){
        return altura;
    }public void setAltura(double altura){
        this.altura=altura;
    }public double getLargura(){
        return largura;
    }public void setLargura(double largura){
        this.largura=largura;
    }

    public String abrir(){
        return "abertura bem leve";
    }public String fechar(){
        return "facil de fechar.";
    }public String trancar(){
        return "Bastante segurança no seu sistema de tranca.";
    }
    
}
