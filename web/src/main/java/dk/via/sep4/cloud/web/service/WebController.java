package dk.via.sep4.cloud.web.service;

import dk.via.sep4.cloud.web.data.WebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * This class is used to create a REST API for the web application.
 * It gets the data from the database and returns it as JSON objects upon request.
 * ResponseEntity is used to return the data as an HTTP response.
 */
@RestController
@RequestMapping()
public class WebController {
    private final WebRepository repository;

    @Autowired
    public WebController(WebRepository webRepository) {
        repository = webRepository;
    }

    @GetMapping("/readings")
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000"})
    public ResponseEntity<String> getReadings() {
        return ResponseEntity.ok(repository.getReadings());
    }

    @GetMapping("/limits")
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000"})
    public ResponseEntity<String> getLimits() {
        return ResponseEntity.ok(repository.getLimits());
    }
}
