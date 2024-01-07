package com.jnslabs.contactbook.service.interfaces;

import com.jnslabs.contactbook.entity.Contact;

import java.util.List;
import java.util.Optional;

/**
 * @Autor Jairo Nascimento
 * @Created 07/01/2024 - 09:33
 */
public interface ContactbookService {
    Contact save(Contact contact);
    List<Contact> getAll();
    Optional<Contact> getByName(String name);
}
