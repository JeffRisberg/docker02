USE docker02;

DROP TABLE IF EXISTS incident;

CREATE TABLE incident
(
    id          MEDIUMINT    NOT NULL AUTO_INCREMENT,
    title       VARCHAR(255) NOT NULL,
    description VARCHAR(255) NULL,
    severity    VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO incident(title, description, severity)
VALUES ('Account update required',
        'Click on Update link, follow instructions',
        'Medium');

INSERT INTO incident(title, description, severity)
VALUES ('No response within timeout interval',
        'Check the network wiring, check for firewall configuration',
        'High');

INSERT INTO incident(title, description, severity)
VALUES ('Unable to install new application',
        'Check your password for the Apple App Store',
        'Medium');

DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    id         MEDIUMINT    NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    last_name  VARCHAR(255) NULL,
    PRIMARY KEY (id)
);

INSERT INTO users(first_name, last_name)
VALUES ('Jack', 'Jones');

INSERT INTO users(first_name, last_name)
VALUES ('Luke', 'Skywalker');

INSERT INTO users(first_name, last_name)
VALUES ('Han', 'Solo');

DROP TABLE IF EXISTS messages;

CREATE TABLE messages
(
    id     MEDIUMINT    NOT NULL AUTO_INCREMENT,
    sender VARCHAR(255) NOT NULL,
    text   TEXT NULL,
    PRIMARY KEY (id)
);

INSERT INTO messages(sender, text)
VALUES ('Jack', 'Hello there');

INSERT INTO messages(sender, text)
VALUES ('Jill', 'let\'s fetch some water');

INSERT INTO messages(sender, text)
VALUES ('Jack', 'ok, I will get a pail');

INSERT INTO messages(sender, text)
VALUES ('Jill', 'not that one, it has a hole');
