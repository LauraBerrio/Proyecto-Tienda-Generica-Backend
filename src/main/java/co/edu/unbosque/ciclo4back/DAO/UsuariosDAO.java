package co.edu.unbosque.ciclo4back.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.ciclo4back.modelo.Usuarios;

public interface UsuariosDAO extends JpaRepository<Usuarios, Long> {

}
