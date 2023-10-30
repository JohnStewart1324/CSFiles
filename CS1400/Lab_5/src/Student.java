
public class Student {

		double sGrade;
		String sFirstname, sLastname;
		String sBroncoId;
		String sfullName;
		
		public Student(String sFirstname, String sLastname, String sBroncoId, Double sGrade) {
			this.sFirstname = sFirstname;
			this.sLastname = sLastname;
			this.sfullName = this.getFullName();
			this.sBroncoId = sBroncoId;
			this.sGrade = -1;
		}

		public String toString() {
	        return String.format("Student: %s, Bronco ID: %s, Grade: %s",
	                this.getFullName(), sBroncoId, sGrade);
	    }
		
		public double getGrade() {
			return sGrade;
		}
		public String getFullName() {
			return sFirstname + " " + sLastname;
		}
		public String getBroncoId() {
			return sBroncoId;
		}
		public void setGrade(double sGrade) {
			this.sGrade = sGrade;
		}
		public void setFirstName(String sFirstname) {
			this.sFirstname = sFirstname;
		}
		public void setLastName(String sLastname) {
			this.sLastname = sLastname;
		}
		public void setBroncoId(String sBroncoId) {
			this.sBroncoId = sBroncoId;
		}
}
