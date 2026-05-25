package product_store.order;

import product_store.product.ProductDTO;

import lombok.Builder;

@Builder
public record OrderItemOut (
    String id,
    ProductDTO product,
    Integer quantity,
    Float total

) {}
