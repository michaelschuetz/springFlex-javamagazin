package events
{
	import flash.events.Event;
	
	public class LoginEvent extends Event {
		
		public static const LOGIN:String = "login";
		
		private var _user:String;
		private var _loggedIn:Boolean;
		
		/*
		 * Konstruktor
		 */
		public function LoginEvent(type:String, bubbles:Boolean=false, cancelable:Boolean=false){
			super(type, bubbles, cancelable);
		}
		
		// ---- Getter & Setter ----
		
		public function get user():String {
			return this._user;
		}
		
		public function set user(value:String) : void {
			this._user = value;
		}
		
		public function get loggedIn():Boolean {
			return this._loggedIn;
		}
		
		public function set loggedIn(value:Boolean) : void {
			this._loggedIn = value;
		}
	}

}