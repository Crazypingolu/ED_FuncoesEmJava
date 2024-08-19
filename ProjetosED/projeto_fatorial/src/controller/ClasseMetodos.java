package controller;
public class ClasseMetodos{
 public ClasseMetodos(){
  super();
 }
 // Função recursiva:
 public int funcRecursiva(int n){
  // Definir variáveis:
  int total = 0;
  // Processamento de dados:
  if(n == 1){
   return 1;
  } else {
  total = n * funcRecursiva(--n);
  // Saída de dados:
   return total;
  }
 }
}