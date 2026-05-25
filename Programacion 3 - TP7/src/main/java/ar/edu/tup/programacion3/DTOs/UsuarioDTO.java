package ar.edu.tup.programacion3.DTOs;

public record UsuarioDTO(Long id, String nombre, String apellido, String email) {

    public UsuarioDTO usuarioDTO() {
        return new UsuarioDTO(id, nombre, apellido, email);
    }


}
