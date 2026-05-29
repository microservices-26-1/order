package product_store.order;

import java.util.List;

import lombok.Builder;

@Builder
public record OrderIn(

    List<OrderItemIn> items

) {
    
}
