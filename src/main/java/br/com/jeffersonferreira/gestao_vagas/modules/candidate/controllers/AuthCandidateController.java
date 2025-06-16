package br.com.jeffersonferreira.gestao_vagas.modules.candidate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jeffersonferreira.gestao_vagas.modules.company.dto.AuthCompanyDTO;
import br.com.jeffersonferreira.gestao_vagas.modules.company.use_cases.AuthCompanyUseCase;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Controller
@RestController("/auth")
public class AuthCandidateController {
  @Autowired
  private AuthCompanyUseCase authCompanyUseCase;

  @PostMapping("/candidate")
  public ResponseEntity<Object> create(@RequestBody AuthCompanyDTO authCompanyDTO) {
    try {
      var result = authCompanyUseCase.execute(authCompanyDTO);
      return ResponseEntity.ok(result);
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
    }
  }

}
