package com.hvn.ci.utils

fun validaUsuario(nome: String): Boolean {
    val listaDePermissao = arrayListOf<String>("Jeffersson", "Joao", "Zeta")

    listaDePermissao.map {
        if (it == nome)
            return true
    }
    return false
}