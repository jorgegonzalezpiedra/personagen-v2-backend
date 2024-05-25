package com.personagen;

import com.personagen.model.documents.Cif;
import com.personagen.model.documents.Nie;
import com.personagen.model.documents.Nif;
import com.personagen.service.documents.IDocumentsService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class DocumentTests {

    @Autowired
    IDocumentsService documentsService;

    @DisplayName("Generate nif test")
    @Test
    public void generateNif() {

        Nif nif = documentsService.generateNif();

        assertNotNull(nif, "El nif es nulo");
        assertEquals(nif.getDocument().length(), 9 , "El nif no tiene la longitud correta");

    }

    @DisplayName("Generate nie test")
    @Test
    public void generateNie() {

        Nie nie = documentsService.generateNie();

        assertNotNull(nie, "El nie es nulo");
        assertEquals(nie.getDocument().length(), 9 , "El nie no tiene la longitud correta");
    }

    @DisplayName("Generate cif test")
    @Test
    public void generateCif() {

        Cif cif = documentsService.generateCif();

        assertNotNull(cif, "El cif es nulo");
        assertEquals(cif.getDocument().length(), 10 , "El cif no tiene la longitud correta");
    }
}
