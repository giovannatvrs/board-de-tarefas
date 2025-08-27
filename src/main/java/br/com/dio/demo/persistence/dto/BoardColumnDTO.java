package br.com.dio.demo.persistence.dto;

import br.com.dio.demo.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id, String name, BoardColumnKindEnum kind, int cardsAmount){

}