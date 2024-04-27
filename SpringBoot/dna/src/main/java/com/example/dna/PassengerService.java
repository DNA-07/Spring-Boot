
package com.example.dna;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {
   
    @Autowired
    PassengerRepo pr;

    //post
    public Passenger create(Passenger p)
    {
       
        return pr.save(p);
    }

    //getbyid
 
    public List<Passenger> fetchDepartmentList() 
    { 
        return (List<Passenger>) pr.findAll(); 
    } 
    //getbyid
    public Passenger getbyId(int passengerId)
    {
        return pr.findById(passengerId).orElse(null);
    }
    public List<Passenger> getbysort(String field)
    {
        return pr.findAll(Sort.by(Sort.Direction.ASC,field));
    }
    //put
    public boolean updateDetails(int passengerId,Passenger p)
        {
            if(pr.findById(passengerId)==null)
            {
                return false;
            }
            try{
                pr.save(p);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
public boolean deleteEmployee(int passengerId)
        {
            if(this.getbyId(passengerId) == null)
            {
                return false;
            }
            pr.deleteById(passengerId);
            return true;
        }

}