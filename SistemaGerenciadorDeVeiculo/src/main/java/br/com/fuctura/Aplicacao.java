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

        Properties prop = new Properties();

        // Carrega as propriedades do arquivo config.properties
        try (InputStream input = Aplicacao.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input != null) {
                prop.load(input);
            }
        }

        // Substitui as propriedades com variáveis de ambiente, se estiverem definidas
        String dbUrl = System.getenv().getOrDefault("DATABASE_URL", prop.getProperty("url"));
        String dbUser = System.getenv().getOrDefault("DATABASE_USER", prop.getProperty("user"));
        String dbPassword = System.getenv().getOrDefault("DATABASE_PASSWORD", prop.getProperty("password"));

        try {
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            Menu menu = new Menu(conn);

            menu.interfaceUsuario();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}