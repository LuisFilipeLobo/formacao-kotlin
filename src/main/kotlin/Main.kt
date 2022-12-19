import heranca.Cliente
import orientacaoobjetos.ContaCorrente
import orientacaoobjetos.ContaPoupanca
import orientacaoobjetos.Endereco

fun main() {
    val c1 = ContaCorrente(
        Cliente(
            "Luis Filipe",
            "12346-755",
            "987654"
        ),
        "6657-9",
        Endereco(
            "Rua Manoel Gomes",
            "33",
            "Lagoinha",
            "Lagoinha do Norte"
        )
    )

    val c2 = ContaPoupanca(
        Cliente(
            "Filipe Lobo",
            "12376-755",
            "123456"
        ),
        "557-9",
        Endereco(
            "Rua Manoel Gomes",
            "13",
            "Lagoinha",
            "New Lagoinha"
        )
    )

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

    println(c1.endereco)
    println(c2.endereco)

}