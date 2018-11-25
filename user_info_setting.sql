create table users(
      username VARCHAR(50) COLLATE UTF8_GENERAL_CI not null primary key,
      password VARCHAR(100) COLLATE UTF8_GENERAL_CI not null,
      enabled boolean not null);

INSERT INTO users (
    username,
    password,
    enabled
) VALUES (
    'subaru',
    '$2a$10$k2N8ogjJYsVFEFpNHP8SKOqkIR.d5B51JMsLcN.09KqDjtefoiMua',
    true
);

create table authorities (
    username VARCHAR(50) COLLATE UTF8_GENERAL_CI not null,
    authority VARCHAR(50) COLLATE UTF8_GENERAL_CI not null,
    constraint fk_authorities_users foreign key(username) references users(username));
    create unique index ix_auth_username on authorities (username,authority);

INSERT INTO authorities (
    username,
    authority
) VALUES (
    'subaru',
    'USER'
);
