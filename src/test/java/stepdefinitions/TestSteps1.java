package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.reports.*;

import static webdriver.AppDriver.driver;
public class TestSteps1 {

    @When("^user open class wise student details$")
    public void user_open_class_wise_student_details() throws Throwable {
        new ClassWiseStudentDetails(driver).openClassWiseStudentDetails();
    }

    @When("^select school with index \"([^\"]*)\" on class wise student details$")
    public void select_school_with_index_on_class_wise_student_details(int arg1) throws Throwable {
        new ClassWiseStudentDetails(driver).selectSchool(arg1);
    }

    @When("^select class with index \"([^\"]*)\" on class wise student details$")
    public void select_class_with_index_on_class_wise_student_details(int arg1) throws Throwable {
        new ClassWiseStudentDetails(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on class wise student details$")
    public void select_section_with_index_on_class_wise_student_details(int arg1) throws Throwable {
        new ClassWiseStudentDetails(driver).selectSection(arg1);
    }

    @Then("^click show on class wise student details$")
    public void click_show_on_class_wise_student_details() throws Throwable {
        new ClassWiseStudentDetails(driver).clickShow();
    }

    @When("^select day scholar or boarding on class wise student details$")
    public void select_day_scholar_or_boarding_on_class_wise_student_details() throws Throwable {
        new ClassWiseStudentDetails(driver).selectDayScholarBoarding();
    }

    @When("^select show roll no on class wise student details$")
    public void select_show_roll_no_on_class_wise_student_details() throws Throwable {
        new ClassWiseStudentDetails(driver).selectShowRollNo();
    }

//class section transfer report
    @When("^user open class section transfer report$")
    public void user_open_class_section_transfer_report() throws Throwable {
        new ClassSectionTransferReport(driver).openClassSectionTransferReport();
    }

    @When("^select class with index \"([^\"]*)\" on class section transfer report$")
    public void select_class_with_index_on_class_section_transfer_report(int arg1) throws Throwable {
        new ClassSectionTransferReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on class section transfer report$")
    public void select_section_with_index_on_class_section_transfer_report(int arg1) throws Throwable {
        new ClassSectionTransferReport(driver).selectSection(arg1);
    }

    @When("^select old academic year with index \"([^\"]*)\" on class section transfer report$")
    public void select_old_academic_year_with_index_on_class_section_transfer_report(int arg1) throws Throwable {
        new ClassSectionTransferReport(driver).selectOldAcademicYear(arg1);
    }

    @When("^select old financial year with index \"([^\"]*)\" on class section transfer report$")
    public void select_old_financial_year_with_index_on_class_section_transfer_report(int arg1) throws Throwable {
        new ClassSectionTransferReport(driver).selectOldFinancialYear(arg1);
    }

    @Then("^click show on class section transfer report$")
    public void click_show_on_class_section_transfer_report() throws Throwable {
        new ClassSectionTransferReport(driver).clickShow();
    }

//class wise sibling
    @When("^user open class wise sibling$")
    public void user_open_class_wise_sibling() throws Throwable {
        new ClassWiseSibling(driver).openClassWiseSibling();
    }

    @When("^select class with index \"([^\"]*)\" on class wise sibling$")
    public void select_class_with_index_on_class_wise_sibling(int arg1) throws Throwable {
        new ClassWiseSibling(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on class wise sibling$")
    public void select_section_with_index_on_class_wise_sibling(int arg1) throws Throwable {
        new ClassWiseSibling(driver).selectSection(arg1);
    }

    @Then("^click show on class wise sibling$")
    public void click_show_on_class_wise_sibling() throws Throwable {
       new ClassWiseSibling(driver).clickShow();
    }

//class wise mark list
    @When("^user open class wise mark list$")
    public void user_open_class_wise_mark_list() throws Throwable {
        new ClassWiseMarkList(driver).openClassWiseMarkList();
    }

    @When("^select class with index \"([^\"]*)\" on class wise mark list$")
    public void select_class_with_index_on_class_wise_mark_list(int arg1) throws Throwable {
        new ClassWiseMarkList(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on class wise mark list$")
    public void select_section_with_index_on_class_wise_mark_list(int arg1) throws Throwable {
        new ClassWiseMarkList(driver).selectSection(arg1);
    }

    @When("^select order by with index \"([^\"]*)\" on class wise mark list$")
    public void select_order_by_with_index_on_class_wise_mark_list(int arg1) throws Throwable {
        new ClassWiseMarkList(driver).selectOrderBy(arg1);
    }

    @Then("^click show on class wise mark list$")
    public void click_show_on_class_wise_mark_list() throws Throwable {
        new ClassWiseMarkList(driver).clickShow();
    }

//student register date wise report
    @When("^user open student register date wise report$")
    public void user_open_student_register_date_wise_report() throws Throwable {
        new StudentRegisterDateWiseReport(driver).openStudentRegisterDateWiseReport();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on student register date wise report$")
    public void select_from_date_as_month_year_and_day_on_student_register_date_wise_report(String arg1, String arg2, String arg3) throws Throwable {
        new StudentRegisterDateWiseReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^select class with index \"([^\"]*)\" on student register date wise report$")
    public void select_class_with_index_on_student_register_date_wise_report(int arg1) throws Throwable {
        new StudentRegisterDateWiseReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on student register date wise report$")
    public void select_section_with_index_on_student_register_date_wise_report(int arg1) throws Throwable {
        new StudentRegisterDateWiseReport(driver).selectSection(arg1);
    }

    @Then("^click show on student register date wise report$")
    public void click_show_on_student_register_date_wise_report() throws Throwable {
        new StudentRegisterDateWiseReport(driver).clickShow();
    }

//mid year student details
    @When("^user open mid year student details$")
    public void user_open_mid_year_student_details() throws Throwable {
        new MidYearStudentDetails(driver).openMidYearStudentDetails();
    }

    @When("^select class with index \"([^\"]*)\" on mid year student details$")
    public void select_class_with_index_on_mid_year_student_details(int arg1) throws Throwable {
        new MidYearStudentDetails(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on mid year student details$")
    public void select_section_with_index_on_mid_year_student_details(int arg1) throws Throwable {
        new MidYearStudentDetails(driver).selectSection(arg1);
    }

    @Then("^click show on mid year student details$")
    public void click_show_on_mid_year_student_details() throws Throwable {
        new MidYearStudentDetails(driver).clickShow();
    }

//active inactive student details report
    @When("^user open active inactive student details report$")
    public void user_open_active_inactive_student_details_report() throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).openActiveInactiveStudentsDetailReport();
    }

    @When("^select class with index \"([^\"]*)\" on active inactive student details report$")
    public void select_class_with_index_on_active_inactive_student_details_report(int arg1) throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on active inactive student details report$")
    public void select_section_with_index_on_active_inactive_student_details_report(int arg1) throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).selectSection(arg1);
    }

    @When("^select user with index \"([^\"]*)\" on active inactive student details report$")
    public void select_user_with_index_on_active_inactive_student_details_report(int arg1) throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).selectUser(arg1);
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on active inactive student details report$")
    public void select_from_date_as_month_year_and_day_on_active_inactive_student_details_report(String arg1, String arg2, String arg3) throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click show on active inactive student details report$")
    public void click_show_on_active_inactive_student_details_report() throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).clickShow();
    }

    @When("^select radio button \"([^\"]*)\" on active inactive student details report$")
    public void select_radio_button_on_active_inactive_student_details_report(String arg1) throws Throwable {
        new ActiveInactiveStudentsDetailReport(driver).clickButton(arg1);
    }

//staff ward list report
    @When("^user open staff ward list report$")
    public void user_open_staff_ward_list_report() throws Throwable {
        new StaffWardListReport(driver).openStaffWardListReport();
    }

    @When("^select class with index \"([^\"]*)\" on staff ward list report$")
    public void select_class_with_index_on_staff_ward_list_report(int arg1) throws Throwable {
        new StaffWardListReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on staff ward list report$")
    public void select_section_with_index_on_staff_ward_list_report(int arg1) throws Throwable {
        new StaffWardListReport(driver).selectSection(arg1);
    }

    @When("^select staff type with index \"([^\"]*)\" on staff ward list report$")
    public void select_staff_type_with_index_on_staff_ward_list_report(int arg1) throws Throwable {
        new StaffWardListReport(driver).selectStaffType(arg1);
    }

    @When("^select staff name with index \"([^\"]*)\" on staff ward list report$")
    public void select_staff_name_with_index_on_staff_ward_list_report(int arg1) throws Throwable {
        new StaffWardListReport(driver).selectStaffName(arg1);
    }

    @Then("^click show on staff ward list report$")
    public void click_show_on_staff_ward_list_report() throws Throwable {
        new StaffWardListReport(driver).clickShow();
    }

//group wise student details
    @When("^user open group wise student details$")
    public void user_open_group_wise_student_details() throws Throwable {
        new GroupWiseStudentDetails(driver).openGroupWiseStudentDetails();
    }

    @When("^select class with index \"([^\"]*)\" on group wise student details$")
    public void select_class_with_index_on_group_wise_student_details(int arg1) throws Throwable {
        new GroupWiseStudentDetails(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on group wise student details$")
    public void select_section_with_index_on_group_wise_student_details(int arg1) throws Throwable {
        new GroupWiseStudentDetails(driver).selectSection(arg1);
    }

    @When("^select group with index \"([^\"]*)\" on group wise student details$")
    public void select_group_with_index_on_group_wise_student_details(int arg1) throws Throwable {
        new GroupWiseStudentDetails(driver).selectGroup(arg1);
    }

    @Then("^click show on group wise student details$")
    public void click_show_on_group_wise_student_details() throws Throwable {
         new GroupWiseStudentDetails(driver).clickShow();
    }

//sms report
    @When("^user open sms report$")
    public void user_open_sms_report() throws Throwable {
        new SmsReport(driver).openSmsReport();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on sms report$")
    public void select_from_date_as_month_year_and_day_on_sms_report(String arg1, String arg2, String arg3) throws Throwable {
        new SmsReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^select sms type with index \"([^\"]*)\" on sms report$")
    public void select_sms_type_with_index_on_sms_report(int arg1) throws Throwable {
        new SmsReport(driver).selectSmsType(arg1);
    }

    @Then("^click show on sms report$")
    public void click_show_on_sms_report() throws Throwable {
        new SmsReport(driver).clickShow();
    }

//refund amount
    @When("^user open refund amount$")
    public void user_open_refund_amount() throws Throwable {
        new RefundAmount(driver).openRefundAmount();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on refund amount$")
    public void select_from_date_as_month_year_and_day_on_refund_amount(String arg1, String arg2, String arg3) throws Throwable {
        new RefundAmount(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^select year with index \"([^\"]*)\" on refund amount$")
    public void select_year_with_index_on_refund_amount(int arg1) throws Throwable {
        new RefundAmount(driver).selectYear(arg1);
    }

    @Then("^click show on refund amount$")
    public void click_show_on_refund_amount() throws Throwable {
        new RefundAmount(driver).clickShow();
    }

//opening dues report
    @When("^user open opening dues report$")
    public void user_open_opening_dues_report() throws Throwable {
        new OpeningDuesReport(driver).openOpeningDuesReport();
    }

    @When("^select school with index \"([^\"]*)\" on opening dues report$")
    public void select_school_with_index_on_opening_dues_report(int arg1) throws Throwable {
        new OpeningDuesReport(driver).selectSchool(arg1);
    }

    @When("^select class with index \"([^\"]*)\" on opening dues report$")
    public void select_class_with_index_on_opening_dues_report(int arg1) throws Throwable {
        new OpeningDuesReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on opening dues report$")
    public void select_section_with_index_on_opening_dues_report(int arg1) throws Throwable {
        new OpeningDuesReport(driver).selectSection(arg1);
    }

    @When("^select fee type with index \"([^\"]*)\" on opening dues report$")
    public void select_fee_type_with_index_on_opening_dues_report(int arg1) throws Throwable {
        new OpeningDuesReport(driver).selectFeeType(arg1);
    }

    @When("^select installment with index \"([^\"]*)\" on opening dues report$")
    public void select_installment_with_index_on_opening_dues_report(int arg1) throws Throwable {
        new OpeningDuesReport(driver).selectInstallment(arg1);
    }

    @When("^select user with index \"([^\"]*)\" on opening dues report$")
    public void select_user_with_index_on_opening_dues_report(int arg1) throws Throwable {
        new OpeningDuesReport(driver).selectUser(arg1);
    }

    @Then("^click show on opening dues report$")
    public void click_show_on_opening_dues_report() throws Throwable {
        new OpeningDuesReport(driver).clickShow();
    }

//student health entry report
    @When("^user open student health entry report$")
    public void user_open_student_health_entry_report() throws Throwable {
        new StudentHealthEntryReport(driver).openStudentHealthEntryReport();
    }

    @When("^select class on student health entry report$")
    public void select_class_on_student_health_entry_report() throws Throwable {
        new StudentHealthEntryReport(driver).selectClass();
    }

    @Then("^click show on student health entry report$")
    public void click_show_on_student_health_entry_report() throws Throwable {
        new StudentHealthEntryReport(driver).clickShow();
    }

//transport detail
    @When("^user open transport detail$")
    public void user_open_transport_detail() throws Throwable {
        new TransportDetail(driver).openTransportDetail();
    }

    @When("^select route with index \"([^\"]*)\" on transport detail$")
    public void select_route_with_index_on_transport_detail(int arg1) throws Throwable {
        new TransportDetail(driver).selectRoute(arg1);
    }

    @When("^select stop with index \"([^\"]*)\" on transport detail$")
    public void select_stop_with_index_on_transport_detail(int arg1) throws Throwable {
        new TransportDetail(driver).selectStop(arg1);
    }

    @When("^select vehicle with index \"([^\"]*)\" on transport detail$")
    public void select_vehicle_with_index_on_transport_detail(int arg1) throws Throwable {
        new TransportDetail(driver).selectvehicle(arg1);
    }

    @When("^select class with index \"([^\"]*)\" on transport detail$")
    public void select_class_with_index_on_transport_detail(int arg1) throws Throwable {
        new TransportDetail(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on transport detail$")
    public void select_section_with_index_on_transport_detail(int arg1) throws Throwable {
        new TransportDetail(driver).selectSection(arg1);
    }

    @When("^select vendor with index \"([^\"]*)\" on transport detail$")
    public void select_vendor_with_index_on_transport_detail(int arg1) throws Throwable {
        new TransportDetail(driver).selectvendor(arg1);
    }

    @When("^select installment on transport detail$")
    public void select_installment_on_transport_detail() throws Throwable {
        new TransportDetail(driver).selectInstallment();
    }

    @Then("^click show on transport detail$")
    public void click_show_on_transport_detail() throws Throwable {
        new TransportDetail(driver).clickShow();
    }
}
