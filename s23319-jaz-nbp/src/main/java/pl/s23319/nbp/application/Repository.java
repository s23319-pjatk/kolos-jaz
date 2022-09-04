package pl.s23319.nbp.application;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Repository extends JpaRepository<NbpEntity,Long> {
}