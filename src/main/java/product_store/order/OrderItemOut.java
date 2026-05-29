package product_store.order;

import lombok.Builder;
import product_store.product.ProductDTO;

import java.math.BigDecimal;

@Builder
public record OrderItemOut(
    String id,
    ProductDTO product,
    Integer quantity,
    BigDecimal total
) {}