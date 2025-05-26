package edu.gus.kanbanapi.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String title;
    private String description;
    @Column(nullable = false)
    private boolean locked;
    private String log;
    private int position;
    @Column(nullable = false)
    private LocalDateTime createDate;

    @ManyToOne
    @JoinColumn(name = "column_id", nullable = false)
    private StatusColumn column;
}
