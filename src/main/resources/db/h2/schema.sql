DROP TABLE users IF EXISTS;
DROP TABLE roles IF EXISTS;

CREATE TABLE users (
    id      INTEGER IDENTITY PRIMARY KEY,
    name    VARCHAR(30),
    email   VARCHAR(30)
);
CREATE INDEX users_name ON users (name);

CREATE TABLE roles (
    id      INTEGER IDENTITY PRIMARY KEY,
    name    VARCHAR(80)
);
CREATE INDEX roles_name ON roles (name);
