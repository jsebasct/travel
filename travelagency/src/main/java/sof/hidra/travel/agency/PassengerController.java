/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sof.hidra.travel.agency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author jscruz
 */
@Controller
@RequestMapping(path="/passenger")
public class PassengerController {
    
    @Autowired
    private PassengerRepository repository;
    
    @PostMapping("/add")
    public @ResponseBody String addNewPassenger(@RequestBody PassengerPojo temp) {
//        Passenger p = new Passenger(temp.getName(), temp.getLastName());
        Passenger p = new Passenger();
        p.setFirstName(temp.getName());
        p.setLastName(temp.getLastName());
        repository.save(p);
        return "Saved";
    }
    
}
