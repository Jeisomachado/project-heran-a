
package projectheranca;


public class Professor extends Pessoa{
    
    public String cursoP;
    private double salario ;
    
    public Professor(){
        
    }
    
    public Professor(String nome, String end, String tel, String cpf){
        super(nome, end, tel, cpf);
    }
    
    public static double SALARIO = 1039.00;
    
    public float getSalario(){
        
        return this.salario;
        
    }
    public void setSalario(){
        
    }
    
}
