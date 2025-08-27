--liquibase formatted sql

--changeset giovanna:2025081301
--comment: boards table create

CREATE TABLE  IF NOT EXISTS BOARDS(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL
)ENGINE=InnoDB;