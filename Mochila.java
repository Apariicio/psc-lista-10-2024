public class Mochila {
    public String marca;
    public String cor;
    public int qntComp;
    
    public Mochila(String marca, String cor, int qntComp){
        this.marca=marca;
        this.cor=cor;
        this.qntComp=qntComp;
    }public String getMarca(){
        return marca;
    }public void setMarca(String marca){
        this.marca=marca;
    }public String getCor(){
        return cor;
    }public void setCor(String cor){
        this.cor=cor;
    }public int getQntComp(){
        return qntComp;
    }public void setQntCom(int  qntComp){        
        this.qntComp=qntComp;
    } 
    public String abrir(){
        return "Colocar coisas dentro da mochila.";
    }public String fechar(){
        return "Fechar para nao cair e perder as coias.";
    }public String ajustarAlca(){
        return "Regular e ajustas a altura nas costas do usuario.";
    }   
}