package br.com.alura.forum.mapper

import br.com.alura.forum.dto.UsuarioView
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Component

@Component
class UsuarioViewMapper: Mapper<Usuario, UsuarioView> {
    override fun map(t: Usuario): UsuarioView {
        return UsuarioView(
                id = t.id,
                nome = t.nome,
                email = t.email
                )
    }
}