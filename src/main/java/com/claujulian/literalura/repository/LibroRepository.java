package com.claujulian.literalura.repository;

import com.claujulian.literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositoy extends JpaRepository<Libro, Long> {
}
