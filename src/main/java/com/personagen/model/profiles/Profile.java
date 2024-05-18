package com.personagen.model.profiles;

import com.personagen.model.documents.Document;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Profile {
    private Document document;
    private String name;
    private String phoneNumber;
    private String email;
}
