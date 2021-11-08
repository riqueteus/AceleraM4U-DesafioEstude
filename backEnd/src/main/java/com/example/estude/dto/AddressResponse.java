package com.example.estude.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class AddressResponse {
    private Integer id;
    private Integer productId;

    public AddressResponse(Integer id, Integer productId) {
        this.id = id;
        this.productId = productId;
    }


}
