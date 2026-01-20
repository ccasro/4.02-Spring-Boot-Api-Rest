package cat.itacademy.s04.s02.n01.fruit.controller;


import cat.itacademy.s04.s02.n01.fruit.dto.FruitRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fruits")
public class FruitController {

    @PostMapping
    public ResponseEntity<Void> createFruit(@Valid @RequestBody FruitRequestDTO request) {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
