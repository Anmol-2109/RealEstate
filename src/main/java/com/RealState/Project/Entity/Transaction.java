package com.RealState.Project.Entity;


import com.RealState.Project.Entity.Type.Transactions_types;
import com.RealState.Project.Entity.Type.Transaction_Mode;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tid;  //pk

    @Column(nullable = false)
    private long amount;

    @CreationTimestamp
    private LocalDate transactionDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Transactions_types type;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Transaction_Mode mode;

    @ManyToOne(cascade = CascadeType.PERSIST,optional = false)
    @JoinColumn(name = "agent_id")   // FK column in listing_token
    private Agent agent;

    @OneToOne(cascade = CascadeType.PERSIST,optional = false,orphanRemoval = true)
    @JoinColumn(name="token_id")
    private ListingToken token;

    @ManyToOne(cascade = CascadeType.PERSIST,optional = false)
    @JoinColumn(name = "buyer_id")
    private User buyer;
}
