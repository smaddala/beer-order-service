package com.kolorful.beer.order.web.mappers;

import com.kolorful.beer.order.domain.BeerOrderLine;
import com.kolorful.beer.order.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}