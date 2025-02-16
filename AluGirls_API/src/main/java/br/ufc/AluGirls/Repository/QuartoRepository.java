package br.ufc.AluGirls.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.ufc.AluGirls.Model.Quarto;

@Repository
public interface QuartoRepository extends CrudRepository<Quarto, Integer> {


    }