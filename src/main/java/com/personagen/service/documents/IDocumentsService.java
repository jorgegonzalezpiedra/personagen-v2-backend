package com.personagen.service.documents;

import com.personagen.model.documents.Cif;
import com.personagen.model.documents.Nie;
import com.personagen.model.documents.Nif;

public interface IDocumentsService {

    public Nif generateNif();

    public Nie generateNie();

    public Cif generateCif();


}
