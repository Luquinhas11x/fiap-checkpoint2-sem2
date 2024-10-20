package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;

import lombok.Data;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import br.com.fiap.ecommerce.model.ItemPedido;


@Data
public class ItemPedidoRequestCreateDto {
	private Long idPedido;
    private Long idProduto;
    private BigDecimal quantidade;
    private BigDecimal valorTotal;
    private static final ModelMapper modelMapper = new ModelMapper();

	public ItemPedido toModel() {
		return modelMapper.map(this, ItemPedido.class);
	}

}
