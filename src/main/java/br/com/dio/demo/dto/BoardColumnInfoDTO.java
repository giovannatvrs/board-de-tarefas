package br.com.dio.demo.dto;

import br.com.dio.demo.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
