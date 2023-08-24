package com.app.vaistramanagement.dao;







import com.app.vaistramanagement.dto.CountryDto;
import com.app.vaistramanagement.entity.Country;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CountryDao extends JpaRepository<Country,Integer>
{



//    @Query("SELECT c FROM Country c")
//    List<CountryDto> findAllSort(Sort sort);



//    @Query("SELECT c FROM Country c")
//   Page<Country> findAllWithPagination(Pageable pageable);


//    @Override
//    void deleteById(Integer id);


    Country findByCOUNTRY(String country);



}
