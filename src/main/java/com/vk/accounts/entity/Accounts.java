package com.vk.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Accounts extends BaseEntity{


    @Id
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
    private Long customerId;
}
