package br.com.banco.dto;

import br.com.banco.entity.Transfer;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class TransferResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private LocalDate dados;
    private BigDecimal valencia;
    private String tipo;
    private String nomeOperadorTransacionado;

    public TransferResponse(Transfer transfer) {
        this.id = transfer.getId();
        this.dados = transfer.getDataTransferencia().toLocalDate();
        this.valencia = transfer.getValor();
        this.tipo = transfer.getTipo();
        this.nomeOperadorTransacionado = transfer.getNomeOperadorTransacao();
    }
}
