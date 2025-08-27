package br.com.dio.demo;

import br.com.dio.demo.persistence.migration.MigrationStrategy;
import br.com.dio.demo.ui.MainMenu;


import java.sql.SQLException;

import static br.com.dio.demo.persistence.config.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }
}
