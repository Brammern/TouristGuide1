package tourism.repository;


import org.springframework.stereotype.Repository;
import tourism.model.touristAttraction;

import java.util.ArrayList;
import java.util.List;

@Repository
public class touristRepository {
    private final List<touristAttraction> attractions = new ArrayList<>();


    public touristRepository() {
        attractions.add(new touristAttraction("Tivoli ",
                "An amusement park in the middle of Copenhagen"));

        attractions.add(new touristAttraction("The Little Mermaid Statue ",
                "A statue depicting the little mermaid"));

        attractions.add(new touristAttraction("Rosenborg Castle",
                "A renaissance castle built in the early 1600s"));
    }

    public List<touristAttraction> getAllAttractions() {
        return new ArrayList<>(attractions);
    }


    public touristAttraction getAttractionByName(String name) {
        for (touristAttraction attraction : attractions) {
            if (attraction.getName().equalsIgnoreCase(name)) {
                return attraction;
            }
        }
        return null;
    }


    public void addAttraction(touristAttraction attraction) {
        attractions.add(attraction);
    }


    public boolean updateAttraction(String name, touristAttraction updatedAttraction) {
        for (int i = 0; i < attractions.size(); i++) {
            if (attractions.get(i).getName().equalsIgnoreCase(name)) {
                attractions.set(i, updatedAttraction);
                return true;
            }
        }
        return false;
    }


    public boolean deleteAttraction(String name) {
        for (int i = 0; i < attractions.size(); i++) {
            if (attractions.get(i).getName().equalsIgnoreCase(name)) {
                attractions.remove(i);
                return true;
            }
        }
        return false;
    }
}