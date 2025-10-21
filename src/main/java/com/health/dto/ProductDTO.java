package com.health.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Integer idProduct;

    @NotNull @Size(min = 3, max = 100)
    private String name;

    @NotNull @Size(max = 255)
    private String description;

    @NotNull @Size(max = 50)
    private String presentation;

    @NotNull @PositiveOrZero
    private Double unitPrice;

    @NotNull @Min(0)
    private Integer stock;

    @FutureOrPresent
    private LocalDate expired;

    @NotNull
    private Integer idCategory;

    @NotNull
    private Integer idFamily;

    @NotNull
    private Integer idLaboratory;

    private String categoryName;
    private String familyName;
    private String laboratoryName;
}
