package tehinternets.homepage.service;

import org.springframework.stereotype.Service;
import tehinternets.homepage.domain.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getUserByNameSurname (List<User> list, String searchQuery) {
        List<User> found = new ArrayList<>();
        for (User element : list) {
            if (element.getName().matches(searchQuery) || element.getName().matches(searchQuery)) {
                found.add(element);
            }
        }

        return found;
    }
}
