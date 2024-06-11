package com.Java020.MonieFlex.domain.entities;

import com.Java020.MonieFlex.domain.enums.AccountType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "account_tbl")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account extends BaseClass {
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    private BigDecimal accountBalance;

    @Transient
    private String customerName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Payment> payments;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Card> cards;

    @PrePersist
    @PreUpdate
    private void updateCustomerName() {
        if (customer != null) {
            this.customerName = String.format("%s %s %s",
                    customer.getFirstName() != null ? customer.getFirstName() : "",
                    customer.getMiddleName() != null ? customer.getMiddleName() : "",
                    customer.getLastName() != null ? customer.getLastName() : "").trim();
        }
    }
}
