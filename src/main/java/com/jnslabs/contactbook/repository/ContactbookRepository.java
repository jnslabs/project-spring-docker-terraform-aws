package com.jnslabs.contactbook.repository;

import com.jnslabs.contactbook.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @Autor Jairo Nascimento
 * @Created 07/01/2024 - 09:39
 */

@Repository
public interface ContactbookRepository extends JpaRepository<Contact, Long> {
    Optional<Contact> findByName(String name);
}
