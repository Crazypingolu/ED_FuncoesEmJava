package view;
import controller.ClasseMetodos;
public class ClassePrincipal{
 public static void main(String[] args){
  // Instancia de classe:
  ClasseMetodos met = new ClasseMetodos();
  // Chamada da função + saída de dados:
  System.out.println(met.funcRecursiva(6));
 }
}