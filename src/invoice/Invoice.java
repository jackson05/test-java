package invoice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Invoice {
	
	private Date invoicedate;
	public Date getInvoicedate() {
		return invoicedate;
	}
	public void setInvoicedate(Date invoicedate) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	    Date firstDate;
		try {
			String f=sdf.format(new Date());
			firstDate = sdf.parse(f);
			String s=sdf.format(invoicedate);
			 Date secondDate = sdf.parse(s);
			 long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
			 long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
			if(diff>=0) {
				this.invoicedate=invoicedate;
			}else {
				System.out.println("la date est du futur");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.invoicedate = invoicedate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public int getCurrency() {
		return currency;
	}
	public void setCurrency(int currency) {
		this.currency = currency;
	}
	private int amount, patientid, currency;
	
	

}
