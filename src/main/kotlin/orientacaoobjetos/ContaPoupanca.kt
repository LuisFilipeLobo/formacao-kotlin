package orientacaoobjetos

import heranca.Cliente

class ContaPoupanca(
    titular: Cliente,
    conta: String,
    endereco: Endereco
) : Conta(titular = titular, conta = conta, endereco = endereco) {

    override fun sacar(valor: Double): Boolean {

        if (valor <= this.saldo) {
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