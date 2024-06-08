package com.bineesh.liveasyassignment.repo;


import com.bineesh.liveasyassignment.entity.Load;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
import java.util.List;

@Repository
public interface LoadsRepo extends JpaRepository<Load, Integer> {

    List<Load> findAllByShipperId(UUID shipperId);


}
