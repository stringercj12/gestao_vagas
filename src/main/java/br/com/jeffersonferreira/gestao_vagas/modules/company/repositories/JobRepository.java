package br.com.jeffersonferreira.gestao_vagas.modules.company.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jeffersonferreira.gestao_vagas.modules.company.entities.JobEntity;

@Repository
public interface JobRepository extends JpaRepository<JobEntity, UUID> {
  List<JobEntity> findByDescriptionContainingIgnoreCase(String title);

  List<JobEntity> findByCompanyId(UUID companyId);
}
