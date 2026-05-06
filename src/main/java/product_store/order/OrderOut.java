package product_store.order;

import lombok.Builder;
import java.util.List;

@Builder
public record OrderOut(

    String id,
    String date,
    List<OrderItemOut> items,
    Float total

) {
    
}