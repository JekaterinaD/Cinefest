package be.vdab.cinefest.services;

import be.vdab.cinefest.repositories.FilmRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class FilmServices {
    private final FilmRepository filmRepository;

    public FilmServices(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    public long findTotaalVrijePlaatsen() {
        return filmRepository.findTotaalVrijePlaatsen();
    }
}


