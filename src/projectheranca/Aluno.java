
package projectheranca;





public class Aluno extends Pessoa{
    
    public String curso;
    private double n1;
    private double n2;
    private double n3;
    private double media;
    
    
    public Aluno(){
        
    }
      
    public Aluno(String nome, String end, String tel, String cpf){
        super(nome, end, tel, cpf);
    
     }
    
     public void setN1(double n1){
         
     }
    
    
     public double getMedia(){
         
        return this.media;
     }
     public void setMedia(double n1, double n2, double n3){

         
         this.media = (n1 + n2 + n3) / 3;
         
     
         if(media <= 7){
             System.out.println("Sua média é: " + this.getMedia() + " Reprovado");
         }else
             System.out.println("Sua média é: " + this.getMedia() + " Aprovado! " );
     }
     
     }
    


