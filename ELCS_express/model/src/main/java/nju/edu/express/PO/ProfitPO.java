package nju.edu.express.PO;
/**
 * 成本收益表－总收入totalIncome、总支出totalOutcome、总利润=总收入-总支出totalprofit
 * 
 *
 */
public class ProfitPO {

	String id;
	String totalIncome;
	String totalOutcome;
	String totalprofit;
	

	/**
	 * @param totalIncome
	 * @param totalOutcome
	 * @param totalprofit
	 */
	public ProfitPO(String totalIncome, String totalOutcome, String totalprofit) {
		super();
		this.totalIncome = totalIncome;
		this.totalOutcome = totalOutcome;
		this.totalprofit = totalprofit;
	}
	public ProfitPO(){
		
	}
	public String getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(String totalIncome) {
		this.totalIncome = totalIncome;
	}

	public String getTotalOutcome() {
		return totalOutcome;
	}

	public void setTotalOutcome(String totalOutcome) {
		this.totalOutcome = totalOutcome;
	}

	public String getTotalprofit() {
		return totalprofit;
	}

	public void setTotalprofit(String totalprofit) {
		this.totalprofit = totalprofit;
	}

	public ProfitPO(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
