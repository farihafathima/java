package cgg.labstreamapi;

public class Country {

		private int countryId;
		private String country;
		
		public Country(int countryId, String country) {
			super();
			this.countryId = countryId;
			this.country = country;
		}
		public int getCountryId() {
			return countryId;
		}
		public String getCountry() {
			return country;
		}
		public void setCountryId(int countryId) {
			this.countryId = countryId;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		@Override
		public String toString() {
			return "Country [countryId=" + countryId + ", country=" + country + "]";
		}
		
		
		
		
		
		

	

}
