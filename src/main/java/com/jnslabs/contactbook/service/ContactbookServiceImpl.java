package com.jnslabs.contactbook.service;

import com.jnslabs.contactbook.entity.Contact;
import com.jnslabs.contactbook.repository.ContactbookRepository;
import com.jnslabs.contactbook.service.client.ViaCepClient;
import com.jnslabs.contactbook.service.interfaces.ContactbookService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Autor Jairo Nascimento
 * @Created 07/01/2024 - 09:38
 */

@Log4j2
@Service
@AllArgsConstructor
public class ContactbookServiceImpl implements ContactbookService {

    private final ContactbookRepository repository;
    private final ViaCepClient viaCepClient;

    @Override
    public Contact save(Contact contact) {
        return null;
    }

    @Override
    public List<Contact> getAll() {
        return null;
    }

    @Override
    public Optional<Contact> getByName(String name) {
        return Optional.empty();
    }
}
