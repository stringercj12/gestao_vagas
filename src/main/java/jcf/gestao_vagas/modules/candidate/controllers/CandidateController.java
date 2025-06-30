package jcf.gestao_vagas.modules.candidate.controllers;


import jakarta.validation.Valid;
import jcf.gestao_vagas.modules.candidate.CandidateEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cnadidate")
public class CandidateController {

  @PostMapping
  public void create(@Valid @RequestBody CandidateEntity candidateEntity){

  }
}
