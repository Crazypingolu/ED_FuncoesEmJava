package controller;
public class ClasseMetodos{
 public ClasseMetodos(){
  super();
 }
 // Função potência:
 public int funcPot(int n, int p){
  // Definir variáveis:
  int total = 0;
  // Processamento de dados:
  if(p == 0){
   return 1;
  } else {
  total = n * funcPot(n, --p);
  // Saída de dados:
   return total;
  }
 }
}