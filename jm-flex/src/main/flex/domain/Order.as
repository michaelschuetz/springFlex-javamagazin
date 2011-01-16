package domain
{
	import mx.collections.ArrayCollection;
	import mx.collections.IList;

	[Bindable]
	[RemoteClass(alias="incubator.spring_flex.dto.Order")]
	public class Order 
	{
		private var _customer:Customer;
		private var _orderItems:IList = new ArrayCollection();
		
		// ---- Helper ----

		public function getTotalPrice(): Number {
			var sum:Number = 0;
			for each(var item:Object in _orderItems){
				sum += OrderItem(item).getTotalPrice();
			}
			return sum;
		}

		public function add(item:OrderItem) : void{
			for each(var tmpItem:Object in this._orderItems){
				if(OrderItem(tmpItem).pizza.name == item.pizza.name){
					OrderItem(tmpItem).amount += item.amount;
					return;
				}
			}
			_orderItems.addItem(item);
		}
		
		// ---- Getter & Setter ----
		
		public function get customer() : Customer {
			return this._customer;
		}
		
		public function set customer(value:Customer) : void {
			this._customer = value;
		}
		
		public function get orderItems() : IList {
			return this._orderItems;
		}
		
		public function set orderItems(value:IList) : void {
			this._orderItems = value;
		}
			
	}
}