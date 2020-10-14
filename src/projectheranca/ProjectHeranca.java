
package projectheranca;

import javax.swing.JOptionPane;



public class ProjectHeranca {

   
    public static void main(String[] args) {
        
       Aluno al = new Aluno();
       al.nome = JOptionPane.showInputDialog("Informe o nome do Aluno: ");
       al.end = JOptionPane.showInputDialog("Informe o Endereço: ");
       al.tel = JOptionPane.showInputDialog("Informo o Telefone: ");
       al.cpf = JOptionPane.showInputDialog("INforme o CPF: ");
       al.curso = JOptionPane.showInputDialog("Informe o Curso: "); 
       
       System.out.println("Aluno: " + al.nome + "\nEndereço: " + al.end + "\nTelefone: " 
               + al.tel + "\nCPF: " + al.cpf + "\n Curso:" + al.curso);
       
      Aluno all = new Aluno();
        
      all.setMedia(8.5, 7.4, 6.5);
      
      
      Professor prof = new Professor();
      prof.nome = JOptionPane.showInputDialog("Informe o nome do Professor: ");
      prof.end = JOptionPane.showInputDialog("Informe o Endereço: ");
      prof.tel = JOptionPane.showInputDialog("Informe o Telefone: ");
      prof.cpf = JOptionPane.showInputDialog("Informe o CPF: ");
      prof.cursoP = JOptionPane.showInputDialog("Informe o curso: ");
      
      System.out.println("Professor: " + prof.nome + "\n Endereço: " + prof.end + "\n Telefone: "
              + prof.tel + "\n CPF: " + prof.cpf + "\n Curso: " + prof.cursoP);
       
      
      Professor pff = new Professor();
      pff.setSalario();
    }
        
        
     
    
}
