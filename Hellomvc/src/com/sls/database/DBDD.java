package com.sls.database;

import java.util.ArrayList;
import com.sls.models.Room;
import com.sls.models.Usuario;

public class DBDD {
	
	private static DBDD instance=null;

	public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	public ArrayList<Room> habitaciones = new ArrayList<Room>();
	
	
	public static final DBDD getinstance() { /*Este es el singleton*/
		if(instance==null) {instance= new DBDD();}
		
		return instance;
		
		
	}

	public DBDD() {

		this.fillUsuarios();

		this.fillhabitaciones();

		this.relacionarUSerHab();

	}

	private boolean fillUsuarios() {

		usuarios.add(new Usuario(0, "pepito", "pepitopalotes@gmail.com", null,"puta"));

		usuarios.add(new Usuario(1, "luista", "luisalotes@gmail.com", null,"puta"));

		usuarios.add(new Usuario(2, "Peter Parker", "peterparker@gmail.com", null,"puta"));

		return true;

	}

	private boolean fillhabitaciones() {

		habitaciones.add(new Room(101, "Gran via 59", 200));

		habitaciones.add(new Room(202, "Paseo de la Castellana 62", 280));

		habitaciones.add(new Room(303, "Calle Princesa 31", 300));

		return true;

	}

	private boolean relacionarUSerHab() {

		usuarios.get(0).setRoom(habitaciones.get(2));

		usuarios.get(1).setRoom(habitaciones.get(1));

		usuarios.get(2).setRoom(habitaciones.get(0));

		return true;

	}

	/*
	 * Metodo que en funcion del id, devuelve un objeto usuario concreto Si no
	 * existe devuelve null
	 */
	public Usuario getUsuariobyid(int id) {

		Usuario usuarioadevolver = null;

		for (Usuario unUsuario : usuarios) {
			if (unUsuario.getId() == id) {
				usuarioadevolver = unUsuario;
				break;
			}

		}

		return usuarioadevolver;

	}
	
	public Room getHabitacionbyhid(int hid) {

		Room habitacionadevolver = null;

		for (Room unaHabitacion : habitaciones) {
			if (unaHabitacion.getHid() == hid) {
				habitacionadevolver = unaHabitacion;
				break;
			}

		}

		return habitacionadevolver;

	}

	public boolean dameusuariopormailypass(String emailr, String passwordr) {
		
		boolean existeusuario=false;

		for (Usuario unUsuario : usuarios) {
			if ((unUsuario.getEmail().equals(emailr)&&(unUsuario.getPassword().equals(passwordr)))) {
				
				existeusuario=true;
				break;
			}
			

		}
		return existeusuario;


		
	}

	public int insertausuario(Usuario newuser) {
		
		int nuevoId=0;
		
		nuevoId=this.usuarios.size()+1;//.size tama�o de la variable*/
		newuser.setId(nuevoId);
		this.usuarios.add(newuser);
		
		
		return nuevoId;

		
	}

	public int insertahabitacion(Room nuevoroom) {
		// TODO Auto-generated method stub
		int nuevoId=0;
		
		nuevoId=this.habitaciones.size()+1;
		nuevoroom.setHid(nuevoId);
		this.habitaciones.add(nuevoroom);
		
		
		return nuevoId;
	}
	
	
	
	
	
	
	
	
	
}