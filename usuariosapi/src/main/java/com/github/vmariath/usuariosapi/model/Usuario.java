package com.github.vmariath.usuariosapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    // Em casos em que o nome da tabela ou da coluna no banco é diferente do aqui listado, pode se usar o @Table e @Column para identificar e associar a variavel com o nome no BD.

    @Id // Para marcar que essa é a chave primaria da tabela
    private String id;

    private String nomeUsuario;

    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String user) {
        this.nomeUsuario = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", user='" + nomeUsuario + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
