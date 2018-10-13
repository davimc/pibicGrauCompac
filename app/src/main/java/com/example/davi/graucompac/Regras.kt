package layout


class Regras {
    fun imprimiNovaFrase(frase:CharSequence, quantidade:Double): String {
        val delimiter = ": "
        val f = frase
        val novaFrase:List<String>
        novaFrase = f.split(delimiter)

        return ("" + novaFrase[0] + ": %.2f".format(quantidade))
    }
}

