package edu.gus.kanbanapi.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "tb_board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<StatusColumn> columns;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
