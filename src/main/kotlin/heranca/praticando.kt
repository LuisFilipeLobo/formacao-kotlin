package heranca

fun main() {

    val f1 = Funcionario(
        "Luis Filipe",
        "123.456.789-00",
        2500.00
    )

    val calc = BonusCalc()
    calc.calcularBonus(f1)

    println(f1)

    val g1 = Gerente(
        "Filipe Luis",
        "123.456.789-00",
        4500.00,
        "12345678"
    )

    calc.calcularBonus(g1)
    println(g1)

    if (g1.auth("123456")) {
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

}