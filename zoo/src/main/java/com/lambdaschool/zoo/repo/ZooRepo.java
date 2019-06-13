package com.lambdaschool.zoo.repo;

import com.lambdaschool.zoo.model.Zoo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepo extends CrudRepository<Zoo, Long>
{
    Zoo findByZooname(String name);

    @Modifying
    @Query(value = "DELETE FROM zooanimals WHERE zooid = :zooid", nativeQuery = true)
    void deleteZooFromZooAnimals(long zooid);

    @Modifying
    @Query(value = "DELETE FROM zooanimals WHERE zooid = :zooid AND animalid = :animalid", nativeQuery = true)
    void deleteZooAnimalCombo(long zooid, long animalid);

    @Modifying
    @Query(value = "INSERT INTO zooanimals (zooid, animalid) VALUES (:zooid, :animalid)", nativeQuery = true)
    void saveZooAnimalCombo(long zooid, long animalid);

}
