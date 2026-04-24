package sem2.Model;

public class RepairTask {

	private String description;

	private int cost;

	public int getCost() {
		return 0;
	}

	public void RepairTask(String description, int cost) {

	}

	public class RepairOrder {

		private int id;

		private Date date;

		private String problemDescription;

		private String state;

		private Date estimatedCompletionDate;

		public void addRepairTask(RepairTask task) {

		}

		public void setEstimatedCompletionDate(Date date) {

		}

		public void accept() {

		}

		public void reject() {

		}

		public int getTotalCost() {
			return 0;
		}

		public void addDiagnosticReport(DiagnosticReport report) {

		}

	}

}
