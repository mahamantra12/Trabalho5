public class Disciplina{
    public Aluno turma[]= new Aluno[10];
    private int contador = 0; // contador pra percorrer o vetor enquanto adiciona alunos nele
    private double notas1,notas2; // somatorio das notas 1 e 2
    private double mnota1 = 0; // media das notas 1
    private double mnota2 = 0; // media das notas 2
public void adicionaAluno(Aluno a){
    if(this.contador <10){
        this.turma[this.contador] = a;
        this.notas1 += turma[this.contador].nota1; // adicionando nota1 do aluno adicionado ao somatorio da nota1 
        this.notas2 += turma[this.contador].nota2; // mesmo só que para nota 2
        this.contador++; // incrementa o contador da turma para que
        this.mnota1 = this.notas1/this.contador; // gera o valor da media a partir do valor final do somatorio menos a quantidade de alunos adicionados
        this.mnota2 = this.notas2/this.contador; // lembrando que vai depois do incremento pois o primeiro seria 0 e nao existe divisor por 0
    }
}
public void adicionaAluno(Aluno a, int i){
    this.turma[i] = a; // caso queira adicionar em posição especifica ele usa dois parametros ao inves de um.
    this.notas1 += turma[i].nota1; // incremento a nota ao somatorio nota1
    this.notas2 += turma[i].nota2; // incremento a nota ao somatorio nota2
}
public double retornamnota1(){
    return this.mnota1;
}
public double retornamnota2(){
    return this.mnota2;
}
public void imprimenomes(int i){
    if(i>=0 && i<=10){
        if(i==0){ // primeiro aluno do vetor
            this.turma[i].imprimenome();
            this.turma[i+1].imprimenome();
        }if(i==9){  // ultimo aluno do vetor
            this.turma[i-1].imprimenome();
            this.turma[i].imprimenome();
        }else{  // outros casos que tem os treis possiveis casos de numero anterior e posterior
            this.turma[i-1].imprimenome();
            this.turma[i].imprimenome();
            this.turma[i+1].imprimenome();
        }
    }
}
}