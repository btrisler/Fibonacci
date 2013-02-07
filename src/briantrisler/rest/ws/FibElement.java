package briantrisler.rest.ws;

import javax.xml.bind.annotation.XmlAttribute;
//import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="Value")
	public class FibElement {
	
		@XmlAttribute(required=true)
		protected int index;
		
		@XmlValue
		protected String val;
		
		public FibElement() {
			index = 0;
			val = "0";
		}
		
		public FibElement(int i, String v) {
			index = i;
			val = v;
		}
		
		public FibElement(int i, int v) {
			index = i;
			val = Integer.toString(v);
		}
		
		String getFValue() {
			return val;
		}
		
		int getFIndex() {
			return index;
		}
		
		void setFValue(String v) {
			val = v;
		}
		
		void setFValue(int v) {
			val = Integer.toString(v);
		}
		
		void setIndex(int i) {
			index = i;
		}
	}