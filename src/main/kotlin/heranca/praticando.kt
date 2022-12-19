package heranca

fun main() {

    val dt1 = DayTrader(
        "Luis Filipe",
        "123.456.789-00",
        2500.00,
        "999887",
    )

    val calc = BonusCalc()
    calc.calcularBonus(dt1)

    println(dt1)

    val g1 = Gerente(
        "Filipe Luis",
        "123.456.789-00",
        4500.00,
        "12345678"
    )

    calc.calcularBonus(g1)
    println(g1)

    if (g1.autenticar("123456")) {
        println("Autenticado")
    } else {
        println("Autenticação falhou")
    }

    val s1 = Supervisor(
        "Maria",
        "123.456.987-65",
        7000.00,
        "654987",
        2500.00
    )

    calc.calcularBonus(s1)
    println(s1)

    println("Bonus total: ${calc.valorTotal}")

    val cliente = Cliente(
        "Afonso Brito",
        "444.876.897-87",
        "arigato"
    )

    if (cliente.autenticar("arigato")) {
        println("Autenticado")
    } else {
        println("Autenticacao falhou")
    }

        dt1.salario

}