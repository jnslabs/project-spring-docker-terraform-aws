package com.jnslabs.contactbook.controller.request;

import com.jnslabs.contactbook.entity.Contact;
import lombok.*;

/**
 * @Autor Jairo Nascimento
 * @Created 07/01/2024 - 09:34
 */

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class ContactRequest {
    private String name;
    private String phone;
    private String cep;
    private Integer numero;

    public Contact toEntity(){
        return Contact.builder()
                .name(name)
                .phone(phone)
                .cep(cep.contains("-")? cep.replace("-", ""): cep)
                .numero(numero)
                .build();
    }
}
