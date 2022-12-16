package heranca

fun main() {

    val f1 = Funcionario(
        "Luis Filipe",
        "123.456.789-00",
        2500.00
    )

    println(f1)

    val g1 = Gerente(
        "Filipe Luis",
        "123.456.789-00",
        4500.00,
        "12345678"
    )

    println(g1)

    if (g1.auth("123456")){
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

    println(s1)

}