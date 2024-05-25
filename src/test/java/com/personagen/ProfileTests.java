package com.personagen;

import com.personagen.model.profiles.Company;
import com.personagen.model.profiles.User;
import com.personagen.service.profiles.IProfilesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.assertj.core.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@SpringBootTest
public class ProfileTests {

    @Autowired
    IProfilesService profilesService;

    @Test
    public void generateUserProfile() {

        User user = profilesService.generateUser();

        assertNotNull(user, "El usuario es nulo");
        assertNotEquals(user.getUserName(), "", "El campo userName es nulo");
        assertNotEquals(user.getDocument(), null, "El campo document es nulo" );
        assertEquals(user.getDocument().getDocument().length(), 9 , "El documento no tiene la longitud correcta");

    }

    @Test
    public void generateCompanyProfile() {

        Company company = profilesService.generateCompany();

        assertNotNull(company, "El usuario es nulo");
        assertNotEquals(company.getName(), "", "El campo name es nulo");
        assertNotEquals(company.getDocument(), null, "El campo document es nulo" );
        assertEquals(company.getDocument().getDocument().length(), 10 , "El documento no tiene la longitud correcta");
    }
}
