//super classe
//classe abstrata garante que ngm use um new, pois nao faz sentido usar ela, apenas seus filhos.

public abstract class Conta {

    private static int SEQUENCIAL = 1; 
    private static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    

    //construtor:
    public Conta(Cliente cliente){
        
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    
    
    public int getAgencia() {
        return this.agencia;
    }
    
    public int getNumero() {
       return this.numero;
    }
    
    
    public double getSaldo() {
      return this.saldo;
    }
    
        
    

    public void sacar(double valor) {
        saldo -= valor;
    }
    public void depositar(double valor) {
        saldo += valor; 
    }


    public void transferir(double valor, Conta destino){
        this.sacar(valor);
        destino.depositar(valor);

    }

    public void mostrarExtrato(){

        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Numero da Agencia " + this.getAgencia());
        System.out.println("Numero da conta " + this.getNumero() );
        System.out.println("Saldo Disponivel " + this.getSaldo() );

    }



    

    
    

}
