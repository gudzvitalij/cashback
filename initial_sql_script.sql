CREATE DATABASE cashback;

DROP TABLE IF EXISTS clause;
DROP TABLE IF EXISTS category;


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

INSERT INTO clause (name_card,cost_service,min_cost,max_cost,min_balance,persentage)
VALUES ('Билайн Альфа-банк','0', '10000','100000','10000','0.04');
INSERT INTO clause (name_card,cost_service,min_cost,max_cost,min_balance,persentage)
VALUES ('ВостОк','0', '10000','1000000','50000','0.055');
INSERT INTO clause (name_card,cost_service,min_cost,max_cost,min_balance,persentage)
VALUES ('Кэшбэк Райффайзенбанк','0', '0','180000000','0','0');
INSERT INTO clause (name_card,cost_service,min_cost,max_cost,min_balance,persentage)
VALUES ('Универсальная СКБ-банк','0', '15000','60000','30000','0.0375');
INSERT INTO clause (name_card,cost_service,min_cost,max_cost,min_balance,persentage)
VALUES ('Opencard Открытие','0', '10000','150000','0','0.04');

INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('1','Билайн Альфа-банк','0.05','0.01','0.01','0.01','0.01','0.01','0.01','0.01','0.01','0.05');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('2','ВостОк','0.02','0.02','0.02','0.02','0.02','0.02','0.02','0.02','0.02','0.02');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('3','Кэшбэк Райффайзенбанк','0.015','0.015','0.015','0.015','0.015','0.015','0.015','0.015','0.015','0');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('4','Универсальная СКБ-банк','0.03','0.01','0','0','0.04','0.01','0.05','0','0','0');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('4','Универсальная СКБ-банк','0.03','0.05','0','0','0.04','0.01','0.01','0','0','0');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('4','Универсальная СКБ-банк','0.03','0.01','0','0','0.01','0.04','0.05','0','0','0');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('4','Универсальная СКБ-банк','0.03','0.05','0','0','0.01','0.04','0.01','0','0','0');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('4','Универсальная СКБ-банк','0','0.01','0','0.03','0.04','0.01','0.05','0','0','0');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('4','Универсальная СКБ-банк','0','0.05','0','0.03','0.04','0.01','0.01','0','0','0');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('4','Универсальная СКБ-банк','0','0.01','0','0.03','0.01','0.04','0.05','0','0','0');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('4','Универсальная СКБ-банк','0','0.05','0','0.03','0.01','0.04','0.01','0','0','0');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('4','Универсальная СКБ-банк','0','0.01','0.03','0','0.04','0.01','0.05','0','0','0');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('4','Универсальная СКБ-банк','0','0.05','0.03','0','0.04','0.01','0.01','0','0','0');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('4','Универсальная СКБ-банк','0','0.01','0.03','0','0.01','0.04','0.05','0','0','0');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('4','Универсальная СКБ-банк','0','0.05','0.03','0','0.01','0.04','0.01','0','0','0');
INSERT INTO category (clause_id,name_card,supermarket,transport,fuelling,restaurant,clothes_shoes,house_repair,entertainment,pharmacy,beauty,mobile)
VALUES ('5','Opencard Открытие','0.02','0.02','0.02','0.02','0.02','0.02','0.02','0.02','0.02','0');