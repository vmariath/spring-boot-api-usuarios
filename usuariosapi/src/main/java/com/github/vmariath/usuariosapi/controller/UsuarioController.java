package com.github.vmariath.usuariosapi.controller;


import com.github.vmariath.usuariosapi.model.Usuario;
import com.github.vmariath.usuariosapi.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController //Marca a classe para ser um controller REST
@RequestMapping("usuarios") //URL base do controller
public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario){
        System.out.println("Usuário salvo" + usuario);
        var id = UUID.randomUUID().toString();
        usuario.setId(id);
        usuarioRepository.save(usuario);
        return usuario;
    }
    @GetMapping("{id}")
    public Usuario obterPorId(@PathVariable("id") String id){
        return usuarioRepository.findById(id).orElse(null);
    }
    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") String id){
        usuarioRepository.deleteById(id);

    }
    @PutMapping("{id}")
    public void atualizar(@PathVariable("id")String id, @RequestBody Usuario usuario){
        usuario.setId(id);
        usuarioRepository.save(usuario);

    }
    @GetMapping
    public List<Usuario> buscar(@RequestParam("nomeUsuario")String nomeUsuario){
       return usuarioRepository.findByNomeUsuario(nomeUsuario);
    }
}
