package com.personagen.service.documents;

import com.personagen.constants.PersonagenConstants;
import com.personagen.model.documents.Cif;
import com.personagen.model.documents.Nie;
import com.personagen.model.documents.Nif;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
public class DocumentsServiceImpl  implements  IDocumentsService{
    Random random = new Random();
    StringBuilder documentString = new StringBuilder();
    StringBuilder documentNumberString = new StringBuilder();

    @Override
    public Nif generateNif() {
        documentString = new StringBuilder();
        documentNumberString = new StringBuilder();

        Nif nif = new Nif();

        //Number
        int nifNumber = 10000000 + random.nextInt(90000000);
        documentString.append(nifNumber);
        documentNumberString.append(nifNumber);

        //Letter
        int fullNifNumberModule = nifNumber % 23;
        String letterNif = PersonagenConstants.LETTERS_MODULE_MAP.get(fullNifNumberModule);
        nif.setLetter(letterNif);
        documentString.append(letterNif);

        nif.setDocument(documentString.toString());
        nif.setNumber(documentNumberString.toString());

        return nif;
    }

    @Override
    public Nie generateNie() {
        documentString = new StringBuilder();
        documentNumberString = new StringBuilder();

        Nie nie = new Nie();

        //First letter
        Collections.shuffle(PersonagenConstants.FIRST_LETTERS_NIE_LIST);
        String nieFirstLetter = PersonagenConstants.FIRST_LETTERS_NIE_LIST.get(0);
        nie.setFirstLetter(nieFirstLetter);
        documentString.append(nieFirstLetter);

        //Number
        Integer nieNumber = 1000000 + random.nextInt(9000000);
        nie.setNumber(nieNumber.toString());
        documentString.append(nieNumber);
        documentNumberString.append(nieNumber);

        //Last letter
        int fullNieNumber = Integer.parseInt(PersonagenConstants.FIRST_LETTERS_NIE_MAP.get(nieFirstLetter).toString() + nieNumber);
        Integer fullNieNumberModule = fullNieNumber % 23;
        String lastLetterNie = PersonagenConstants.LETTERS_MODULE_MAP.get(fullNieNumberModule);
        nie.setLastLetter(lastLetterNie);
        documentString.append(lastLetterNie);

        nie.setDocument(documentString.toString());
        nie.setNumber(documentNumberString.toString());

        return nie;
    }

    @Override
    public Cif generateCif() {
        documentString = new StringBuilder();
        documentNumberString = new StringBuilder();

        Cif cif = new Cif();

        //Society type
        Collections.shuffle(PersonagenConstants.SOCIETY_TYPES_CIF_CODE_LIST);
        String orgTypeCode = PersonagenConstants.SOCIETY_TYPES_CIF_CODE_LIST.get(0);
        String orgType = PersonagenConstants.SOCIETY_TYPES_CIF_MAP.get(orgTypeCode);
        cif.setOrgTypeCode(orgTypeCode);
        cif.setOrgType(orgType);
        documentString.append(orgTypeCode);

        //Province
        Collections.shuffle(PersonagenConstants.PROVINCES_CODES_LIST);
        Integer provinceCode = PersonagenConstants.PROVINCES_CODES_LIST.get(0);
        String province = PersonagenConstants.PROVINCES_CODES_MAP.get(provinceCode);
        cif.setProvinceCode(provinceCode.toString());
        cif.setProvince(province);
        documentString.append(provinceCode);
        documentNumberString.append(provinceCode);

        //Correlative number
        Integer correlativeNumber = random.nextInt(1000000);
        String formattedCorrelativeNumber = String.format("%05d", correlativeNumber);
        cif.setCorrelativeNumber(formattedCorrelativeNumber);
        documentString.append(formattedCorrelativeNumber);
        documentNumberString.append(formattedCorrelativeNumber);

        //Control digit
        String controlDigit;
        List<String> listForLetter = List.of("K", "P", "Q", "S");
        if(listForLetter.contains(orgTypeCode)){
            controlDigit = String.valueOf((char) ('A' + random.nextInt(26)));
        }else{
            controlDigit = String.valueOf(random.nextInt(10));
            documentNumberString.append(controlDigit);
        }
        cif.setControlDigit(controlDigit);
        documentString.append(controlDigit);

        cif.setDocument(documentString.toString());
        cif.setNumber(documentNumberString.toString());

        return cif;
    }
}
