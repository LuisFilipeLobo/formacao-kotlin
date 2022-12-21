package orientacaoobjetos

import exceptions.SaldoInsuficienteException
import heranca.Cliente

class ContaCorrente(
    titular: Cliente,
    conta: String,
    endereco: Endereco
) : Conta(titular = titular, conta = conta, endereco = endereco) {

    private val taxaDeOperacao: Double = 5.0

    override fun sacar(valor: Double): Boolean {

        if (valor + taxaDeOperacao > saldo) {
            throw SaldoInsuficienteException("Não foi possível realizar a operação. Saldo insuficiente")
        }

        if (valor + taxaDeOperacao <= this.saldo) {
            this.saldo -= valor
            return true
        }

        return false
    }

    override fun transferir(valor: Double, contaDestino: Conta): Boolean {

        if (this.sacar(valor)) {
            contaDestino.depositar(valor)
            return true
        }

        return false
    }

}