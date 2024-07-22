package guru.sfg.beer.inventory.service.web.mappers;

import guru.sfg.beer.inventory.service.domain.BeerInventory;
import guru.sfg.beer.inventory.service.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Created by jt on 2019-05-31.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    @Mapping(target = "version",ignore = true)
    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);

    List<BeerInventoryDto> beerInventoryListToBeerInventoryDtoList(List<BeerInventory> beerInventoryList);
    List<BeerInventory> beerInventoryDtoListToBeerInventoryList(List<BeerInventoryDto> beerInventoryDtoList);
}
