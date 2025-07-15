package org.example.back_end.repository;

import jakarta.transaction.Transactional;
import org.example.back_end.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {
    @Transactional
    @Modifying
    @Query(value = "UPDATE Job SET status='Deactivate' WHERE id =?1",nativeQuery = true)
    void updateJobStatus(String id);

    List<Job> findJobByJobTitleContainingIgnoreCase(String keyword);

    //JPA METHODS
    // Prefix + FieldName + Operator + Conjunctions

    //Prefix
        //findBy - readyBy - getBy - countBy - existsBy - deleteBy
    //FieldName
        // entity attribute name
    //Operator
        //Equals - IsNull - IsNotNull - LessThan - LessThanEquals - GreaterThan - GreaterThanEquals
        //Between - In , NotIn ,Like NotLike ,Containing , StartingWith, EndingWith, IgnoreCase
    // Conjunctions
        //And , Or
}
