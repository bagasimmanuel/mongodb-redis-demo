package com.example.springbootdatamongodbandrediscache.web.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponse {

  private String id;

  private String name;

  private double price;

  private int stock;
}
