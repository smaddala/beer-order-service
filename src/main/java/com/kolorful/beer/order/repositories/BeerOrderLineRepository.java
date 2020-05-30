package com.kolorful.beer.order.repositories;

import com.kolorful.beer.order.domain.BeerOrderLine;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {
	
}