package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;

import lombok.Data;
import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.ItemPedido;


@Data
public class ItemPedidoRequestUpdateDto {
	private Long idPedido;
    private Long idProduto;
    private BigDecimal quantidade;
    private BigDecimal valorTotal;
    private static final ModelMapper modelMapper = new ModelMapper();
	public ItemPedido toModel(Long id) {
		ItemPedido result = modelMapper.map(this, ItemPedido.class);
        result.setId(id);
        return result;
    }  
    
}
