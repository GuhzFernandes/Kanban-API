package edu.gus.kanbanapi.repository;

import edu.gus.kanbanapi.model.StatusColumn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StatusColumnRepository extends JpaRepository<StatusColumn, UUID> {
}
