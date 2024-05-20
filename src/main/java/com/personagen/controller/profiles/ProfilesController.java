package com.personagen.controller.profiles;

import com.deepl.api.DeepLException;
import com.personagen.model.documents.Nif;
import com.personagen.model.profiles.Company;
import com.personagen.model.profiles.User;
import com.personagen.service.profiles.IProfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/profiles")
@CrossOrigin
public class ProfilesController {

    @Autowired
    private IProfilesService iProfilesService;

    @GetMapping(value = "/user")
    public ResponseEntity<User> getUser(){
        User user = null;
        try {
            user = iProfilesService.generateUser();
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (DeepLException | InterruptedException e) {
            //TODO handle exception and return error
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/company")
    public ResponseEntity<Company> getCompany(){
        Company company = iProfilesService.generateCompany();
        return new ResponseEntity<>(company, HttpStatus.OK);
    }
}
