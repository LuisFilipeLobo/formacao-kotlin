package orientacaoobjetos

class Endereco(
    var logradouro: String,
    var numero: String,
    var bairro: String,
    var cidade: String
) {

    override fun toString(): String {
        return "Endereco(logradouro='$logradouro', numero='$numero', bairro='$bairro', cidade='$cidade')"
    }

}
