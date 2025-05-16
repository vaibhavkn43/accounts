package com.vk.accounts.dto;

import lombok.Data;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Data
public class AccountsDTO {
    @NotEmpty(message = "AccountNumber can not be a null or empty")
    @Pattern(regexp="(^$|[0-9]{10})",message = "AccountNumber must be 10 digits")
    private Long accountNumber;
    @NotEmpty(message = "AccountType can not be a null or empty")
    private String accountType;
    @NotEmpty(message = "BranchAddress can not be a null or empty")
    private String branchAddress;
}
