package heranca

class Cliente(val nome: String, val cpf: String, val senha: String): Auth {

    override fun autenticar(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }

        return false
    }

}