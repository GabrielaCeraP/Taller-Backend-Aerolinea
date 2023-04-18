package edu.unimagdalena.pw.aerolinia.Entidades;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="usuarios")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Usuario{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false)
    private String nombreCompleto;

    @Column(nullable = false)
    private String nombreUsuario;

    @Column(nullable = false)
    private String contraseña;

    @OneToMany (mappedBy = "cliente")
    private Set<Reserva> reservas;

    

    public Usuario(Long id, String nombreCompleto, String nombreUsuario, String contraseña) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }



    public Usuario UpdateWidth(Usuario oldUsuario ){
        return new Usuario(this.id, oldUsuario.getNombreCompleto(), oldUsuario.getNombreUsuario(), oldUsuario.getContraseña(), oldUsuario.getReservas());
    }


}
