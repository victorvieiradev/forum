package br.com.alura.forum.controller

import br.com.alura.forum.model.Usuario
import br.com.alura.forum.service.UsuarioService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/usuarios")
class UsuarioController(
    private val usuarioService: UsuarioService
) {
    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Usuario {
        return usuarioService.buscarPorId(id)
    }
}