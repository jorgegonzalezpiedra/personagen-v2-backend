package com.personagen.service.profiles;

import com.deepl.api.DeepLException;
import com.personagen.model.profiles.Company;
import com.personagen.model.profiles.User;

public interface IProfilesService {

    User generateUser() throws DeepLException, InterruptedException;

    Company generateCompany();
}
