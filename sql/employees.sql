USE my_db;

CREATE TABLE users (
  username varchar(15),
  password varchar(100),
  enabled tinyint(1),
  PRIMARY KEY (username)
) ;

CREATE TABLE authorities (
  username varchar(15),
  authority varchar(25),
  FOREIGN KEY (username) references users(username)
) ;

INSERT INTO my_db.users (username, password, enabled)
VALUES
	('hryhorii', '{noop}hryhorii', 1),
	('olena', '{noop}olena', 1),
	('mykola', '{noop}mykola', 1);
    
INSERT INTO my_db.authorities (username, authority)
VALUES
	('hryhorii', 'ROLE_EMPLOYEE'),
	('olena', 'ROLE_HR'),
    ('mykola', 'ROLE_HR'),
	('mykola', 'ROLE_MANAGER');
    
    