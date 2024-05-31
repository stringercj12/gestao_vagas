package br.com.jeffersonferreira.gestao_vagas.modules.company.use_cases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jeffersonferreira.gestao_vagas.modules.company.entities.JobEntity;
import br.com.jeffersonferreira.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class CreateJobUseCase {

    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity) {
        return this.jobRepository.save(jobEntity);
    }
}
