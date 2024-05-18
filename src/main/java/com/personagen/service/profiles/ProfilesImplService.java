package com.personagen.service.profiles;

import com.personagen.model.profiles.Company;
import com.personagen.model.profiles.User;
import com.personagen.service.documents.IDocumentsService;
import com.personagen.utils.UserDataBuilder;
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
    public User generateUser() {
        User user = new User();
        user.setDocument(iDocumentsService.generateNif());//TODO generate nif or nie randomly
        user.setGender(dataFaker.gender().types());//TODO see translations to spanish
        user.setName(dataFaker.name().firstName());
        user.setLastName1(dataFaker.name().lastName());
        user.setLastName2(dataFaker.name().lastName());
        user.setUserName(UserDataBuilder.buildUserName(user.getName(), user.getLastName1(), user.getLastName2()));
        user.setEmail(UserDataBuilder.buildEmailAddress(user.getName(), user.getLastName1()));
        user.setPassword(dataFaker.internet().password());
        user.setPhoneNumber(dataFaker.phoneNumber().cellPhone()
                .replace("-", "")
                .replace(" ", "")
                .replace(".",""));
        return user;
    }

    @Override
    public Company generateCompany() {
        return null;
    }
}
