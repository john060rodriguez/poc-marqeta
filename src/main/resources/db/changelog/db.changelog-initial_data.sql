--liquibase formatted sql

--changeset johnRodriguez:2
--initial data
INSERT INTO account (user_id, card_id, account_balance, reservation_balance) VALUES
(1, 1001, 1000.00, 0.00),
(2, 1002, 2000.00, 50.00),
(3, 1003, 3000.00, 100.00);