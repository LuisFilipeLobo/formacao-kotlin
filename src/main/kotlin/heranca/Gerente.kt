package heranca

open class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double get() = salario * 0.2

    override fun toString(): String {
        return "Gerente(nome='$nome', cpf='$cpf', salario=$salario, bonificacao=$bonificacao)"
    }

    fun auth(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }

        return false
    }

}