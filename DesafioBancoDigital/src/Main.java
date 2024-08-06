public class Main {

    public static void main(String[] args) {

        Cliente gabriel = new Cliente();
        Cliente joao = new Cliente();
        gabriel.setNome("Gabriel");
        joao.setNome("joao");

        Conta conta1cc = new ContaCorrente(gabriel);
        ContaPoupaca conta1cp = new ContaPoupaca(joao);

        conta1cc.depositar(500);

        conta1cc.transferir(200, conta1cp);


        Banco itau = new Banco("ITAU");

        itau.adicionarConta(conta1cp);
        itau.adicionarConta(conta1cc);

        itau.imprimirContas();


        //conta1cc.mostrarExtrato();
        //conta1cp.mostrarExtrato();


        



       



    }

   
}
