public class Aluno{
    private String nome;
    private int id;
    private double media;
    protected double nota1,nota2;
    
    public void alteranome(String nome){
        this.nome = nome;
        }
    public void alteraid(int id){
        this.id = id;
        }
    public void imprimenome(){
        System.out.println(this.nome);
        }
    public void imprimeid(){
        System.out.println(this.id);
        }
    private double calculaMedia(){
        this.media = (this.nota1 + this.nota2)/2;
        return this.media;
    }
    public double retornaMedia(){
        return calculaMedia();
    }
    public boolean passou(){
        if(this.media > 7){
            return true;
        }else{
            return false;
        }
    }
}
