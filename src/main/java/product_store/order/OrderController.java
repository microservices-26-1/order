package product_store.order;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
    name="order",
    url="http://order:8080"
)
public interface OrderController {

    @PostMapping("/orders")
    public ResponseEntity<Void> create(
        @RequestBody OrderIn in,
        @RequestHeader(value = "id-account", required = true) String idAccount
    );

    @GetMapping("/orders")
    public ResponseEntity<List<OrderOut>> healthCheck();

    @GetMapping("/orders")
    public ResponseEntity<List<OrderOut>> findAll();

    @GetMapping("/orders/{id}")
    public ResponseEntity<List<OrderOut>> findById(
        @PathVariable String id
    );

}