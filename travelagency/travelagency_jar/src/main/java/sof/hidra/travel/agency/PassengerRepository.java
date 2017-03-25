/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sof.hidra.travel.agency;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "passenger", path = "passenger")
public interface PassengerRepository extends PagingAndSortingRepository<Passenger, Long> {

    List<Passenger> findByLastName(String lastName);
}
