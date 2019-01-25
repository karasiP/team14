package sut.se.g14.repository;

import sut.se.g14.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public 
interface ArtistRepository extends  JpaRepository<Artists, Long>{    
    Artists findByIdArtist(long number);
    Artists findByfirstname(String number);
}
