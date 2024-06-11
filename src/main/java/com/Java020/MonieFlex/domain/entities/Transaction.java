package com.Java020.MonieFlex.domain.entities;

import com.Java020.MonieFlex.domain.enums.BillerType;
import com.Java020.MonieFlex.domain.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction_tbl")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Transaction extends BaseClass {
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    private String debitAccountNumber;
    private String debitBankName;
    private String creditedBankCode;
    private String creditedBankName;
    private String creditedBankAccountNumber;
    private String billerCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "biller_type")
    private BillerType billerType;

    private String billerName;
    private String itemCode;
    private String labelName;
    private String networkType;
    private String phoneNumber;
    private String meterNumber;
    private String meterAccountName;
    private String smartCardNumber;
    private String reference;
    private BigDecimal amount;
    private String narration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "beneficiary_id")
    private Beneficiary beneficiary;
}
