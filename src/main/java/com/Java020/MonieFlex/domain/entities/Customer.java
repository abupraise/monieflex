package com.Java020.MonieFlex.domain.entities;

import com.Java020.MonieFlex.domain.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "customer_tbl")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer extends BaseClass {
    private String BVN;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String email;
    private String password;
    private String transactionPin;

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Account> accounts;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Beneficiary> beneficiaries;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Issues> issues;
}
