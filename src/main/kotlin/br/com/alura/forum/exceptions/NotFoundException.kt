package br.com.alura.forum.exceptions

import java.lang.RuntimeException

class NotFoundException(mensagem: String?): RuntimeException(mensagem)