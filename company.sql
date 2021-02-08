CREATE DATABASE IF NOT EXISTS `company`;
USE `company`;

CREATE TABLE `tb_emp`(
	`id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) DEFAULT NULL,
    `gender` VARCHAR(255) DEFAULT NULL,
    `department` VARCHAR(255) DEFAULT NULL,
    `dob` DATE DEFAULT NULL,
    PRIMARY KEY(`id`)
);

INSERT INTO `tb_emp` (`id`, `name`, `gender`, `department`, `dob`) VALUES('3','Mukund Madhav','Male','React','1998-04-02');

INSERT INTO `tb_emp` (`id`, `name`, `gender`, `department`, `dob`) VALUES('4','d','a','a','1998-04-02');