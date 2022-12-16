package heranca

class Supervisor(nome: String, cpf: String, salario: Double, senha: String, val plr: Double) :
    Gerente(nome = nome, cpf = cpf, salario = salario, senha = senha) {

    override val bonificacao: Double get() = salario * 0.3

    override fun toString(): String {
        return "Supervisor(nome='$nome', cpf='$cpf', salario=$salario, bonificacao=$bonificacao, plr='$plr')"
    }

}