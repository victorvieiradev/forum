package br.com.alura.forum.mapper

import br.com.alura.forum.dto.NovoUsuarioForm
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Component

@Component
class UsuarioFormMapper: Mapper<NovoUsuarioForm, Usuario> {
    override fun map(t: NovoUsuarioForm): Usuario {
        return Usuario(
            nome = t.nome,
            email = t.email
        )
    }
}