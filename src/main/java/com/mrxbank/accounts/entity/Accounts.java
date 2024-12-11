package com.mrxbank.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import com.mrxbank.accounts.enums.AccountType;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {

    @Column(name="customer_id")
    private Long customerId;

    @Column(name="account_number")
    @Id
    private Long accountNumber;

    @Column(name = "account_type", nullable = false)
//    @Enumerated(EnumType.STRING)
    private String accountType;

    @Column(name="branch_address")
    private String branchAddress;

}
