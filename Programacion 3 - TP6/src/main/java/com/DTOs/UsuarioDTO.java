package ProyectoFinal.DTOs;

import ProyectoFinal.Enums.Rol;

public record UsuarioDTO(Long id, String nombre, String apellido, String email) {

    public UsuarioDTO usuarioDTO() {
        return new UsuarioDTO(id, nombre, apellido, email);
    }


}
