/* PROBLEMA: Dominio bancario, Um banco oferece aos seus clientes dois tipos de contas, corrente e poupança, as quais possuem funcionalidades de deposito, saque e transferencia
 * Mini revisao 
 * Abstração: concentra-se nos aspectos essenciais 
 * Encapsulamento: "Esconder" as implementações dos objetos, cirando asssim interfaces de uso mais concisas e faceis de usar/entender
 * Herança: permite que voce defina uma classe filha que reutiliza/herda estende ou modifica o comportamente de uma classe pai
 * Polimorfismo: objeto ser referenciado de varias formas
 * 
  */
import java.util.*;


public class Banco {


public String nome;

private List<Conta> contas;

public Banco(String nome){
    this.contas = new ArrayList<>();
    this.nome = nome;

}
//test

public void adicionarConta(Conta conta){
    contas.add(conta);

}

public void imprimirContas(){
    for(Conta conta : contas){
        conta.mostrarExtrato();
    }
} 





public String getNome(){
    return this.nome;
}

public void setNome(String nome){
    this.nome = nome;
    
}




}
