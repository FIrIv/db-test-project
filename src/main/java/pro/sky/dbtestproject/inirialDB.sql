CREATE TABLE author (
                        id SERIAL UNIQUE,
                        name VARCHAR(100) NOT NULL
);

CREATE TABLE book(
                     id SERIAL UNIQUE,
                     name VARCHAR(100) NOT NULL,
                     author_id INTEGER REFERENCES author(id)
);

INSERT INTO author (id, name) VALUES (1, 'Александр Пушкин');
INSERT INTO author (id, name) VALUES (2, 'Лев Толстой');
INSERT INTO author (id, name) VALUES (3, 'Алексей Толстой');

INSERT INTO book (id, name, author_id) VALUES (1, 'Руслан и Людмила', 1);
INSERT INTO book (id, name, author_id) VALUES (2, 'Похождения Невзорова, или Ибикус', 3);
INSERT INTO book (id, name, author_id) VALUES (3, 'Хромой барин', 3);
INSERT INTO book (id, name, author_id) VALUES (4, 'Война и мир', 2);
INSERT INTO book (id, name, author_id) VALUES (5, 'Евгений Онегин', 1);