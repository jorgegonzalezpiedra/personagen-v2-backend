package com.personagen.service.profiles;

import com.deepl.api.DeepLException;
import com.personagen.constants.PersonagenConstants;
import com.personagen.model.profiles.Company;
import com.personagen.model.profiles.User;
import com.personagen.service.documents.IDocumentsService;
import com.personagen.utils.ProfileDataBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.datafaker.Faker;

import java.util.Locale;


@Service
public class ProfilesImplService implements IProfilesService {

    @Autowired
    private IDocumentsService iDocumentsService;

    Faker dataFaker = new Faker(new Locale("es"));

    @Override
    public User generateUser(){

        User user = new User();

        user.setDocument(iDocumentsService.generateNif());
        user.setGender(PersonagenConstants.GENDERS[(int) (Math.random() * PersonagenConstants.GENDERS.length)]);
        user.setName(dataFaker.name().firstName());
        user.setLastName1(dataFaker.name().lastName());
        user.setLastName2(dataFaker.name().lastName());
        user.setUserName(ProfileDataBuilder.buildUserName(user.getName(), user.getLastName1(), user.getLastName2()));
        user.setEmail(ProfileDataBuilder.buildEmailAddress(user.getName(), user.getLastName1()));
        user.setPassword(dataFaker.internet().password());
        user.setBirthDate(dataFaker.date().birthday("dd/MM/yyyy"));
        user.setPhoneNumber(dataFaker.phoneNumber().cellPhone()
                .replace("-", "")
                .replace(" ", "")
                .replace(".",""));

        return user;
    }

    @Override
    public Company generateCompany() {

        Company company = new Company();
        company.setDocument(iDocumentsService.generateCif());
        company.setName(dataFaker.company().name()
                .replace(PersonagenConstants.SL_COMPANY_ACRONYM, "")
                .replace(PersonagenConstants.SA_COMPANY_ACRONYM, "")
                .trim());
        company.setIndustry(dataFaker.company().industry());
        company.setCreationDate(dataFaker.date().birthday("dd/MM/yyyy"));
        company.setEmail(ProfileDataBuilder.buildEmailAddress(company.getName().replace(",", ""), ""));
        company.setPhoneNumber(dataFaker.phoneNumber().cellPhone()
                .replace("-", "")
                .replace(" ", "")
                .replace(".",""));

        return company;
    }
}
