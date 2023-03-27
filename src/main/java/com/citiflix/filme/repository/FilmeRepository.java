/*
Mateus Mendes - RM95138
Matheus Gomes Campolongo - RM94250
*/

package com.citiflix.filme.repository;

import com.citiflix.filme.model.Filme;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
    Page<Filme> findAllByVisivelTrue(Pageable paginacao);
}
