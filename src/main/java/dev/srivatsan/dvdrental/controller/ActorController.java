package dev.srivatsan.dvdrental.controller;

import dev.srivatsan.dvdrental.entity.Actor;
import dev.srivatsan.dvdrental.repo.ActorRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/actor")
public class ActorController {

    private final ActorRepo actorRepo;

    public ActorController(ActorRepo actorRepo) {
        this.actorRepo = actorRepo;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Actor> getActorById(@PathVariable int id) {
        Optional<Actor> result = actorRepo.findById(id);
        return ResponseEntity.ok(result.get());
    }

    @PostMapping("/save")
    public ResponseEntity<Actor> saveActorDetails(@RequestBody Actor actor) {
        log.info("ActorController :: saveActorDetails :: {}",actor);
        return ResponseEntity.ok(actorRepo.save(actor));
    }

}
