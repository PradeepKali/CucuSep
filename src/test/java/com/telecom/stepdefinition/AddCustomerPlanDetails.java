package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.telecom.objectrepository.AddTariffPlanPage;
import com.telecom.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerPlanDetails extends CommonActions {
	
	CommonActions ca = new CommonActions();
	AddTariffPlanPage a = new AddTariffPlanPage();
	
	@Given("user launches telecom application")
	public void user_launches_telecom_application() {
		 
	}

	@Given("click on the add tariff button")
	public void click_on_the_add_tariff_button() {
	ca.buttonclick(a.getAddtariffbutton());
	}

	@When("user need to fillup the fields")
	public void user_need_to_fillup_the_fields() {
		
		ca.insertvalue(a.getRent(), "5000");
		ca.insertvalue(a.getFlm(), "900");
		ca.insertvalue(a.getFim(), "800");
		ca.insertvalue(a.getFsp(), "40");
		ca.insertvalue(a.getLmc(), "5");
		ca.insertvalue(a.getIpc(), "8");
		ca.insertvalue(a.getSpc(), "7");
		}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		ca.buttonclick(a.getSubmit());
	}

	@Then("verified tariff plans added")
	public void verified_tariff_plans_added() {
		WebElement w =driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
		String t = w.getText();
	    System.out.println(t);  	
	}
	

//   @When("user need to fillup the fields by {int}d list")
//   public void user_need_to_fillup_the_fields_by_d_list(Integer int1,DataTable datas) {
//	   List<String> list = datas.asList(String.class);
//	  ca.insertvalue(a.getRent(), list.get(0));
//	  ca.insertvalue(a.getFlm(), list.get(1));
//	  ca.insertvalue(a.getFim(), list.get(2));
//	  ca.insertvalue(a.getFsp(), list.get(3));
//	  ca.insertvalue(a.getLmc(), list.get(4));
//	  ca.insertvalue(a.getIpc(), list.get(5));
//	  ca.insertvalue(a.getSpc(), list.get(6));
//		
// }
//
//	@When("user need to fillup the fields by {int}d map")
//	public void user_need_to_fillup_the_fields_by_d_map(Integer int1, DataTable datas) {
//		Map<String, String> map = datas.asMap(String.class, String.class);
//	   ca.insertvalue(a.getRent(),map.get("rent"));
//	   ca.insertvalue(a.getFlm(),map.get("flm"));
//	   ca.insertvalue(a.getFim(),map.get("fim"));
//	   ca.insertvalue(a.getFsp(),map.get("fsp"));
//	   ca.insertvalue(a.getLmc(),map.get("lmc"));
//	   ca.insertvalue(a.getIpc(),map.get("ipc"));
//	   ca.insertvalue(a.getSpc(),map.get("spc"));
//	
//	  	}



	

}
