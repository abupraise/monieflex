package com.Java020.MonieFlex.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "confirmation_token_tbl")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConfirmationToken extends BaseClass{
    private String token;
    private LocalDateTime expiredAt;
    private LocalDateTime confirmedAt;

    @PrePersist
    protected void onCreate() {
        this.expiredAt = LocalDateTime.now().plusDays(1); // 24 hours later
        this.confirmedAt = null;
    }

    @PreUpdate
    protected void onConfirm() {
        if (this.confirmedAt != null) {
            return; // confirmedAt already set, no need to update
        }
        this.confirmedAt = LocalDateTime.now();
    }
}
