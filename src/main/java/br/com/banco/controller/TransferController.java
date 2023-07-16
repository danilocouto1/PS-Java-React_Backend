package br.com.banco.controller;

import br.com.banco.dto.TransferResponse;
import br.com.banco.service.TransferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transferencia")
public class TransferController {

    private TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @GetMapping
    public ResponseEntity<List<TransferResponse>> getAll() {
        return ResponseEntity.ok().body(transferService.getAll());
    }
}
