package br.com.alura.forum.dto

import jakarta.validation.constraints.NotEmpty

data class NovoCursoForm(
    @field:NotEmpty
    val nome: String,
    @field:NotEmpty
    val categoria: String
)