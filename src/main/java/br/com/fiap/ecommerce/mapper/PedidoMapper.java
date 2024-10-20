package br.com.fiap.ecommerce.mapper;

import br.com.fiap.ecommerce.dtos.*;
import br.com.fiap.ecommerce.model.Pedido;
import br.com.fiap.ecommerce.model.Produto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PedidoMapper {
    
    @Autowired
    private  ModelMapper modelMapper;

    public PedidoResponseDto toDto(Pedido pedido) {
        return modelMapper.map(pedido, PedidoResponseDto.class);
    }

    public Pedido toModel(PedidoRequestCreateDto dto) {
        return modelMapper.map(dto, Pedido.class);
    }

    public Pedido toModel(Long id, PedidoRequestUpdateDto dto) {
        Pedido result = modelMapper.map(dto, Pedido.class);
        result.setId(id);
        return result;
    }
}
