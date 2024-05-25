package br.com.fuctura;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import br.com.fuctura.views.*;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		InputStream input = Aplicacao.class.getClassLoader().getResourceAsStream("config.properties");

		Properties prop = new Properties();

		prop.load(input);

		try {

			Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop);

			Menu menu = new Menu(conn);

			menu.interfaceUsuario();

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}