package ru.oneicon.oi_spring_rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.oneicon.oi_spring_rest.exceptions.IconNotFoundException;
import ru.oneicon.oi_spring_rest.model.Icon;
import ru.oneicon.oi_spring_rest.repository.IconRepository;

import java.util.List;
import java.util.UUID;

@Transactional
@Service
public class IconService {
    private final IconRepository iconRepository;

    @Autowired
    public IconService(IconRepository iconRepository) {
        this.iconRepository = iconRepository;
    }

    public Icon addIcon(Icon icon) {
        icon.setIconCode(UUID.randomUUID().toString());
        return iconRepository.save(icon);
    }

    public List<Icon> findAllIcons() {
        return iconRepository.findAll();
    }

    //метод нуждается в проверке
    public List<Icon> findIconsByCategoryId(Long category_id) {
        return iconRepository.findAllById(category_id);
    }

    public Icon updateIcon(Icon icon) {
        return iconRepository.save(icon);
    }

    public Icon findIconById(Long id) {
        return iconRepository.findIconById(id).orElseThrow(
                () -> new IconNotFoundException("Icon by this" + id + "was not found"));

    }

    public void deleteIconById(Long id) {
        iconRepository.deleteIconById(id);
    }
}
