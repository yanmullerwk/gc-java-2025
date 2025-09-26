DELETE FROM ia_dados.produtos
WHERE id_produto IN (
    SELECT id_produto
    FROM (
             SELECT
                 id_produto,
                 ROW_NUMBER() OVER(PARTITION BY nome ORDER BY id_produto) AS linha
             FROM ia_dados.produtos
         ) AS subconsulta
    WHERE linha > 1
);