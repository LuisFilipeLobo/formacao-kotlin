package orientacaoobjetos

abstract class Conta(var titular: String, var conta: String) {
    var saldo: Double = 0.0
        protected set // Assim o getter fica public e apenas as classes filhas poderão alterar o saldo

    fun depositar(valor: Double): Boolean {

        if (valor > 0) {
            this.saldo += valor
            return true
        }

        return false
    }

    abstract fun sacar(valor: Double): Boolean

    abstract fun transferir(valor: Double, contaDestino: Conta): Boolean

}