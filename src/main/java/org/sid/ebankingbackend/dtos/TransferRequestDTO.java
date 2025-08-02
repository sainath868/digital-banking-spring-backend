package org.sid.ebankingbackend.dtos;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
public class TransferRequestDTO {
    @NotBlank(message = "Source account ID cannot be empty")
    private String accountSource;
    
    @NotBlank(message = "Destination account ID cannot be empty")
    private String accountDestination;
    
    @NotNull(message = "Amount cannot be null")
    @Positive(message = "Amount must be positive")
    private double amount;
    
    private String description;
}
