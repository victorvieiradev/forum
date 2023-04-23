package br.com.alura.forum.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.Size

data class NovoUsuarioForm(
    @field:NotEmpty
    @field:Size(min = 5, max = 90)
    val nome: String,
    @field:NotEmpty
    @field:Email
    val email: String
)