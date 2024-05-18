INSERT INTO tb_preferencia(name) VALUES ('Esporte'); 
INSERT INTO tb_preferencia(name) VALUES ('Jogo');
INSERT INTO tb_categoria(name) VALUES ('Futebol'); 
INSERT INTO tb_categoria(name) VALUES ('Luta');

INSERT INTO tb_usuario(preferencia_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');
INSERT INTO tb_usuario(preferencia_id, name, email) VALUES (2, 'Bob', 'bob@gmail.com');
INSERT INTO tb_usuario(preferencia_id, name, email) VALUES (3, 'Alex', 'alex@gmail.com'); 
INSERT INTO tb_usuario(preferencia_id, name, email) VALUES (4, 'Ana', 'ana@gmail.com');

INSERT INTO tb_ItemRecomendado(categoria_id, name, descricao) VALUES (1, 'Maria', 'Gosta de PES');
INSERT INTO tb_ItemRecomendado(categoria_id, name, descricao) VALUES (2, 'Bob', 'Gosta de FIFA');
INSERT INTO tb_ItemRecomendado(categoria_id, name, descricao) VALUES (3, 'Alex', 'Gosta de Mortal Kombat'); 
INSERT INTO tb_ItemRecomendado(categoria_id, name, descricao) VALUES (4, 'Ana', 'Gosta de Street Fighter');