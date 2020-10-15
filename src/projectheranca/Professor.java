
package projectheranca;

import javax.swing.JOptionPane;


public class Professor extends Pessoa{
    
    public String curso;
    private double salario ;
    
    public Professor(){
        
    }
    public double getSalario(){
        
        return this.salario;
        
    }
    public void setSalario(){
        
    }
    
    public Professor(String nome, String end, String tel, String cpf, String curso, double salario){
        super(nome, end, tel, cpf);
        this.curso = curso;
        this.salario = salario;
        
    }

    @Override
    public double getTirarCopia(int qtd) {
        JOptionPane.showInputDialog("Infome a quantidade de copias: " + qtd);
        return super.getTirarCopia(qtd); //To change body of generated methods, choose Tools | Templates.
    }
     
    
    
    
} 