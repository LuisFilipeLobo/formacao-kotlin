package heranca

class BonusCalc {
    var valorTotal: Double = 0.0
        private set

    fun calcularBonus(funcionario: Funcionario) {
        this.valorTotal += funcionario.bonificacao
    }

}