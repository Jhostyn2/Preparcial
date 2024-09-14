package umg.principal.service;

import umg.principal.dao.UsuarioDAO;
import umg.principal.dao.UsuarioDAOImpl;
import umg.principal.model.Usuario;

import java.util.List;

public class UsuarioService {

    private UsuarioDAO usuarioDAO;


    public UsuarioService() {
        this.usuarioDAO = new UsuarioDAOImpl();
    }


    public void insertarUsuario(Usuario usuario) {
        usuarioDAO.insertar(usuario);
    }


    public Usuario obtenerUsuarioPorId(int id) {
        return usuarioDAO.obtenerPorId(id);
    }


    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioDAO.obtenerTodos();
    }

    public void actualizarUsuario(Usuario usuario) {
        usuarioDAO.actualizar(usuario);
    }

    public void eliminarUsuario(int id) {
        usuarioDAO.eliminar(id);
    }
}