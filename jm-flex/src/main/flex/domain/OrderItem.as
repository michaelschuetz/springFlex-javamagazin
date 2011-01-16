package domain
{
	[Bindable]
	[RemoteClass(alias="incubator.spring_flex.dto.OrderItem")]
	public class OrderItem
	{
		private var _amount:int = 0;
		private var _pizza:Pizza;
		
		// ---- Helper ----

		public function getTotalPrice(): Number {
			return amount * pizza.price;
		}
		
		// ---- Getter & Setter ----
		
		public function get amount() : int {
			return this._amount;
		}
		
		public function set amount(value:int) : void {
			this._amount = value;
		}
		
		public function get pizza() : Pizza {
			return this._pizza;
		}
		
		public function set pizza(value:Pizza) : void {
			this._pizza = value;
		}
			
	}
}