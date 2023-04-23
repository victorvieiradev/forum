package br.com.alura.forum.mapper

import br.com.alura.forum.dto.NovoCursoForm
import br.com.alura.forum.model.Curso
import org.springframework.stereotype.Component

@Component
class CursoFormMapper : Mapper<NovoCursoForm, Curso> {
    override fun map(t: NovoCursoForm): Curso {
        return Curso(
            nome = t.nome,
            categoria = t.categoria
        )
    }
}