/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Usuario;
import java.util.List;

public interface UsuarioDAO {
	
	public List<Usuario> cargarTodosLosUsuarios() throws PersistenceException;

    public Usuario consultarUsuario(String correo) throws PersistenceException;
	
	public Usuario obtenerUsuarioLog(String correo, String clave) throws PersistenceException;

}