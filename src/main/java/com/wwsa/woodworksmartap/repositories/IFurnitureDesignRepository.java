package com.wwsa.woodworksmartap.repositories;

import com.wwsa.woodworksmartap.entities.Furniture;
import com.wwsa.woodworksmartap.entities.FurnitureDesign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFurnitureDesignRepository extends JpaRepository<FurnitureDesign, Integer> {

    @Query(value = "SELECT ft.furniture_type_name, COUNT(f.furniture_id)\n" +
            " FROM furniture f inner join furniture_design fd on f.furniture_design_id = fd.furniture_design_id\n" +
            "                  inner join Furniture_types ft on fd.furniture_type_id = ft.id_furniture_type\n" +
            " GROUP BY ft.furniture_type_name\n" +
            " ORDER BY COUNT(f.furniture_id) DESC", nativeQuery = true)
    public List<String[]> countByFurnitureType();
}
