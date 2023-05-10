package com.anderson.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anderson.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
