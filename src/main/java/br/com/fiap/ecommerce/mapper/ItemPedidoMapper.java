package br.com.fiap.ecommerce.mapper;

import br.com.fiap.ecommerce.dtos.*;
import br.com.fiap.ecommerce.model.ItemPedido;
import br.com.fiap.ecommerce.model.Produto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemPedidoMapper {
    
    @Autowired
    private  ModelMapper modelMapper;

    public ItemPedidoResponseDto toDto(ItemPedido itemPedido) {
        return modelMapper.map(itemPedido, ItemPedidoResponseDto.class);
    }

    public ItemPedido toModel(ItemPedidoRequestCreateDto dto) {
        return modelMapper.map(dto, ItemPedido.class);
    }

    public ItemPedido toModel(Long id, ItemPedidoRequestUpdateDto dto) {
        ItemPedido result = modelMapper.map(dto, ItemPedido.class);
        result.setId(id);
        return result;
    }   

}
