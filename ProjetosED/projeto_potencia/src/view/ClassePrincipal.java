package view;
import controller.ClasseMetodos;
public class ClassePrincipal{
 public static void main(String[] args){
  // Instancia de classe:
  ClasseMetodos met = new ClasseMetodos();
  // Definir variáveis:
  int num = 2, pot = 4;
  // Chamada da função + saída de dados:
  System.out.println(met.funcPot(num, pot));
 }
}