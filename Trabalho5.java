// Maha Mantra Figueiredo Vieira
public class Main{

    public static void main(String[] args){
        Aluno aluno1 = new Aluno();
        aluno1.alteranome("Maha");
        aluno1.alteraid(1);
        aluno1.nota1 = 3.5;
        aluno1.nota2 = 6.5;
        aluno1.retornaMedia();
        if(aluno1.passou() == true){
            System.out.println("Passou");
        }else{
            System.out.println("Não passou");
        }
        
    }

   

}

