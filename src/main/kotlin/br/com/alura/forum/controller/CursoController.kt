package br.com.alura.forum.controller

import br.com.alura.forum.model.Curso
import br.com.alura.forum.service.CursoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cursos")
class CursoController(
    private val cursoService: CursoService
){
    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Curso {
        return cursoService.buscarPorId(id)
    }
}