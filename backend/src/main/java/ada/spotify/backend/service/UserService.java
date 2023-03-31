package ada.spotify.backend.service;

import ada.spotify.backend.model.playlist.Playlist;
import ada.spotify.backend.model.user.User;
import ada.spotify.backend.repository.UserRepository;

import java.util.List;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
