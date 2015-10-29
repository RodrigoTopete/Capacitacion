CREATE USER 'universidadusr'@'%' identified by '1234';
GRANT ALL ON universidad.* TO 'universidadusr'@'%';
CREATE USER 'universidadusr'@'localhost' identified by '1234';
FLUSH PRIVILEGES;