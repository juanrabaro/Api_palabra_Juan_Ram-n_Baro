CREATE TABLE IF NOT EXISTS `funciona`.`Equipo` (
                                                   `id_equipo` INT NOT NULL AUTO_INCREMENT,
                                                   `name_equipo` VARCHAR(45) NOT NULL DEFAULT 'nombre-por-defecto',
    `badge_equipo` VARCHAR(45) NOT NULL DEFAULT 'badge-equipo-por-defecto',
    `score_equipo` INT NOT NULL DEFAULT 0,
    PRIMARY KEY (`id_equipo`),
    UNIQUE INDEX `idTabla2_UNIQUE` (`id_equipo` ASC) VISIBLE)
    ENGINE = InnoDB;
CREATE TABLE IF NOT EXISTS `funciona`.`Jugador` (
                                                    `id_jugador` INT NOT NULL AUTO_INCREMENT,
                                                    `score_jugador` INT NOT NULL DEFAULT 0,
                                                    `user_jugador` VARCHAR(45) NOT NULL DEFAULT 'user-por-defecto',
    `avatar_img` VARCHAR(255) NOT NULL DEFAULT '',
    `Equipo_id_equipo` INT NOT NULL,
    PRIMARY KEY (`id_jugador`, `Equipo_id_equipo`),
    UNIQUE INDEX `idPrueba_UNIQUE` (`id_jugador` ASC) VISIBLE,
    INDEX `fk_Jugador_Equipo1_idx` (`Equipo_id_equipo` ASC) VISIBLE,
    CONSTRAINT `fk_Jugador_Equipo1`
    FOREIGN KEY (`Equipo_id_equipo`)
    REFERENCES `funciona`.`Equipo` (`id_equipo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;
CREATE TABLE IF NOT EXISTS `funciona`.`Juego` (
                                                  `id_juego` INT NOT NULL AUTO_INCREMENT,
                                                  `difficulty_j` VARCHAR(45) NOT NULL DEFAULT 'easy',
    `description` VARCHAR(45) NOT NULL DEFAULT 'descripcion por defecto',
    `max_tries` INT NOT NULL DEFAULT 10,
    PRIMARY KEY (`id_juego`),
    UNIQUE INDEX `id_juego_UNIQUE` (`id_juego` ASC) VISIBLE)
    ENGINE = InnoDB;
CREATE TABLE IF NOT EXISTS `funciona`.`Partida` (
                                                    `id_partida` INT NOT NULL AUTO_INCREMENT,
                                                    `score_partida` INT NOT NULL DEFAULT 0,
                                                    `n_try` INT NOT NULL DEFAULT 0,
                                                    `word` VARCHAR(45) NOT NULL DEFAULT '',
    `datetime` DATETIME NULL,
    `Jugador_id_jugador` INT NOT NULL,
    `Jugador_Equipo_id_equipo` INT NOT NULL,
    `Juego_id_juego` INT NOT NULL,
    PRIMARY KEY (`id_partida`, `Jugador_id_jugador`, `Jugador_Equipo_id_equipo`, `Juego_id_juego`),
    UNIQUE INDEX `id_partida_UNIQUE` (`id_partida` ASC) VISIBLE,
    INDEX `fk_Partida_Jugador1_idx` (`Jugador_id_jugador` ASC, `Jugador_Equipo_id_equipo` ASC) VISIBLE,
    INDEX `fk_Partida_Juego1_idx` (`Juego_id_juego` ASC) VISIBLE,
    CONSTRAINT `fk_Partida_Jugador1`
    FOREIGN KEY (`Jugador_id_jugador` , `Jugador_Equipo_id_equipo`)
    REFERENCES `funciona`.`Jugador` (`id_jugador` , `Equipo_id_equipo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_Partida_Juego1`
    FOREIGN KEY (`Juego_id_juego`)
    REFERENCES `funciona`.`Juego` (`id_juego`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;
CREATE TABLE IF NOT EXISTS `funciona`.`Palabra` (
                                                    `id_palabra` INT NOT NULL AUTO_INCREMENT,
                                                    `palabra` VARCHAR(45) NOT NULL DEFAULT '',
    PRIMARY KEY (`id_palabra`),
    UNIQUE INDEX `id_palabra_UNIQUE` (`id_palabra` ASC) VISIBLE)
    ENGINE = InnoDB;
CREATE TABLE IF NOT EXISTS `funciona`.`Juego_Palabra_DifficultyP` (
                                                                      `Juego_id_juego` INT NOT NULL,
                                                                      `Palabra_id_palabra` INT NOT NULL,
                                                                      `difficulty_p` VARCHAR(45) NOT NULL DEFAULT 'easy',
    PRIMARY KEY (`Juego_id_juego`, `Palabra_id_palabra`),
    INDEX `fk_Juego_has_Palabra_Palabra1_idx` (`Palabra_id_palabra` ASC) VISIBLE,
    INDEX `fk_Juego_has_Palabra_Juego1_idx` (`Juego_id_juego` ASC) VISIBLE,
    CONSTRAINT `fk_Juego_has_Palabra_Juego1`
    FOREIGN KEY (`Juego_id_juego`)
    REFERENCES `funciona`.`Juego` (`id_juego`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_Juego_has_Palabra_Palabra1`
    FOREIGN KEY (`Palabra_id_palabra`)
    REFERENCES `funciona`.`Palabra` (`id_palabra`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;