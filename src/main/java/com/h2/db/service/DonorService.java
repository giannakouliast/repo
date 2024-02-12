package com.h2.db.service;

import com.h2.db.model.Donor;
import com.h2.db.model.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorService {
    
    private final DonorRepository donorRepository;

    // Using constructor injection
    public DonorService(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    public List<Donor> findAll() {
        return donorRepository.findAll();
    }

    public Donor save(Donor donor) {
        return donorRepository.save(donor);
    }

    public Donor findById(Long id) {
        return donorRepository.findById(id).orElse(null);
    }
}

//package com.h2.db.service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.h2.db.exception.RecordNotFoundException;
//import com.h2.db.model.Donor;
//import com.h2.db.model.repository.DonorRepository;
//
//
//@Service
//public class DonorService {
//	
//	@Autowired
//	DonorRepository repository;
//	
//	public List<Donor> getAllDonors()
//	{
//		System.out.println("getAllDonors");
//		List<Donor> result = (List<Donor>) repository.findAll();
//		
//		if(result.size() > 0) {
//			return result;
//		} else {
//			return new ArrayList<Donor>();
//		}
//	}
//
//	
//	public Donor getDonorById(Long id) throws RecordNotFoundException 
//	{
//		System.out.println("getDonorById");
//		Optional<Donor> donor = repository.findById(id);
//		
//		if(donor.isPresent()) {
//			return donor.get();
//		} else {
//			throw new RecordNotFoundException("No donor record exist for given id");
//		}
//	}
//	
//	public Donor createOrUpdateDonor(Donor entity) 
//	{
//		System.out.println("createOrUpdateDonor");
//		// Create new entry 
//		if(entity.getId()  == null) 
//		{
//			entity = repository.save(entity);
//			
//			return entity;
//		} 
//		else 
//		{
//			// update existing entry 
//			Optional<Donor> donor = repository.findById(entity.getId());
//			
//			if(donor.isPresent()) 
//			{
//				Donor newEntity = donor.get();
//				newEntity.setEmail(entity.getEmail());
//				newEntity.setFirstName(entity.getFirstName());
//				newEntity.setLastName(entity.getLastName());
//				newEntity.setBloodType(entity.getBloodType());
//
//				newEntity = repository.save(newEntity);
//				
//				return newEntity;
//			} else {
//				entity = repository.save(entity);
//				
//				return entity;
//			}
//		}
//	} 
//	
//	public void deleteDonorById(Long id) throws RecordNotFoundException 
//	{
//		System.out.println("deleteDonorById");
//		
//		Optional<Donor> donor = repository.findById(id);
//		
//		if(donor.isPresent()) 
//		{
//			repository.deleteById(id);
//		} else {
//			throw new RecordNotFoundException("No donor record exist for given id");
//		}
//	} 
//}