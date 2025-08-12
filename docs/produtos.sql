CREATE TABLE Produtos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    codigo_barras VARCHAR(50) NOT NULL UNIQUE,
    preco DECIMAL(10, 2) NOT NULL CHECK (preco > 0),
    categoria VARCHAR(100) NOT NULL
);
