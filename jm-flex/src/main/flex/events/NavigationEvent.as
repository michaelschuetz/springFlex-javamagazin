package events {
	
	import mx.events.FlexEvent;
	
	public class NavigationEvent extends FlexEvent {
		
		public static const NAVIGATE:String = "navigate";
		
		public static const ORDERING:String = "ordering";
		public static const CUSTOMER_DATA:String = "customerData";

		public var targetPage:String = ORDERING;
		
		public function NavigationEvent(type:String, bubbles:Boolean=false, cancelable:Boolean=false) {
            super(type, bubbles, cancelable);
        }
	}
}
