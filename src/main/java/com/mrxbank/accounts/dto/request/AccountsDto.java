package com.mrxbank.accounts.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    public AccountsDto(Long accountNumber, String accountType, String branchAddress) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.branchAddress = branchAddress;
    }

    public AccountsDto() {
    }

    // Account Number
    @Pattern(regexp="(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    @Schema(description = "Account Number of MrxBank account", example = "3454433243")
    private Long accountNumber;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Account Type
    @NotEmpty(message = "AccountType can not be a null or empty")
    @Schema(description = "Account type of MrxBank account", example = "Savings")
    private String accountType;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // Branch Address
    @NotEmpty(message = "BranchAddress can not be a null or empty")
    @Schema(description = "MrxBank branch address", example = "123 NewYork")
    private String branchAddress;

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }
}
