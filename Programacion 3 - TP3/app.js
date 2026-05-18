function procesarUsuario(nombre, callback) {
    console.log(`Procesando usuario: ${nombre}`);
    callback();
    }

    procesarUsuario("Juan", function() {
    console.log("Usuario procesado");
    });