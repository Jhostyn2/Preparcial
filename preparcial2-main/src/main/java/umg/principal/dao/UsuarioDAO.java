package umg.principal.dao;

import umg.principal.model.Usuario;

import java.util.List;

public interface UsuarioDAO {

    /**
     * Inserta un nuevo usuario en la base de datos.
     *
     * @param usuario el objeto Usuario a insertar
     */
    void insertar(Usuario usuario);

    /**
     * Obtiene un usuario a partir de su ID.
     *
     * @param id el ID del usuario a obtener
     * @return el objeto Usuario correspondiente al ID
     */
    Usuario obtenerPorId(int id);

    /**
     * Obtiene una lista de todos los usuarios.
     *
     * @return una lista de objetos Usuario
     */
    List<Usuario> obtenerTodos();

    /**
     * Actualiza los detalles de un usuario existente.
     *
     * @param usuario el objeto Usuario con los datos actualizados
     */
    void actualizar(Usuario usuario);

    /**
     * Elimina un usuario a partir de su ID.
     *
     * @param id el ID del usuario a eliminar
     */
    void eliminar(int id);
}
