package exceptions

fun safeCast(valor: Any): Int? {
    return valor as? Int
}