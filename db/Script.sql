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

/*
drop table Venda;
drop table Vendedor;
drop table Tipo;
drop table Veiculo;
drop table Endereco;
drop table Cliente;
drop table Loja;
*/
