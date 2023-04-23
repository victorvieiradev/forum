package br.com.alura.forum.service

import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.mapper.TopicoFormMapper
import br.com.alura.forum.mapper.TopicoViewMapper
import br.com.alura.forum.model.Topico
import org.springframework.stereotype.Service

@Service
class TopicoService(
    private val topicoViewMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMapper
){
    fun listar(): List<Topico> {

    }

    fun buscarPorId(id: Long): Topico {

    }

    fun cadastrar(novoTopicoForm: NovoTopicoForm): Topico {

    }
}