package br.com.jeffersonferreira.gestao_vagas.modules.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jeffersonferreira.gestao_vagas.modules.company.dto.AuthCompanyDTO;
import br.com.jeffersonferreira.gestao_vagas.modules.company.use_cases.AuthCompanyUseCase;

@Controller
@RestController("/auth")
public class AuthCompanyController {
  @Autowired
  private AuthCompanyUseCase authCompanyUseCase;

  @PostMapping("/auth")
  public ResponseEntity<Object> create(@RequestBody AuthCompanyDTO authCompanyDTO) {
    try {
      var result = authCompanyUseCase.execute(authCompanyDTO);
      return ResponseEntity.ok(result);
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
    }
  }
}
