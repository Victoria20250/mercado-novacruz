# Mercado Novacruzense
Este repositório está direcionado para trabalhar o sistema do mercado.

## Uma Breve Descrição do Contexto/Problema
**Mercado Novacruzence**, uma rede de supermercados com várias filiais espalhadas pela cidade, nos contratou (esta turma, esta sala de aula) para desenvolvermos uma solução que tornasse os processos operacionais e administrativos do mercado mais ágeis, gerenciáveis, eficazes e eficientes, evitando assim que decisões gerenciais sejam tomadas sem dados concretos e bem estruturados. Após discussões com os envolvidos (gerentes de loja, responsáveis pelo estoque, equipe de vendas e financeiro), os seguintes requisitos foram brevemente capturados para projetarmos um sistema que permita:
Controle de estoque em tempo real, permitindo ao mercado saber a quantidade de produtos disponíveis em cada momento, evitando rupturas e excessos.
Automatização do processo de vendas, garantindo que as transações sejam rápidas e precisas no ponto de venda, minimizando erros.
Emissão de notas fiscais de forma rápida e automática, facilitando o cumprimento das obrigações fiscais e melhorando a experiência do cliente.
Geração de relatórios financeiros e de desempenho, para que os gestores possam analisar o fluxo de vendas e o desempenho do mercado, tomando decisões baseadas em dados reais.

### Iteração-I: Validação Arquitetural
Neste primeiro momento, como uma prova de conceito e viabilidade arquitetural, trabalharemos na necessidade de armazenamento de dados sobre produtos no estoque e nas vendas realizadas. O sistema deverá ser capaz de registrar informações como nome do produto, quantidade, preço e categoria, de forma organizada, considerando o espaço limitado de cada seção no mercado. A validação dessa arquitetura inicial garantirá a eficiência do sistema em gerenciar as operações do mercado.


1. Cadastro de Produtos
História de Usuário:

Como funcionário do mercado,

Quero cadastrar produtos no sistema com informações como nome, código de barras, preço e categoria,

Para que eu possa manter o controle sobre o estoque e facilitar o processo de vendas.

Critérios de Aceitação:

- O sistema deve permitir o cadastro de produtos com os seguintes campos: nome, código de barras, preço e categoria.
- O código de barras deve ser único para cada produto e validado no momento do cadastro.
- O sistema deve permitir a seleção de uma categoria de produto (ex: alimentos, bebidas, limpeza).
- O sistema deve validar o preço para garantir que seja um valor numérico positivo.
- O cadastro deve ser simples e rápido, permitindo o registro de múltiplos produtos simultaneamente.

2. Registro de Vendas
História de Usuário:

Como caixa do mercado,

Quero registrar as vendas dos produtos de maneira rápida e precisa,

Para que o cliente possa finalizar uma compra sem demora e sem erros no processo de pagamento.

Critérios de Aceitação:

- O sistema deve permitir o registro rápido de vendas através da leitura do código de barras ou pesquisa por nome.
- O sistema deve calcular automaticamente o valor total da venda com base nos produtos e suas quantidades.
- O caixa deve poder aplicar descontos ou promoções durante o processo de pagamento.
- O sistema deve oferecer diferentes métodos de pagamento (cartão de crédito, débito, dinheiro).
- O sistema deve registrar automaticamente o horário e a data de cada venda, garantindo um histórico acessível.

3. Controle de Estoque
História de Usuário:

Como responsável pelo estoque,

Quero monitorar o estoque de cada produto em tempo real,

Para que eu possa evitar a falta de produtos ou o excesso de mercadorias não vendidas, facilitando a encomenda no momento certo.

Critérios de Aceitação:

- O sistema deve exibir a quantidade atual em estoque de cada produto e permitir a atualização do estoque em tempo real.
- O sistema deve atualizar automaticamente o estoque a cada venda realizada.
- O sistema deve permitir ao responsável pelo estoque realizar ajustes manuais (entrada ou saída de produtos).
- O sistema deve emitir alertas quando o estoque de um produto atingir um nível mínimo predefinido.
- O sistema deve oferecer uma visão geral e detalhada do estoque por categoria, permitindo um fácil monitoramento.

4. Emissão de Notas Fiscais
História de Usuário:

Como cliente,

Quero receber uma nota fiscal ao finalizar minha compra,

Para que eu tenha um comprovante da transação e possa cumprir com critérios fiscais e de garantia.

Critérios de Aceitação:

- O sistema deve gerar automaticamente a nota fiscal eletrônica ao finalizar a venda.
- A nota fiscal deve conter as informações completas da venda: produtos, quantidades, preço total, dados fiscais e dados do cliente (CPF ou CNPJ).
- A nota fiscal deve ser gerada em conformidade com as exigências fiscais locais.
- O sistema deve permitir o envio da nota fiscal por e-mail ou fornecimento de uma versão impressa para o cliente.
- O sistema deve armazenar uma cópia digital das notas fiscais emitidas para consultas futuras.

5. Relatórios de Vendas
História de Usuário:

Como dono do mercado,

Quero visualizar relatórios de vendas diários, semanais e mensais,

Para que eu possa analisar o desempenho financeiro do mercado e tomar decisões estratégicas informadas.

Critérios de Aceitação:

- O sistema deve permitir a geração de relatórios de vendas com filtros para diferentes períodos (diário, semanal, mensal).
- Os relatórios devem incluir informações como: total de vendas, número de transações, produtos mais vendidos, receitas geradas, entre outros.
- O sistema deve permitir exportar os relatórios para formatos como PDF e Excel.
- O dono do mercado deve poder visualizar os relatórios por filial, categoria de produto e outros critérios de segmentação.
- O sistema deve apresentar gráficos e indicadores para facilitar a interpretação dos dados e apoiar a análise do desempenho.
