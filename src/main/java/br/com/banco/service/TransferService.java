package br.com.banco.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.banco.dto.TransferResponse;
import br.com.banco.entity.Transfer;
import br.com.banco.repository.TransferRepository;

@Service
public class TransferService {

    private TransferRepository transferRepository;

    public TransferService(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    @Transactional(readOnly = true)
    public List<TransferResponse> getAll() {
        List<Transfer> lista = transferRepository.findAll();
        List<TransferResponse> listaResponse = lista.stream().map(element -> new TransferResponse(element))
                .collect(Collectors.toList());
        return listaResponse;
    }
}
