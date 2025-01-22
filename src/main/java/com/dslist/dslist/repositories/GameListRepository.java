package com.dslist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dslist.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
