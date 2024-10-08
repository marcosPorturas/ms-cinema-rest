package com.pe.web.cine.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pe.web.cine.app.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{

}
