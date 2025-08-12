package br.edu.ifrn.mercadonovacruz.persistencia.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifrn.mercadonovacruz.persistencia.modelo.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional<Produto> findByCodigoBarras(String codigoBarras);

}
