package br.com.dio.demo.service;

import br.com.dio.demo.persistence.dao.BoardColumnDAO;
import br.com.dio.demo.persistence.dao.CardDAO;
import br.com.dio.demo.persistence.dto.CardDetailsDTO;
import br.com.dio.demo.persistence.entity.BoardColumnEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class CardQueryService {
    private final Connection connection;

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var dao = new CardDAO(connection);
        return dao.findById(id);
    }
}
