package com.personagen.model.profiles;

import com.personagen.model.documents.Document;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class User extends Profile{
    private String gender;
    private String birthDate;
    private String lastName1;
    private String lastName2;
    private String userName;
    private String password;
}
