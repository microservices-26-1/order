package product_store.order;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;

@Builder
public record OrderOut(
    String id,
    String date,
    List<OrderItemOut> items,
    BigDecimal total
) {}