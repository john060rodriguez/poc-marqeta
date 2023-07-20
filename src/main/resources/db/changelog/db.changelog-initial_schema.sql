--liquibase formatted sql

--changeset johnRodriguez:1
--initial table account
CREATE TABLE account (
    account_id SERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL,
    card_id BIGINT NOT NULL,
    account_balance DECIMAL(10,2) NOT NULL,
    reservation_balance DECIMAL(10,2) NOT NULL
);
