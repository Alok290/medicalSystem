package com.medicalSystem.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_details", indexes = {
    @Index(name = "email", columnList = "email")
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetails {

    @Id
    @Column(name = "cid", nullable = false)
    private Integer cid;

    @Column(name = "cname", length = 100)
    private String cname;

    @Column(name = "address", columnDefinition = "TEXT")
    private String address;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "licence_no", length = 50)
    private String licenceNo;

    @Column(name = "phone", length = 15)
    private String phone;

    @Column(name = "tin_no", length = 50)
    private String tinNo;

    @Column(name = "gstin", length = 50)
    private String gstin;

    @Column(name = "pincode", length = 50)
    private String pincode;
}
