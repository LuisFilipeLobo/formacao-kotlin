package orientacaoobjetos

class ContaCorrente(titular: String, conta: String) :
    Conta(titular = titular, conta = conta) {

    private val taxaDeOperacao: Double = 5.0

    override fun sacar(valor: Double): Boolean {

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