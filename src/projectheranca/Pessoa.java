
package projectheranca;



public class Pessoa {
    
    public String nome;
    public String end;
    public String tel;
    public String cpf;
    private double copias;
    private String categoria;
    private int qtd;
    private double preco;
    
    public Pessoa(){
        
    }
    public Pessoa(String nome, String end, String tel, String cpf){
        this.nome = nome;
        this.end = end;
        this.tel= tel;
        this.cpf = cpf;
        
    }
    
    public double getTirarCopia(int qtd){
        copias = qtd * preco;
        
       
        
        return copias;
    }


    
    
    }
   
        
               
   
            
            
            
       
        
        
   
        
      
        
