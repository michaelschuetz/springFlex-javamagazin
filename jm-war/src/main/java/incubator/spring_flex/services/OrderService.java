package incubator.spring_flex.services;

import incubator.spring_flex.dto.Order;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

@Service("orderService")
@RemotingDestination(channels = { "my-amf" })
public class OrderService {
    public boolean order(Order order) {
    	if(order == null || order.getOrderItems().size() == 0){
    		return false;
    	}
        return true;
    }
} 
 