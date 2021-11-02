CREATE TABLE IF NOT EXISTS clause
(
    clause_id SERIAL PRIMARY KEY,
    name_card VARCHAR(50),
    cost_service INTEGER NOT NULL,
    min_cost INTEGER NOT NULL,
    max_cost INTEGER NOT NULL,
    min_balance INTEGER NOT NULL,
    persentage REAL NOT NULL
);


CREATE TABLE IF NOT EXISTS category
(
    category_id SERIAL PRIMARY KEY,
    clause_id INTEGER,
    name_card VARCHAR(50),
    supermarket REAL NOT NULL,
    transport REAL NOT NULL,
    fuelling REAL NOT NULL,
    restaurant REAL NOT NULL,
    clothes_shoes REAL NOT NULL,
    house_repair REAL NOT NULL,
    entertainment REAL NOT NULL,
    pharmacy REAL NOT NULL,
    beauty REAL NOT NULL,
    mobile REAL NOT NULL,
    FOREIGN KEY (clause_id) REFERENCES clause(clause_id)
);