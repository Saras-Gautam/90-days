package post.country.service.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import post.country.service.Model.Country;



@Repository
public interface CountryRepo extends JpaRepository<Country,Integer> {



}
