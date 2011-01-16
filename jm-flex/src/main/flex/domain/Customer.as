package domain
{
	import mx.formatters.DateFormatter;

	[Bindable]
	[RemoteClass(alias="incubator.spring_flex.dto.Customer")]
	public class Customer
	{
		
		public var firstname:String;
		public var lastname:String;
		public var birthdate:Date;
		public var phone:String;
		public var street:String;
		public var postal:String;
		public var city:String;
		public var newsletter:Boolean; 
		
		public function Customer(){
			//
		}
		
		public function get fullName() : String {
			return firstname + " " + lastname;
		}
		
		public function get formattedBirthday() : String {
			if(birthdate == null){
				return "";
			}
			var df:DateFormatter = new DateFormatter();
			df.formatString = "DD.MM.YYYY";
			return df.format(birthdate);
		}
	}
}