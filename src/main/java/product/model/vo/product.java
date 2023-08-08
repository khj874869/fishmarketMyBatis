package product.model.vo;

public class product {
private int productNo;
private String productName;
private int productCharge;
private int oqty;
private int status;

private ProductVo item;

	public product() {}

	public product(int productNo, String productName, int productCharge, int oqty, int status, ProductVo item) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.productCharge = productCharge;
		this.oqty = oqty;
		this.status = status;
		this.item = item;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCharge() {
		return productCharge;
	}

	public void setProductCharge(int productCharge) {
		this.productCharge = productCharge;
	}

	public int getOqty() {
		return oqty;
	}

	public void setOqty(int oqty) {
		this.oqty = oqty;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public ProductVo getItem() {
		return item;
	}

	public void setItem(ProductVo item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "product [productNo=" + productNo + ", productName=" + productName + ", productCharge=" + productCharge
				+ ", oqty=" + oqty + ", status=" + status + ", item=" + item + "]";
	}
	
	
}
