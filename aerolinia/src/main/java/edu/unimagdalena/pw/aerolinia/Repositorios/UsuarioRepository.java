package edu.unimagdalena.pw.aerolinia.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unimagdalena.pw.aerolinia.Entidades.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
