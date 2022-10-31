SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

DROP SCHEMA IF EXISTS `filmedb` ;

CREATE SCHEMA IF NOT EXISTS `filmedb` DEFAULT CHARACTER SET utf8 ;
USE `filmedb` ;

CREATE TABLE IF NOT EXISTS `filmedb`.`Filme` (
  `id` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  `descricao` VARCHAR(45) NULL,
  `ano` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

insert into filme values(1, 'Filme 1', 'Descrição', 1998);
insert into filme values(2, 'Filme 2', 'Descrição', 1998);
insert into filme values(3, 'Filme 3', 'Descrição', 1998);
insert into filme values(4, 'Filme 4', 'Descrição', 1998);
insert into filme values(5, 'Filme 5', 'Descrição', 1998);
insert into filme values(6, 'Filme 6', 'Descrição', 1998);
insert into filme values(7, 'Filme 7', 'Descrição', 1998);
insert into filme values(8, 'Filme 8', 'Descrição', 1998);
insert into filme values(9, 'Filme 9', 'Descrição', 1998);
insert into filme values(10, 'Filme 10', 'Descrição', 1998);
insert into filme values(11, 'Filme 11', 'Descrição', 1998);
insert into filme values(12, 'Filme 12', 'Descrição', 1998);
insert into filme values(13, 'Filme 13', 'Descrição', 1998);
insert into filme values(14, 'Filme 14', 'Descrição', 1998);
insert into filme values(15, 'Filme 15', 'Descrição', 1998);
insert into filme values(16, 'Filme 16', 'Descrição', 1998);
insert into filme values(17, 'Filme 17', 'Descrição', 1998);
insert into filme values(18, 'Filme 18', 'Descrição', 1998);
insert into filme values(19, 'Filme 19', 'Descrição', 1998);
insert into filme values(20, 'Filme 20', 'Descrição', 1998);
