INSERT INTO Jugador (score_jugador, user_jugador, avatar_img, Equipo_id_equipo) VALUES (0, 'Juan', '', 1);

INSERT INTO Partida (score_partida, n_try, word, datetime, Jugador_id_jugador, Jugador_Equipo_id_equipo, Juego_id_juego) VALUES (2, 3, 'aba', DATE('2023-12-31 01:02:03') , 1, 1, 1);
INSERT INTO Partida (score_partida, n_try, word, datetime, Jugador_id_jugador, Jugador_Equipo_id_equipo, Juego_id_juego) VALUES (3, 2, 'abacero', DATE('2024-12-31 01:02:03'), 1, 1, 1);


UPDATE Jugador
SET score_jugador = (
    SELECT SUM(score_partida)
    FROM Partida
    WHERE Jugador_id_jugador = 1
)
WHERE id_jugador = 1;

UPDATE Jugador
SET avatar_img = 'img1'
WHERE id_jugador = 1;


ALTER TABLE Partida DROP FOREIGN KEY fk_Partida_Jugador1;
ALTER TABLE Jugador MODIFY COLUMN id_jugador INTEGER;
ALTER TABLE Partida ADD CONSTRAINT fk_Partida_Jugador1 FOREIGN KEY (Jugador_id_jugador) REFERENCES Jugador(id_jugador);

select * from Partida;
select * from Jugador;
select * from Equipo;