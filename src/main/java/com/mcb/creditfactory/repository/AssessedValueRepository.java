package com.mcb.creditfactory.repository;

import com.mcb.creditfactory.model.AssessedValue;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AssessedValueRepository extends CrudRepository<com.mcb.creditfactory.model.AssessedValue, Long> {
    @Query(value = "FROM AssessedValue where date=(SELECT max(date) FROM AssessedValue) and itemId=:itemId")
    AssessedValue getLastAssessedValue(Long itemId);
}
