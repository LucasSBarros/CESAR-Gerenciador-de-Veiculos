CREATE TABLE Loja (
    codigo_loja serial, 
    nome VARCHAR(255) NOT NULL,
    telefone VARCHAR(10) NOT NULL,
    PRIMARY KEY (codigo_loja)
);


CREATE TABLE Cliente (
    codigo_cliente serial, 
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    celular VARCHAR(11) NOT NULL,
    PRIMARY KEY (codigo_cliente)
);


CREATE TABLE Endereco (
	codigo_endereco serial,
	codigo_loja INT UNIQUE,
	codigo_cliente INT UNIQUE,
	cep VARCHAR(255) NOT NULL,
	logradouro VARCHAR(255) NOT NULL,
	complemento VARCHAR(255) NOT NULL,
	numero INT NOT NULL,
	PRIMARY KEY (codigo_endereco),
	FOREIGN KEY (codigo_loja) REFERENCES Loja(codigo_loja),
	FOREIGN KEY (codigo_cliente) REFERENCES Cliente(codigo_cliente)
);


CREATE TABLE Veiculo (
    codigo_veiculo serial, 
    codigo_loja INT NOT NULL,
    placa VARCHAR(7) NOT NULL,
    marca VARCHAR(255) NOT NULL,
    modelo VARCHAR(255) NOT NULL,
    ano INT NOT NULL,
    valor FLOAT NOT NULL,
    PRIMARY KEY (codigo_veiculo), 
    FOREIGN KEY (codigo_loja) REFERENCES Loja(codigo_loja)
);


CREATE TABLE Tipo (
    codigo_tipo serial,
    codigo_veiculo INT NOT NULL UNIQUE,
    descricao VARCHAR(255) NOT NULL,
    PRIMARY KEY (codigo_tipo),
    FOREIGN KEY (codigo_veiculo) REFERENCES Veiculo(codigo_veiculo)
);


CREATE TABLE Vendedor (
    codigo_vendedor serial, 
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    celular VARCHAR(11) NOT NULL,
    PRIMARY KEY (codigo_vendedor)
);


CREATE TABLE Venda (
	codigo_venda serial,	
	valor FLOAT,
	codigo_loja INT NOT NULL,
	codigo_cliente INT NOT NULL UNIQUE,
	codigo_vendedor INT NOT NULL UNIQUE,
	PRIMARY KEY (codigo_venda),
	FOREIGN KEY (codigo_loja) REFERENCES Loja(codigo_loja),
	FOREIGN KEY (codigo_cliente) REFERENCES Cliente(codigo_cliente),
    FOREIGN KEY (codigo_vendedor) REFERENCES Vendedor(codigo_vendedor)
);

INSERT INTO Loja(codigo_loja, nome, cnpj, telefone)
VALUES
    (1, "AutoStar Motors", "12345678000195", "9123456789"),
    (2, "Rota Car", "98765432000123", "9876543210"),
    (3, "Luxo Auto Sales", "11223344000156", "9345678123"),
    (4, "Brasil Premium Cars", "55667788000143", "9234567890"),
    (5, "MegaCar Automóveis", "99887766000121", "9456781234"),
    (5, "UrbanRide Autos", "33445566000178", "9567890123");

INSERT INTO Cliente(codigo_cliente, nome, cpf, celular)
VALUES
    (1, "João Silva", "12345678901", "9345678123"),
    (2, "Ana Pereira", "98765432198", "9234567890"),
    (3, "Carlos Oliveira", "11223344556", "9456781234"),
    (4, "Mariana Santos", "55667788900", "9567890123"),
    (5, "Pedro Costa", "99887766543", "9123456789"),
    (6, "Fernanda Almeida", "33445566789", "9876543210");

INSERT INTO Endereco(codigo_endereco, codigo_loja, codigo_cliente, cep, logradouro, complemento, numero)
VALUES
    (1, 1, 1, "01234567", "Rua das Flores", "Apt 101", 123),
    (2, 2, 2, "12345678", "Avenida dos Passaros", "Sala 202", 46),
    (3, 3, 3, "23456789", "Praça Central", "Casa A", 789),
    (4, 4, 4, "34567890", "Travessa das Árvores", "Bloco B", 32),
    (5, 5, 5, "45678901", "Alameda das Estrelas", "Loja 10", 654),
    (6, 6, 6, "56789012", "Rua dos Sonhos", "Fundos", 987);


INSERT INTO Veiculo(codigo_veiculo, codigo_loja, placa, marca, modelo, ano, valor)
VALUES 
    (1, 1, "1234567", "Toyota", "Corolla", 2018, 45000),
    (2, 2, "9876543", "Ford", "Fiesta", 2015, 25500),
    (3, 3, "4567890", "Chevrolet", "Onix", 2020, 38900),
    (4, 4, "3456789", "Volkswagen", "Gol", 2017, 30000),
    (5, 5, "2345678", "Honda", "Civic", 2019, 52800),
    (6, 6, "5678901", "Hyundai", "HB20", 2016, 28700);

INSERT INTO Tipo(codigo_tipo, codigo_veiculo, descricao)
VALUES
    (1, 1, "Perfeito para quem busca conforto e tecnologia"),
    (2, 2, "Compacto e ágil"),
    (3, 3, "Design moderno e esportivo"),
    (4, 4, "Clássico brasileiro"),
    (5, 5, "Qualidade, confiabilidade e desempenho impressionantes"),
    (6, 6, "Combina estilo, eficiência e praticidade");

INSERT INTO Vendedor(codigo_vendedor, nome, cpf, celular)
VALUES
    (1, "Marta Silva", "12345678901", "9876543210"),
    (2, "Joana Santos", "23456789012", "8765432109"),
    (3, "Lucas Pereira", "34567890123", "7654321098"),
    (4, "Julia Souza", "45678901234", "6543210987"),
    (5, "Pedro Lima", "56789012345", "5432109876"),
    (6, "Maria Oliveira", "67890123456", "4321098765");

INSERT INTO Venda(codigo_venda, valor, codigo_loja, codigo_cliente, codigo_vendedor)
VALUES
    (1, 600000, 1, 1, 1),
    (2, 890000, 2, 2, 2),
    (3, 90000, 3, 3, 3),
    (4, 1000000, 4, 4, 4),
    (5, 700500, 5, 5, 5),
    (6, 870000, 6, 6, 6);

/*
drop table Venda;
drop table Vendedor;
drop table Tipo;
drop table Veiculo;
drop table Endereco;
drop table Cliente;
drop table Loja;
*/
