package Aula9.Tributos;
public class ContaPoupanca extends Conta {
   
    public void atualiza( double taxa) {
    this.saldo += this.saldo * (taxa * 3);
    }

    public double taxas(){
        return 0.0;
    }
}