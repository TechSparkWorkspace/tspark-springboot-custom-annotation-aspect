package org.techspark.portfolio.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.techspark.portfolio.dto.StockDTO;
import org.techspark.portfolio.entity.Stock;

@Mapper
public interface StockMapper {

    StockMapper INSTANCE = Mappers.getMapper(StockMapper.class);


    StockDTO toStockDTO(Stock stock);

    Stock toStockEntity(StockDTO stockDTO);

}
