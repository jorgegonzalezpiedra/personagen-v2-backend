package com.personagen.controller.documents;

import com.personagen.model.documents.Nif;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/documents")
public class DocumentsImpl implements IDocuments{

    @GetMapping(value = "/nif")
    public ResponseEntity<Nif> getNif(){
        return new ResponseEntity<>(new Nif(), HttpStatus.OK);
    }
}


