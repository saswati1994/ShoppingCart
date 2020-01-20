package com.eatza.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eatza.order.dto.ItemFetchDto;
//@Component
@FeignClient("restaurantsearchservice")
@RequestMapping("/item")

public interface RestaurantServiceClient {
	@GetMapping(value = "/id/{itemId}" )
	ItemFetchDto getMenuItemById(@PathVariable ("itemId") long itemId);

}
