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

    public Card() {
    }

    public Card(String title, String description, boolean locked, String log, int position, LocalDateTime createDate, StatusColumn column) {
        this.title = title;
        this.description = description;
        this.locked = locked;
        this.log = log;
        this.position = position;
        this.createDate = createDate;
        this.column = column;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public StatusColumn getColumn() {
        return column;
    }

    public void setColumn(StatusColumn column) {
        this.column = column;
    }
}
