package com.personagen.service.profiles;

import com.personagen.model.profiles.Company;
import com.personagen.model.profiles.User;

public interface IProfilesService {

    User generateUser();

    Company generateCompany();
}
