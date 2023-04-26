package br.com.alura.forum.controller

import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.service.TopicoService
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriBuilder

@RestController
@RequestMapping("/topicos")
class TopicoController(
    private val topicoService: TopicoService
) {

    @GetMapping
    fun listar(): List<TopicoView> {
        return topicoService.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoView{
        return topicoService.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(
        @RequestBody @Valid novoTopicoForm: NovoTopicoForm,
        uri: UriBuilder
                  ): ResponseEntity<TopicoView> {
        val topico = topicoService.cadastrar(novoTopicoForm)
        val uri = uri.path("/topicos/${topico.id}").build()
        return ResponseEntity.created(uri).body(topico)
    }
}