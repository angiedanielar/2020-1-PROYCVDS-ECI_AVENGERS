package edu.eci.cvds.persistence;

import java.util.List;
import java.sql.Date;
import java.lang.String;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.PalabraClave;
import edu.eci.cvds.entities.Reporte; 

public interface IniciativaDAO {

	public List<Iniciativa> consularIniciativas()  throws PersistenceException;

	public Iniciativa consultarIniciativa(String correo) throws PersistenceException;
	
	public Iniciativa consultarIniciativaArea(String area) throws PersistenceException;
	
	public void agregarIniciativa(String nombre, String descripcion, String area, String usuario) throws PersistenceException;
	
	public List<Reporte>  agruparIniciativas() throws PersistenceException;
	
	//public void agregarPalabraClave(String palabraClave) throws PersistenceException;
	
	//public void agregarPCIniciativa() throws PersistenceException;
	
	//public List<PalabraClave> consultarPalabrasClave(String id_iniciativa) throws PersistenceException;
	
	//public List<PalabraClave> consultarPalabrasClaves() throws PersistenceException;
	
	public void actualizarIniciativaEstado(String estado, String correo) throws PersistenceException;

}
