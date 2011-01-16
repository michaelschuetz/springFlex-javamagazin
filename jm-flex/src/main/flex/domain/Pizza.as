package domain
{
	[Bindable]
	[RemoteClass(alias="incubator.spring_flex.dto.Pizza")]
	public class Pizza
	{
		private var _name:String;
		private var _price:Number;
		
		// ---- Getter & Setter ----
		
		public function get name() : String {
			return this._name;
		}
		
		public function set name(value:String) : void {
			this._name = value;
		}
		
		public function get price() : Number {
			return this._price;
		}
		
		public function set price(value:Number) : void {
			this._price = value;
		}
			
	}
}