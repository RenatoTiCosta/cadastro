INSERT INTO cliente_entity (id, nome, email, telefone)
VALUES
       (1, 'Maria', 'maria@gmail.com', '21-11111-1111'),
       (2, 'João', 'joao@gmail.com', '21-22222-2222'),
       (3, 'Ana', 'ana@gmail.com', '21-33333-3333'),
       (4, 'Pedro', 'pedro@gmail.com', '21-44444-4444'),
       (5, 'Carla', 'carla@gmail.com', '21-55555-5555'),
       (6, 'Fernando', 'fernando@gmail.com', '21-66666-6666'),
       (7, 'Laura', 'laura@gmail.com', '21-77777-7777'),
       (8, 'Mariano', 'mariano@gmail.com', '21-88888-8888'),
       (9, 'Paula', 'paula@gmail.com', '21-99999-9999'),
       (10, 'Ricardo', 'ricardo@gmail.com', '21-10101-0101');

INSERT INTO projeto.usuario_entity (id, nome, telefone, email, senha)
VALUES
       (1, 'Maria', '21-11111-1111', 'maria@gmail.com', 'senha1'),
       (2, 'João', '21-22222-2222', 'joao@gmail.com', 'senha2'),
       (3, 'Ana', '21-33333-3333', 'ana@gmail.com', 'senha3'),
       (4, 'Pedro', '21-44444-4444', 'pedro@gmail.com', 'senha4'),
       (5, 'Carla', '21-55555-5555', 'carla@gmail.com', 'senha5'),
       (6, 'Fernando', '21-66666-6666', 'fernando@gmail.com', 'senha6'),
       (7, 'Laura', '21-77777-7777', 'laura@gmail.com', 'senha7'),
       (8, 'Mariano', '21-88888-8888', 'mariano@gmail.com', 'senha8'),
       (9, 'Paula', '21-99999-9999', 'paula@gmail.com', 'senha9'),
       (10, 'Ricardo', '21-10101-0101', 'ricardo@gmail.com', 'senha10');


INSERT INTO projeto.atendimento_entity (id, nome, email, telefone, endereco, cpf, tipo, olho_Direito, olho_Esquerdo, dp_Olho_Direito, dP_Olho_Esquerdo, adicao, lentes, exame, valor, `data`)
VALUES
       (1, 'Maria', 'maria@gmail.com', '21-11111-1111', 'Endereço 1', '12345678900', 'Multifocal', '-1.00', '- 1.50', '30', '30', '+ 1.50', 'Solar com Ar', 'Data do Exame 1', 100, '2023-07-01'),
       (2, 'João', 'joao@gmail.com', '21-22222-2222', 'Endereço 2', '98765432100', 'Longe', '-7.50', '-2.00', '31', '30', 'Não', 'Resina com Ar', 'Data do Exame 2', 150, '2023-07-02'),
       (3, 'Ana', 'ana@gmail.com', '21-33333-3333', 'Endereço 3', '45678912300', 'Perto', '+2.50', '+3.25', '29', '29', 'Não', 'Poli Anti-blue', 'Data do Exame 3', 200, '2023-07-03'),
       (4, 'Pedro', 'pedro@gmail.com', '21-44444-4444', 'Endereço 4', '78912345600', 'Multifocal', '-1.50', '-1.50', '32', '32', '+ 1.75', 'Solar com Ar', 'Data do Exame 4', 120, '2023-07-04'),
       (5, 'Carla', 'carla@gmail.com', '21-55555-5555', 'Endereço 5', '65478932100', 'Longe', '-0.75', '-0.75', '31.5', '31.5', 'Não', 'Resina com Ar', 'Data do Exame 5', 160, '2023-07-05'),
       (6, 'Fernando', 'fernando@gmail.com', '21-66666-6666', 'Endereço 6', '98765412300', 'Perto', '+2.50', '+2.50', '30.5', '30.5', 'Não', 'Poli Anti-blue', 'Data do Exame 6', 180, '2023-07-06'),
       (7, 'Laura', 'laura@gmail.com', '21-77777-7777', 'Endereço 7', '32165498700', 'Multifocal', '-1.25', '-1.25', '30.5', '30.5', '+ 1.50', 'Solar com Ar', 'Data do Exame 7', 110, '2023-07-07'),
       (8, 'Mariano', 'mariano@gmail.com', '21-88888-8888', 'Endereço 8', '65432178900', 'Longe', '-2.75', '-2.75', '33', '33', 'Não', 'Resina com Ar', 'Data do Exame 8', 140, '2023-07-08'),
       (9, 'Paula', 'paula@gmail.com', '21-99999-9999', 'Endereço 9', '32198765400', 'Perto', '+1.75', '+1.75', '29.5', '29.5', 'Não', 'Poli Anti-blue', 'Data do Exame 9', 220, '2023-07-09'),
       (10, 'Ricardo', 'ricardo@gmail.com', '21-10101-0101', 'Endereço 10', '98732165400', 'Multifocal', '-1.75', '-1.75', '32.5', '32.5', '+ 1.75', 'Solar com Ar', 'Data do Exame 10', 130, '2023-07-10');
