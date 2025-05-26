package edu.gus.kanbanapi.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "tb_column")
public class StatusColumn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "column", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Card> cards;

    @ManyToOne
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;
}
