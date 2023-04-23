package br.com.alura.forum.mapper

import br.com.alura.forum.dto.CursoView
import br.com.alura.forum.model.Curso
import org.springframework.stereotype.Component

@Component
class CursoViewMapper: Mapper<Curso, CursoView> {
    override fun map(t: Curso): CursoView {
        return CursoView(
            id = t.id,
            nome = t.nome,
            categoria = t.categoria
        )
    }
}