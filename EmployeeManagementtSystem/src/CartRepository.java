import java.io.IOException;
import java.util.List;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.repository.Orders;

public interface CartRepository {
	
	
	public String add Cart(Orders orders);
	public String deleteOrdersById(String id)throws IdNotFoundException, IOException;;
	public void deleteAllOrders();
	public Orders getOrdersById(String id) throws IdNotFoundException, IOException;
	public List<Orders> getOrders();
	public String updateOrders(String id, Orders Orders)throws IdNotFoundException, IOException;
	public boolean isOrdersExist(String id);
	}

	

}
