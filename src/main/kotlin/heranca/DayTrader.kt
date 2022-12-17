package heranca

class DayTrader(nome: String, cpf: String, salario: Double, senha: String) :
    Gerente(nome = nome, cpf = cpf, salario = salario, senha = senha), Auth {

    override val bonificacao: Double get() = salario * 0.15

    override fun autenticar(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }

        return false
    }

    override fun toString(): String {
        return "DayTrader(nome='$nome', cpf='$cpf', salario=$salario, bonificacao=$bonificacao)"
    }

}