package org.sid.ebankingbackend.dtos;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
public class DebitDTO {
    @NotBlank(message = "Account ID cannot be empty")
    private String accountId;
    
    @NotNull(message = "Amount cannot be null")
    @Positive(message = "Amount must be positive")
    private double amount;
    
    @NotBlank(message = "Description cannot be empty")
    private String description;
}
