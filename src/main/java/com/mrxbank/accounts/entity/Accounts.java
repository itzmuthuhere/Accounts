package com.mrxbank.accounts.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import com.mrxbank.accounts.enums.AccountType;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "accounts",
        indexes = {
                @Index(name = "idx_customer_id", columnList = "customer_id"),
                @Index(name = "idx_account_number", columnList = "account_number")
        }
)
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Accounts extends BaseEntity {

    @NotNull(message = "Customer ID cannot be null")
    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Id
    @Column(name = "account_number", nullable = false, unique = true)
    private Long accountNumber;

    @NotNull(message = "Account Type cannot be null")
    @Enumerated(EnumType.STRING)
    @Column(name = "account_type", nullable = false)
    private AccountType accountType;

    @NotNull(message = "Branch Address cannot be null")
    @Size(max = 255, message = "Branch Address cannot exceed 255 characters")
    @Column(name = "branch_address", nullable = false)
    private String branchAddress;


}
