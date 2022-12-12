package orientacaoobjetos

class Conta(var titular: String, var conta: String) {
    var saldo: Double = 0.0
        private set

    fun depositar(valor: Double): Boolean {

        if (valor > 0) {
            this.saldo += valor
            return true
        }

        return false
    }

    fun sacar(valor: Double): Boolean {

        if (valor <= this.saldo) {
            this.saldo -= valor
            return true
        }

        return false
    }

    fun transferir(valor: Double, contaDestino: Conta): Boolean {

        if (this.sacar(valor)) {
            contaDestino.depositar(valor)
            return true
        }

        return false
    }

}