package cities;

public class City {	
	
	private String name;
	private int grandCost;
	private int sBUpCost;
	private int mBUpCost;
	private int IBupCost;
	private int CStatus;
	private int CBill;
	private String Owner;

	public City(){}
	public City(String name,int grandCost){
		this.name=name;
		this.grandCost=grandCost;
	}
	public City(String name, int grandCost, int sBUpCost, int mBUpCost, int iBupCost, int cStatus, int cBill,
			String owner) {
		super();
		this.name = name;
		this.grandCost = grandCost;
		this.sBUpCost = sBUpCost;
		this.mBUpCost = mBUpCost;
		this.IBupCost = iBupCost;
		this.CStatus = cStatus;
		this.CBill = cBill;
		this.Owner = owner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrandCost() {
		return grandCost;
	}
	public void setGrandCost(int grandCost) {
		this.grandCost = grandCost;
	}
	public int getsBUpCost() {
		return sBUpCost;
	}
	public void setsBUpCost(int sBUpCost) {
		this.sBUpCost = sBUpCost;
	}
	public int getmBUpCost() {
		return mBUpCost;
	}
	public void setmBUpCost(int mBUpCost) {
		this.mBUpCost = mBUpCost;
	}
	public int getIBupCost() {
		return IBupCost;
	}
	public void setIBupCost(int iBupCost) {
		IBupCost = iBupCost;
	}
	public int getCStatus() {
		return CStatus;
	}
	public void setCStatus(int cStatus) {
		CStatus = cStatus;
	}
	public int getCBill() {
		return CBill;
	}
	public void setCBill(int cBill) {
		CBill = cBill;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public void CreateCity(int num){
		if(num>=1&&num<=3){
			if(this.CStatus<=3){
				this.CStatus+=num;
			}
		}
	}
	public void CalBill(){
		if(this.CStatus==0)
			this.CBill=(this.grandCost)*2;
		else if(this.CStatus==1)
			this.CBill=(this.grandCost+10)*2;
		else if(this.CStatus==2)
			this.CBill=(this.grandCost+15)*2;
		else if(this.CStatus==3)
			this.CBill=(this.grandCost+20)*2;
	}
	public void UpgradeCost(){
		if(CStatus==0)
			this.sBUpCost=10;
			this.mBUpCost=15;
			this.IBupCost=20;
		if(CStatus==1)
			this.sBUpCost=15;
			this.mBUpCost=20;
		if(CStatus==2)
			this.sBUpCost=20;		
	}
}
