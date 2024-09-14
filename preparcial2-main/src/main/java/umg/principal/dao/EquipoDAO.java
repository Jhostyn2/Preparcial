package umg.principal.dao;

import umg.principal.model.Equipo;

import java.util.List;

public interface EquipoDAO {
    /**
     * Inserta un nuevo registro de Equipo en la base de datos.
     *
     * @param equipo El objeto Equipo a insertar.
     */
    void insertar(Equipo equipo);

    /**
     * Obtiene un registro de Equipo por su ID.
     *
     * @param id El ID del registro a obtener.
     * @return El objeto Equipo correspondiente al ID proporcionado, o null si no se encuentra.
     */
    Equipo obtenerPorId(int id);

    /**
     * Obtiene todos los registros de Equipo de la base de datos.
     *
     * @return Una lista de objetos Equipo.
     */
    List<Equipo> obtenerTodos();

    /**
     * Actualiza un registro de Equipo en la base de datos.
     *
     * @param equipo El objeto Equipo con la información actualizada.
     */
    void actualizar(Equipo equipo);

    /**
     * Elimina un registro de Equipo de la base de datos por su ID.
     *
     * @param id El ID del registro a eliminar.
     */
    void eliminar(int id);
}
