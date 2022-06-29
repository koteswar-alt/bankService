package com.rbi.HDFC.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class CustomerRegisterDTO {
    private Long Id;
    @NotNull(message = "Owner Email is mandatory")
    @NotNull(message = "Owner Email cannot be empty")
    @Size(min = 1, max = 50, message = "Owner Email should be b/t 1to50 characters in length")
    private String ownerEmail;
    @NotNull(message = "Name is required field")
    private String ownerName;
    @NotNull(message = "password is mandatory")
    private String password;
    @NotNull(message = "Phone Number is mandatory")
    @Size(min = 9, message = "Not avalid phone number")
    private String phone;
    @NotNull(message = "Adhaar registration is mandatory")
    @Size(min = 8, message = "Not a valid adhaar number")

    private String adhaar;
}
