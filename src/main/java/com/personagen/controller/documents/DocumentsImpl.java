package com.personagen.controller.documents;

import com.personagen.model.documents.Cif;
import com.personagen.model.documents.Nie;
import com.personagen.model.documents.Nif;
import com.personagen.service.documents.IDocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/documents")
public class DocumentsImpl implements IDocuments{

    @Autowired
    IDocumentsService iDocumentsService;

    @GetMapping(value = "/nif")
    public ResponseEntity<Nif> getNif(){
        Nif nif = iDocumentsService.generateNif();
        return new ResponseEntity<>(nif, HttpStatus.OK);
    }

    @GetMapping(value = "/nie")
    public ResponseEntity<Nie> getNie(){
        Nie nie = iDocumentsService.generateNie();
        return new ResponseEntity<>(nie, HttpStatus.OK);
    }

    @GetMapping(value = "/cif")
    public ResponseEntity<Cif> getCif(){
        Cif cif = iDocumentsService.generateCif();
        return new ResponseEntity<>(cif, HttpStatus.OK);
    }
}


