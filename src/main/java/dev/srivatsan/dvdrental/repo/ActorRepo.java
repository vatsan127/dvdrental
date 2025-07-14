package dev.srivatsan.dvdrental.repo;

import dev.srivatsan.dvdrental.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepo extends JpaRepository<Actor, Integer> {
}
