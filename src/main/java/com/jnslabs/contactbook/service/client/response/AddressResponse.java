package com.jnslabs.contactbook.service.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Autor Jairo Nascimento
 * @Created 07/01/2024 - 09:30
 */

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressResponse {
    private String cep;
    private String logradouro;
    private String bairro;
    @JsonProperty(value = "localidade")
    private String cidade;
    @JsonProperty(value = "uf")
    private String estado;
}
