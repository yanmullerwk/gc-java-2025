SELECT
    nome,
    preco,
    preco * 0.9 AS preco_com_desconto
FROM ia_dados.produtos
ORDER BY preco_com_desconto DESC;