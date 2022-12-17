import orientacaoobjetos.ContaCorrente
import orientacaoobjetos.ContaPoupanca

fun main() {
    val c1 = ContaCorrente("Luis Filipe", "12346-755")
    val c2 = ContaPoupanca("Filipe Lobo", "12376-755")

    c1.depositar(1000.0)
    c2.depositar(100.0)

    if (c1.transferir(250.0, c2)) {
        println("Transferencia realizada")
    } else {
        println("Falhou.")
    }

    c1.sacar(50000.0)
    c1.sacar(50.0)

    println(c1.saldo)
    println(c2.saldo)

}