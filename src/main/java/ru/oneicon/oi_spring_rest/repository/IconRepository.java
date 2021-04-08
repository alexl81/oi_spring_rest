package ru.oneicon.oi_spring_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.oneicon.oi_spring_rest.model.Icon;

import java.util.List;
import java.util.Optional;

public interface IconRepository extends JpaRepository<Icon, Long> {

    List<Icon> findAllById(Long category_id);

    Optional<Icon> findIconById(Long id);

    void deleteIconById(Long id);
}
