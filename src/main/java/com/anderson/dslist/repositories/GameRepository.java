package com.anderson.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anderson.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
