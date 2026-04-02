package com.RealState.Project.Entity;

import com.RealState.Project.Entity.Type.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString
public class Agent{
    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name="agent_id")
    private User user;

    @Column(nullable = false)
    private float commissionRate;

    @Column(nullable = false)
    private String licenceNumber;

    @Column(nullable = false)
    private int experience;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(cascade = CascadeType.PERSIST, optional = false)
    @JoinColumn(name="officeId")
    private Office office_id;
}
