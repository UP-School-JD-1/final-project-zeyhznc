package peopleInvolvedinOrdering;
import placingOrder.WaiterOrderInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Garsonların sipariş bilgileri şeflere (HeadWaiter) iletir.


public class HeadWaiter implements Runnable {
	List <WaiterOrderInfo> orders = Collections.synchronizedList(new ArrayList <> ());

	public HeadWaiter(int i) {
		// Restaurant.java dosyamda for döngüsünde kullandığım constructor
	}

	public List<WaiterOrderInfo> getOrders() {
		return orders;
	}

	public void setOrders(List<WaiterOrderInfo> orders) {
		this.orders = orders;
	}

	@Override
	public void run() {
		// HeadWaiter, Runnable implement ettiği için run metodunu override etmeli
		
	}
	
	

	

	
	

}
