package entity;

import lombok.*;


@ToString
@Builder
public class CurrencyModel {
    private String symbol;
    private Integer price;
    private String timestamp;

}
