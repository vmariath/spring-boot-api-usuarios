package com.github.vmariath.usuariosapi.repository;

import com.github.vmariath.usuariosapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    List<Usuario> findByNomeUsuario(String nomeUsuario);
}
