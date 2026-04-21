package com.medicalSystem.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bank_account")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bankid", nullable = false)
    private Integer bankid;

    @Column(name = "name")
    private Integer name;

    @Column(name = "accountno")
    private Integer accountno;

    @Column(name = "ifsc_code")
    private Integer ifscCode;
}
