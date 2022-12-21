package exceptions

import orientacaoobjetos.Endereco

fun main() {

    var endereco: Endereco? = Endereco(logradouro = "Rua da Lagoinha")

    endereco?.let {
        println(it.logradouro.length)

        // Elvis operator
        // val num: Int = it.numero.length ?: throw IllegalStateException("Não pode ser vazio")
        val num: Int = it.numero.length ?: 0

        println(num)

    }

    // Safe Cast
    println(safeCast(""))
    println(safeCast(13))
    println(safeCast("abc"))

}