package com.wwsa.woodworksmartap.repositories;

import com.wwsa.woodworksmartap.entities.FurnitureDesign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFurnitureDesignRepository extends JpaRepository<FurnitureDesign, Integer> {
    @Query(value = "SELECT wt.wood_type_name, count(fd.furniture_design_id) \n" +
            " FROM furniture_design fd inner join wood_type wt\n" +
            " on fd.wood_type_id=wt.id_wood_type\n" +
            " GROUP BY wt.wood_type_name\n" +
            " ORDER BY count(furniture_design_id) DESC LIMIT 1", nativeQuery = true)
    public List<String[]>woodCount();
}
