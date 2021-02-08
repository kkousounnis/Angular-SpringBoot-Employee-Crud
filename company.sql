CREATE DATABASE IF NOT EXISTS `mycompany`;
USE `mycompany`;

CREATE TABLE `tb_emp`(
	`id` INT NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(255) DEFAULT NULL,
    `last_name` VARCHAR(255) DEFAULT NULL,
    `email_id` VARCHAR(255) DEFAULT NULL,
    PRIMARY KEY(`id`)
);

INSERT INTO `tb_emp` (`id`, `first_name`, `last_name`, `email_id`) VALUES('1','Mukund ','Madhav','mukund@gmail.com');
INSERT INTO `tb_emp` (`id`, `first_name`, `last_name`, `email_id`) VALUES('2','Ali ','Alentai','ali@gmail.com');