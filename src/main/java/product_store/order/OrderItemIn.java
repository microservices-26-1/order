package product_store.order;

import lombok.Builder;

@Builder
public record OrderItemIn(

    String idProduct,
    Integer quantity

) {
    
}