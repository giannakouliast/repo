package com.h2.db.controller;

import com.h2.db.model.Donor;
import com.h2.db.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DonorController {
    
    private final DonorService donorService;

    // Using constructor injection
    public DonorController(DonorService donorService) {
        this.donorService = donorService;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listDonors", donorService.findAll());
        return "index";
    }

    @GetMapping("/showNewDonorForm")
    public String showNewDonorForm(Model model) {
        Donor donor = new Donor();
        model.addAttribute("donor", donor);
        return "new_donor";
    }

    @PostMapping("/saveDonor")
    public String saveDonor(@ModelAttribute("donor") Donor donor) {
        donorService.save(donor);
        return "redirect:/";
    }

    @GetMapping("/form/{id}")
    public String viewDonor(@PathVariable(value = "id") long id, Model model) {
        Donor donor = donorService.findById(id);
        model.addAttribute("donor", donor);
        return "view_donor";
    }
}

//package com.h2.db.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.h2.db.exception.RecordNotFoundException;
//import com.h2.db.model.Donor;
//import com.h2.db.service.DonorService;
//
//@Controller
//@RequestMapping("/users/donor")
//public class DonorController 
//{
//	@Autowired
//	DonorService service;
//
//	@RequestMapping
//	public String getAllDonors(Model model) 
//	{	
//		System.out.println("getAllDonors");
//		
//		List<Donor> list = service.getAllDonors();
//
//		model.addAttribute("donors", list);
//		
//		return "list-donors";
//	}
//	
//	@RequestMapping(path = {"/edit", "/edit/{donor_id}"})
//	public String editDonorById(Model model, @PathVariable("donor_id") Optional<Long> donor_id) 
//							throws RecordNotFoundException 
//	{
//		
//		System.out.println("editDonorById" + donor_id);
//		if (donor_id.isPresent()) {
//			Donor entity = service.getDonorById(donor_id.get());
//			model.addAttribute("donor", entity);
//		} else {
//			model.addAttribute("donor", new Donor());
//		}
//		
//		
//		return "add-edit-donor";
//	}
//	
//	@RequestMapping(path = "/delete/{id}")
//	public String deleteDonorById(Model model, @PathVariable("id") Long id) 
//							throws RecordNotFoundException 
//	{
//		
//		System.out.println("deleteDonorById" + id);
//		
//		service.deleteDonorById(id);
//		return "redirect:/";
//	}
//
//	@RequestMapping(path = "/createDonor", method = RequestMethod.POST)
//	public String createOrUpdateDonor(Donor donor) 
//	{
//		System.out.println("createOrUpdateDonor ");
//		
//		service.createOrUpdateDonor(donor);
//		
//		return "redirect:/";
//	}
//}
