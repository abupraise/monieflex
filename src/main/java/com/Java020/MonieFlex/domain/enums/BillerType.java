package com.Java020.MonieFlex.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BillerType {
    UTILITY("Utility"),
    TELECOMMUNICATION("Telecommunication"),
    CABLE("Cable"),
    INTERNET("Internet"),
    GOVERNMENT("Government"),
    INSURANCE("Insurance"),
    FINANCIAL_SERVICES("Financial Services"),
    EDUCATION("Education"),
    HEALTHCARE("Healthcare"),
    ENTERTAINMENT("Entertainment");

    private final String displayName;

}

