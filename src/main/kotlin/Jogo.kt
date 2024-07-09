package org.example

class Jogo(val titulo: String,
           val capa: String) {

    var descricao = ""

    override fun toString(): String {
        return "Objeto meuJogo:\n\ttitulo = $titulo\n\tcapa = $capa\n\tdescricao = $descricao\n"
    }
}