package ar.edu.tup.programacion3.Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"createdAt","eliminado"})
@SuperBuilder
@AllArgsConstructor

public abstract class Base {
    private Long id;
    @Builder.Default
    private boolean eliminado = false;
    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

    public Base(Long id) {
        this.id = id;
    }
}
