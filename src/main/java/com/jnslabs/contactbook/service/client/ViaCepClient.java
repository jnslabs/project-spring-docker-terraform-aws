package com.jnslabs.contactbook.service.client;

import com.jnslabs.contactbook.service.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Autor Jairo Nascimento
 * @Created 07/01/2024 - 09:40
 */

@FeignClient(name= "viaCep", url = "${viacep.endpoint}")
public interface ViaCepClient {
    @GetMapping(value = "/{cep}/json")
    AddressResponse getAddress(@PathVariable(value = "cep") String cep);
}
