package com.example.diwakar.book_my_show.show;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import jakarta.persistence.LockModeType;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeatEntity, Long>{
    
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    public List<ShowSeatEntity> findAllByIdIn(List<Long> showSeatIds);
}
