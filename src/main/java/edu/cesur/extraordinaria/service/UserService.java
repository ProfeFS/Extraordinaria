package edu.cesur.extraordinaria.service;

import edu.cesur.extraordinaria.dao.UserDAO;
import edu.cesur.extraordinaria.exceptions.InvalidCredentialsException;
import edu.cesur.extraordinaria.model.User;

/*
 * Esta clase "UserService" utiliza a un objeto de la clase UserDAO para
 * resolver las funcionalidades. debes desarrollar los métodos necesarios,
 * Puedes usar los mismos nombres que la clase DAO.
 */

public class UserService {

	private User user;

	private UserDAO userDAO; // usar este atributo para desarrollar los métodos encargados de las operaciones
	// con la bdd

	// recuerda que la clase DAO es la encargada de realizar todas las opieraciones
	// con la bdd

	public UserService() {
		// aquí inicializa el atributo userDAO para poder ejecutar las operaciones con
		// la BDD
	}

	// se recomienda implementar este método para obtener el usuario por username y
	// luego si no la respuesta no es null, seguir conlas validaciones para la
	// contraseña. No olvidar la lógica para lanbzar la excepción personalizada
	public boolean validateCredentials(String username, String password) {
		return false; // no olvidar cambiar el return según la lógica utilizada.
	}

	// Ejemplo
	public void updateUsere(User user) {
		userDAO.updateUser(user);
	}

	// desarrolla el resto de los métodos que necesites.

}
