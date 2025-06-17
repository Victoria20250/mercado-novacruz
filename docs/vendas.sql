CREATE TABLE Vendas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    codigo_barras VARCHAR(50) NOT NULL,
    nome_produto VARCHAR(255) NOT NULL,
    quantidade INT NOT NULL CHECK (quantidade > 0),
    preco_unitario DECIMAL(10,2) NOT NULL CHECK (preco_unitario > 0),
    desconto DECIMAL(10,2) DEFAULT 0 CHECK (desconto >= 0),
    metodo_pagamento ENUM('cartao_credito', 'cartao_debito', 'dinheiro') NOT NULL,
    data_hora DATETIME DEFAULT CURRENT_TIMESTAMP,
    valor_total DECIMAL(10,2) AS ((preco_unitario * quantidade) - desconto) STORED
);
