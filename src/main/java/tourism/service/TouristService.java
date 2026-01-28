package tourism.service;

import tourism.model.TouristAttraction;
import tourism.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TouristService {
    private final TouristRepository repository;

    public TouristService(TouristRepository repository) {
        this.repository = repository;
    }

    public List<TouristAttraction> getAllAttractions() {
        return repository.getAllAttractions();
    }

    public Optional<TouristAttraction> getAttractionByName(String name) {
        return repository.getAttractionByName(name);
    }

    public TouristAttraction addAttraction(TouristAttraction attraction) {
        return repository.addAttraction(attraction);
    }

    public Optional<TouristAttraction> updateAttraction(String name, TouristAttraction updatedAttraction) {
        return repository.updateAttraction(name, updatedAttraction);
    }

    public boolean deleteAttraction(String name) {
        return repository.deleteAttraction(name);
    }
}
